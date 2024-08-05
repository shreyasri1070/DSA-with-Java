package StackandQueue;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // it will call custom stack
    }
    public DynamicStack(int size){
        super(size); // it will call custom stack

    }

    public boolean push(int item){
        if(isFull()){
            //double the size if full
            int [] temp= new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }

         return super.push(item);

    }
}
