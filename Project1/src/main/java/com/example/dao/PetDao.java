package com.example.dao;

import java.util.List;

import com.example.model.Pet;

public interface PetDao {


	// CREATE 
	public int insertPet(Pet p);
	
	// READ 
	public Pet selectPetByName(String fname);
	public List<Pet> selectAllPets();
	
	// UPDATE
	public int updatePet(Pet p);
	
	//DELETE
	public int deletePet(Pet p);
}
