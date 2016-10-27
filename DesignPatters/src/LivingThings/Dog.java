package LivingThings;

/**
 * Created by t00174978 on 27/10/2016.
 */
public class Dog implements Alive {
    private String name;
    private String gender;
    private int age;
    private String species;

    public Dog(String name, String gender, int age, String species){
        setName(name);
        setGender(gender);
        setAge(age);
        setSpecies(species);

    }

    public void setName(String name) {
        this.name=name;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void setSpecies(String species) {
        this.species="Dog";
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

}
