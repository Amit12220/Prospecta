package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Entry;
@Repository
public interface EntryRepo extends JpaRepository<Entry, Integer>{

	public Entry findByApi(String Api);
}
