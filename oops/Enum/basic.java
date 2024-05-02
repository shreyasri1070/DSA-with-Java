package oops.Enum;

public class basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constant
        //public,static,final
        //since its final you can't create child enums
        //type is week
        Week(){
            System.out.println(" constructor called for "+this);
            //this is not public or protected ,only private or default
            //wee don't want to create new objects
            //this is not the enum
            //internaally:public static final Week Monday=new Week()
        }


    }

    public static void main(String[] args) {
        Week week=Week.Monday;
//        for (Week day:Week.values()
//             ) {
//            System.out.println(day);
//
//        }
        System.out.println(Week.valueOf("Monday"));
        System.out.println(week.ordinal()); // give the position where it declared
    }
}
