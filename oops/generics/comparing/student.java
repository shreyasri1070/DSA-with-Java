package oops.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class student implements Comparable <student>{
    int rollno;
    float marks;

    public student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(student o) {
      int  diff=(int)(this.marks-o.marks);
        //if diff==0 : means both are equal
        //if diff <1: means o is bigger else o is smaller
        return diff;
    }

    public static void main(String[] args) {
        student kunal =new student (12,68.7f);
        student rahul =new student(5,89.4f);
        student arpit =new student(2,95.6f);
        student karan =new student(13,80.4f);
        student kohli =new student(9,98.4f);

//        if(kunal<rahul){ -- error
//            System.out.println("rahul has more marks");
//        }
        student[]list={kunal,rahul,arpit,karan,kohli};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return (int)(o1.marks-o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));
//        if(kunal.compareTo(rahul)<0){
//
//            System.out.println("Rahul has more marks");
//        }
    }



}
