package com.petshop;

    public class Animal extends Pet {
        String breed;
        String animalName;

        @Override
        public String toString() {
            return "Animal{" +
                    "breed='" + breed + '\'' +
                    ", animalName='" + animalName + '\'' +
                    ", id='" + id + '\'' +
                    ", colour=" + colour +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", price=" + price +
                    '}';
    }

        @Override
        public void eat() {

        }
    }

