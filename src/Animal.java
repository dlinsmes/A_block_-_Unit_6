public class Animal {
    private int energy;

    public Animal(int e) {
        energy = e;
    }

    public Animal() {
        energy = 5;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int e) {
        energy = e;
    }

    public void eat() {
        System.out.println("yummers");
        energy += 5;
    }

    public void sleep() {
        System.out.println("zzzzzzzz");
        energy += 10;
    }

    //even before inheritance - every time toString()
    //is defined, it's overriding the Java Object class,
    //which every class is a subclass of

    public String toString() {
        return "I have " + energy + " energy";
    }

    //the equals() method should be overridden to
    //define whether two objects are the same

    //method header for equals should always be
    public boolean equals(Object o) {
        //check if object is right type
        if (o instanceof Animal) {
            //if o is an Animal, cast it to access
            //the animal methods/variables
            Animal a = (Animal)o;
            //two Animal objects are the same if
            //their energy values are the same
            if (a.energy == this.energy) {
                return true;
            }
        }

        //return false when o isn't an animal
        //or if the energies aren't the same
        return false;
    }

}
