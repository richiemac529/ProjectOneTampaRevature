package com.example.dao;

import java.util.List;

import com.example.model.Expenses;


public interface ExpDao {
	
	// CREATE 
	public int submitExp(Expenses x);
	
	// READ 
	public Expenses selectPetByName(String name);
	public List<Expenses> selectAllPets();
	
	// UPDATE
	public int updatePet(Expenses x);
	
	//DELETE
	public int deletePet(Expenses x);
}


