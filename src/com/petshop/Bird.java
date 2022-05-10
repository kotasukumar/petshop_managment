package com.petshop;

    public class Bird extends Pet{
        String species;
        String birdName;

        @Override
        public String toString() {
            return "Bird{" +
                    "species='" + species + '\'' +
                    ", id='" + id + '\'' +
                    ", colour='" + colour + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", price=" + price +
                    '}';
        }

        @Override
        public void eat() {

        }
    }
