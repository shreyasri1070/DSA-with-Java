import java.util.ArrayList;
public class check {
    public static void main(String[] args) {
        int [][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        ArrayList <Integer> li1=new ArrayList <Integer>();
        ArrayList <Integer> li2=new ArrayList <Integer>();
        ArrayList <Integer> li=new ArrayList <Integer>();



        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                if(min>matrix[i][j]){ // check minimum in row
                    min=matrix[i][j];

                }

            }
            li1.add(min);}

        for(int j=0;j<m;j++){
            int  max=0;
            for(int i=0;i<n;i++){
                if(max < matrix[i][j]){
                    max=matrix[i][j];
                }}
            li2.add(max);

        }
        for(int i=0;i<li1.size();i++){
            if(li2.contains(li1.get(i))){
                li.add(li1.get(i));
            }
        }

        System.out.println(li);


    }
}
