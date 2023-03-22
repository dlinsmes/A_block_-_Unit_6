//inheritance - concept that classes can be more
//specific versions of other classes

//Alligator is a child class / subclass of Animal
//Animal is a parent class / superclass of Alligator

//Alligator can use all public methods from its parent class
//-if there are any public variables in the parent class, the child
//class also has access

public class Alligator extends Animal{

    //instance variable specific to Alligator
    private int chompiness;

    public Alligator(int c, int e) {

        //first line of child class constructor needs to be a call
        //to the parent/super class constructor using the "super" keyword
        super(e);

        //after calling the parent class constructor, instance variables
        //can be initialized
        chompiness = c;
    }

    public void breakTooth(){
        System.out.println("ouchie");
        chompiness--;
    }

    public void chomp() {
        //private variables from the parent class can't be directly accessed
        //energy += 20;

        //need to use public methods
        setEnergy(20);
        System.out.println("chomp");
    }


    //method overriding is redefining a method from the parent class
    //-when an overridden method is called, the version that's closest to
    //the object's type is run
    //-if toString() wasn't defined in Alligator, the Animal version would
    //run
    public String toString() {
        return "chomp chomp chomp I'm an alligator";
    }

    //Alligator is a child class of Animal, which is a child class of Object
    //-a child class can't have two parent classes at the same hierarchy level


    //two Alligators are the same if they're both
    //Alligator objects and have the same values for
    //chompiness and energy
    public boolean equals(Object o) {
        if (o instanceof Alligator) {
            Alligator a = (Alligator)o;
            //check the energy of both objects and the chompiness of both objects
            if (a.getEnergy() == this.getEnergy() && a.chompiness == chompiness) {
                return true;
            }
        }

        return false;
    }
}
