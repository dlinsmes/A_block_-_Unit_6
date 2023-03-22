public class AnimalClient {

    public static void main(String[] args) {
        Animal a = new Animal(50);
        a.sleep();

        Alligator al = new Alligator(50, 2);
        al.breakTooth();
        al.chomp();

        //objects of a child class have access to the public methods
        //of the parent class
        al.setEnergy(500);
        System.out.println(al);


        //if equals() isn't defined, this calls
        // the Object-defined equals() method
        // (like how toString() has a default implementation)
        System.out.println(al.equals(a));


        //al2 should have the same values for all instance variables as al1
        Alligator al2 = new Alligator(50, 2);
        al2.breakTooth();
        al2.chomp();
        al2.setEnergy(500);

        System.out.println("al is equal to al2: " + al.equals(al2));

        //the default equals() returns true if the references point
        //to the same object
        Alligator al3 = al;
        System.out.println("al is equal to al3: " + al.equals(al3));

        String s = "something";
        //valid method call because the param for equals is an Object, which can be anything
        System.out.println("al is equal to s: " + al.equals(s));

        System.out.println("al: "  + al.getEnergy());

        Animal a2 = new Animal(500);

        //this calls the Animal equals(), which only checks energy
        System.out.println(a2.equals(al));

        //this calls the Alligator equals(), which also checks chompiness
        //and will also catch that a2 isn't an Alligator object
        System.out.println(al.equals(a2));

    }
}