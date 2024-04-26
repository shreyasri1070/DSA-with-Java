package oops.staticExamp;
//class test {
//    String name;
//
//    public test(String name) {
//        this.name = name;
//
//
//    }
//}

// class test {
//     static String name;
//
//    public test(String name) {
//        test.name = name;
//
//
//    }
//}
public class InnerClass {

// here this class is require instance of object and have their own object but not depend with the object of outer class
     static class test {
        String name;

        public test(String name) {
            this.name = name;


        }
    }

    public static void main(String[] args) {
        test a =new test("shreya");
        test b =new test("priya");
        System.out.println(a.name);
        System.out.println(b.name);


    }


    }



