// the pair number is divisible by 8 replace i+1 number in pair to 1

public class program5 {

    public static void main(String[] args) {
        int n=187839;

        String str=String.valueOf(n);
        char [] c=str.toCharArray();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<c.length-1;i+=2){
            int first=c[i]-'0';
            int second=c[i+1]-'0';
            int total=first*10+second;


            if(total%8==0){
                sb.append(first);
                sb.append('1');

            }else{
                sb.append(first);
                sb.append(second);
            }

        }
        System.out.println(sb.toString());

    }
}
