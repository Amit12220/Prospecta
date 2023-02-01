package com.masai.Model;

import java.util.List;

public class Information {
	
	private Integer Count;
	
	private List<Entry> entries;

	public Information(Integer count, List<Entry> entries) {
		super();
		Count = count;
		this.entries = entries;
	}

	public Information() {
		super();
	}

	public Integer getCount() {
		return Count;
	}

	public void setCount(Integer count) {
		Count = count;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	

}
