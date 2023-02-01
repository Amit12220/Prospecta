package com.masai.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masai.DTO.EntryDTO;
import com.masai.Exception.EntryException;
import com.masai.Model.Entry;
import com.masai.Model.Information;
import com.masai.Repo.EntryRepo;

@Service
public class EntryServiceImpl implements EntryService{
	
	@Autowired
	private EntryRepo entryRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public List<EntryDTO> getByCategory(String Category) throws EntryException {
		// TODO Auto-generated method stub
		String url="https://api.publicapis.org/entries";
		Information info=restTemplate.getForObject(url,Information.class);
		
		List<EntryDTO> list=new ArrayList<>();
		for(Entry e:info.getEntries())
		{
			if(e.getCategory().equals(Category))
			{
				list.add(new EntryDTO(e.getApi(),e.getDescription()));
			}
			else
			{
				throw new EntryException("Such Category not found");
			}
		}
		
		
		return list;
	}

	@Override
	public Entry registerEntry(Entry entry) throws EntryException{
		// TODO Auto-generated method stub
		Entry ent=entryRepo.findByApi(entry.getApi());
		if(ent!=null)
		{
			throw new EntryException("Already Exist");
		}
		else
		{
			entryRepo.save(entry);
			return entry;
		}
		
	}

}
