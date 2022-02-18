package com.springframework.pets;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("CAT")
//@Service
public class CatPetService implements PetService{

    public String getPetType(){
        return "Cats are the best!";
    }
}
