package LivingThings;

/**
 * Created by t00174978 on 27/10/2016.
 */
public class Shark implements Alive {
    private String name;
    private String gender;
    private int age;
    private String species;

    public Shark(String name, String gender, int age, String species){
        setName(name);
        setGender(gender);
        setAge(age);
        setSpecies(species);

    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setGender(String gender) {
        this.gender=gender;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public void setSpecies(String species) {
        this.species="Shark";
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
