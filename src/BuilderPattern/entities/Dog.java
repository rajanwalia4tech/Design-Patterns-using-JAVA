package BuilderPattern.entities;

public class Dog{
    private String name; // optional field
    private String breed; // can't change once declared
    private String gender; // can't change once declared
    private double price;

    public Dog(DogBuilder builder){
        this.name = builder.name;
        this.breed = builder.breed;
        this.price = builder.price;
        this.gender = builder.gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String toString(){
        String s = "Name : "+this.name + ", Gender : "+this.gender + ", Price : "+this.price + ", Breed : "+this.breed;
        return s;
    }

    public static class DogBuilder{
        private String name; // optional field
        private String breed; // can't change once declared
        private String gender; // can't change once declared
        private double price;

        public DogBuilder setName(String name){
            this.name = name;
            return this;
        }

        public String getName(){
            return this.name;
        }
        public DogBuilder setBreed(String breed){
            this.breed = breed;
            return this;
        }

        public String getBreed(String pug){
            return this.breed;
        }
        public DogBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public String getGender(){
            return this.gender;
        }
        public DogBuilder setPrice(Double price){
            this.price = price;
            return this;
        }

        public double getPrice(){
            return this.price;
        }
        public Dog build(){
            return new Dog(this);
        }

    }
}