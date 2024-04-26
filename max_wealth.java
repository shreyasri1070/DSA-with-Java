public class max_wealth {
    public static void main(String[] args) {
        int[][]arr={{1,2,8,9,11,3},{2,4,6,1},{2,1,3,4,5}};

       int [] wealth=maxwealth(arr);
        System.out.println((char)(wealth[1])+"is the richest person having total wealth "+wealth[0]);

    }
    static int[] maxwealth(int[][]arr){
        int max=0;
        char maxperson='A';
        for(int  i=0;i<arr.length;i++){
            int balance=0;
            for(int j=0;j<arr[i].length;j++){
                 balance=balance+arr[i][j];

            }
            char person=(char)(65+i);
            System.out.println(person+"person has"+(arr[i].length)+ "account , having total balance "+balance);
            if(max<balance){
                max=balance;
                maxperson=(char)(65+i);


            }


        }
        return new int[]{max,maxperson};
    }
}
