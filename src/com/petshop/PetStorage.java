package com.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

    public class PetStorage {

        private Set<Pet> petList = new HashSet();

        public void add(Pet pet){
            petList.add(pet);
        }

        public Set<Pet> getPetList(){
            return petList;
        }

        public void remove(Pet pet){
            petList.remove(pet);
        }

        public Pet getPet(String petID){
            for (Pet pet: petList) {
                if(petID.equals(pet.id)){
                    return pet;
                }
            }
            return null;
        }
    }
