package com.masai.Service;

import java.util.List;

import com.masai.DTO.EntryDTO;
import com.masai.Exception.EntryException;
import com.masai.Model.Entry;

public interface EntryService {
	
	
	public List<EntryDTO> getByCategory(String Category) throws EntryException;
	
	public Entry registerEntry(Entry entry) throws EntryException;
	
	

}
