package oops.Access;

public class objectDemo {
    int num;
    float gpa;

    public objectDemo(int num,float gpa) {
        this.num = num;
        this.gpa=gpa;
    }

    @Override
    public int hashCode() { // generate the rsndom value --uniquness of objects
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj);
        return this.num==((objectDemo)obj).num;
    }

    public static void main(String[] args) {
        objectDemo obj=new objectDemo(12,56f);
        objectDemo obj2=new objectDemo(12,56.3f);
        if(obj==obj2){
            System.out.println("ocj1 is equal to obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("ocj1 is equal to obj2");
        }
        //System.out.println(obj.getClass());-- data  about classes

        //System.out.println(obj instanceof Object);-- check its instancek

        // System.out.println(obj.hashCode());
    }
}
