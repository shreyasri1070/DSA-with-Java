public class leetissuse {
    public static int main(String[] args) {
        String s="ghfdbj"; // used faltu ka just to avoid error
        char [] ch=s.toCharArray();
        int count=0;
        int ano=0;
        for(int i=0;i<s.length()-1;i++){
            if(ch[0]=='0'){
                ch[0]='1';
                if(ch[i]==ch[i+1]){
                    if(ch[i]=='0'){
                        ch[i+1]='1';
                        ano++;}
                    else{
                        ch[i+1]='0';
                        ano++;
                    }
                }
            }
            else{
                ch[0]='0';
                if(ch[i]==ch[i+1]){
                    if(ch[i]=='0'){
                        ch[i+1]='1';
                        ano++;}
                    else{
                        ch[i+1]='0';
                        ano++;
                    }
                }

            }

        }
        for(int i=0;i<s.length()-1;i++){

            if(ch[i]==ch[i+1]){
                if(ch[i]=='0'){
                    ch[i+1]='1';
                    count++;}
                else{
                    ch[i+1]='0';
                    count++;
                }
            }


        }
        return Math.min(count,ano);
    }

}
