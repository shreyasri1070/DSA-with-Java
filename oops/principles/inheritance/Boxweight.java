package oops.principles.inheritance;

public class Boxweight  extends Box{
        double weight;
        public Boxweight(){
            this.weight=-1;

        }

        public Boxweight(Boxweight other){
            super(other);
            this.weight=other.weight;
        }

    public Boxweight(double side,double weight){
        super(side);
        this.weight=weight;
    }

    public Boxweight(double l, double h, double w, double weight) {                 //alt+insert for generate
        super(l, h, w); // call the parent class constructor
        //used to initialise the parent class constructor

        //System.out.println(super.weight); // weight of parent class
        this.weight = weight;
        //super(l,w,h) //error
    }
}
