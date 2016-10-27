package LivingThings;

/**
 * Created by t00174978 on 27/10/2016.
 */
public interface Alive {
    public void setName(String name);
    public void setGender(String gender);
    public void setAge(int age);
    public void setSpecies(String species);
    public void move(); //walk, run, fly, swim , slither
    public void eat();
    public void sleep();
}
