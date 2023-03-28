public class Narwhal extends Animal{
    private boolean pointy;

    public Narwhal(){
        super(50);
        pointy = true;
    }

    public Narwhal(boolean p) {
        //in the parent class - if there's a default constructor or a no-param constructor,
        //you don't NEED to call super, and that parent class no-param constructor will
        //get called automatically
        pointy = p;

    }

    public void stab() {
        System.out.println("ouch");
    }

    //when overriding meth  ods, the method signature
    //(return type, name, params)
    public void sleep() {
        System.out.println("404 i don't sleep");
    }

    public String toString() {
        //call the parent class' toString and append more to it
        return super.toString() + ". pointy: " + pointy;
    }

    public boolean equals(Object o) {
        if (o instanceof Narwhal) {
            Narwhal other = (Narwhal)o;
            //using super lets you call the parent class version of
            //overridden methods
            //-useful if the parent class has multiple instance variables
            //to check and the parent class equals() already checks them
            if (super.equals(other) && other.pointy == this.pointy) {
                return true;
            }
        }
        return false;
    }

}
