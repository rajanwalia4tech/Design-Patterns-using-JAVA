package BuilderPattern.client;

import BuilderPattern.entities.Dog;

public class Driver {
    public static void main(String[] args) {
        Dog dog1 = new Dog.DogBuilder().setGender("Male").setName("Jack").setBreed("pug").build();
        Dog dog2 = new Dog.DogBuilder().setGender("Female").setBreed("German").build();
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
