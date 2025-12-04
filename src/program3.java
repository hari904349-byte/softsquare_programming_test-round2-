
// find the first non duplicate character

public class program3 {

    public static void main(String[] args) {
        String str="Hello I am Hariharan";
        str=str.toLowerCase();

        int arr[]=new int[26];

        for(char c: str.toCharArray()){
            if(c!=' '){
                arr[c-'a']++;
            }
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '&& arr[str.charAt(i)-'a']==1){
                System.out.println("The first Duplicate character : "+str.charAt(i));
                return;
            }
        }
        System.out.println("No Duplicate character is found");
    }
}
