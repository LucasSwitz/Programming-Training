/**
 * Created by Administrator on 10/28/2015.
 */
public class Chicken {

    private final int numOfLegs = 2;
    private final int numOfWings = 2;
    private final boolean hasFeathers = true;
    private boolean hasParachute = true;
    private String name;
    private String pronoun;
    private boolean dead = false;
    private boolean hasEaten = false;
    private boolean popped = false;

    public enum Gender
    {
        MALE,
        FEMALE
    }

    public Chicken(String name, Gender gender) {
        this.name = name;
        System.out.println(this.name + " hatched!");

        if(gender == Gender.MALE)
        {
            pronoun = "he";
        }
        else
        {
            pronoun = "she";
        }
    }

    public void feed(int gramsOfFood) {

        if (!dead) {
            if (gramsOfFood > 100) {
                System.out.println(name + " Doesn't look very good");
                popped = true;
                kill("ate too much and popped like a balloon.");
            } else {
                System.out.println("Nom Nom Nom");
                hasEaten = true;
            }
        }
        else
        {
            System.out.println("You can't feed a dead animal, sicko");
        }
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public int getNumOfWings() {
        return numOfWings;
    }

    public boolean hasFeathers() {
        return hasFeathers;
    }

    public String getName() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

    public void toss()
    {
        if(!dead) {
            if (hasEaten) {
                System.out.println(name + " Soars through the air. \" I've never felt more alive! \"");

                if (hasParachute) {
                    System.out.println(name + " pulls the parachute, and slowly drifts down to the ground.");
                } else {
                    kill("fell like a meteor to the ground. Chicken soup!");
                }
            }
            else {
                System.out.println(name + " has to eat before he can fly!");
            }
        }
        else
        {
            System.out.println("It's against state law to throw dead animals.");
        }
    }

    private void kill(String reason)
    {
        System.out.println(name + " died because " + pronoun + " " + reason + (char)27 + "[31m RIP");
        System.out.println((char)27 + "[0m");
        dead = true;
    }
    public boolean hasParachute()
    {
        return hasParachute;
    }
    public void takeParachite()
    {
        hasParachute = false;
        System.out.println("*You take "+name+"'s parachute*");
    }
    public void giveParachute()
    {
        hasParachute = true;
        System.out.println("Thank you for the parachute!");
    }

    public void cook()
    {
        if(!dead)
        {
            System.out.println("You can't cook a live chicken, silly!");
        }
        else if (popped)
        {
            System.out.println("He body is everywhere because he exploded! I can't possible cook him now.");
        }
        else
        {
            System.out.println(name + " comes back to life as a zombie chicken and cooks YOU. Bon appetite, ass hat." + (char)27 + "[31m RIP YOU");
        }
    }
}
