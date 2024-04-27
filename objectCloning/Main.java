package objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal=new Human(34,"kunal kushwaha");
       // Human twin =new Human(kunal); // It take lots of processing time

        Human twin =(Human)kunal.clone();
        System.out.println(twin.age + " "+twin.name);
    }
}
