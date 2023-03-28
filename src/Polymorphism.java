public class Polymorphism {
    public static void main(String [] args) {
        Narwhal n = new Narwhal();
        n.stab();
        System.out.println(n);
        System.out.println();

        //declared type - left of the = - this can be a parent type of the object
        //actual type - right of the = - whatever constructor is called

        Object o = new Narwhal();
        Animal a = new Narwhal();

        //polymorphism - objects can have declared types of any parent class within
        //its hierarchy
        //-method behaviors can change if they are overridden in the child class

        //when a overridden method is called, the one that's closest to the actual type
        //is what runs
        System.out.println(o);
        System.out.println(a);
        System.out.println(n);

        //methods can only be directly called if they were defined in the declared type
        a.eat();
        n.eat();
        //eat() doesn't work from o because o's declared type is object and
        //and Object doesn't define eat()
//        o.eat();

        //cast o as an Animal or a Narwhal to use eat();
        Animal a2 = (Animal)o;
        a2.eat();

        Animal a3 = new Animal();
        //class cast exception - an animal isn't a narwhal
        //Narwhal n2 = (Narwhal)a3;

        //check if a3 is an instance of a Narwhal first so the
        //program won't crash
        if (a3 instanceof Narwhal) {
            Narwhal n2 = (Narwhal) a3;
        }

        Animal [] group = new Animal[3];
        group[0] = a3; //Animal
        group[1] = n; //Narwhal
        group[2] = new Alligator(1, 1); //Alligator

        System.out.println();
        for (Animal an: group) {
            System.out.println(an);

            //call chomp from any/all Alligators in group
            if (an instanceof Alligator) {
                Alligator al = (Alligator)an;
                al.chomp();

            }
        }
    }
}
