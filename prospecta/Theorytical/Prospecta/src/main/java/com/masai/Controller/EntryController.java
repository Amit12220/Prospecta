package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.DTO.EntryDTO;
import com.masai.Exception.EntryException;
import com.masai.Model.Entry;
import com.masai.Service.EntryService;

@RestController
public class EntryController {
	
	@Autowired
	private EntryService entryService;
	
	@GetMapping("/entries/{category}")
	public ResponseEntity<List<EntryDTO>> getByCategory(@PathVariable ("category") String category) throws EntryException
	{
		List<EntryDTO> list=entryService.getByCategory(category);
		
		return new ResponseEntity<List<EntryDTO>>(list,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/entries")
	public ResponseEntity<Entry> registerEntry(@RequestBody Entry entry) throws EntryException
	{
		Entry ent=entryService.registerEntry(entry);
		return new ResponseEntity<Entry>(ent,HttpStatus.CREATED);
	}
	

}
