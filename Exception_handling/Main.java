package Exception_handling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
          //  int c=a/b;
          //  divide(a,b);
            //throw new Exception("just for fun");
            String name="Kunal";
            if(name.equals("Kunal")){
                throw new myException("name is kunal");
            }
        }catch (myException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception
                e){
            System.out.println("normal exception");
        }

        finally{
            System.out.println(" this will always execute");
        }

    }
    static  int divide(int a,int b) throws ArithmeticException{ //declare the exception--it may throw exception
        if(b==0){
            throw new ArithmeticException("please don't divide by zero");
        }
        return a/b;
    }
}
