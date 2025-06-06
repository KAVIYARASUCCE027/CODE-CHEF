import java.util.*;
public class ChefandTwoStrings {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            int len=s1.length();
            int min=0;
            int max=0;
            for(int i=0;i<len;i++){
                if(s1.charAt(i)!='?' && s2.charAt(i)!='?' && s1.charAt(i)!=s2.charAt(i)){
                    min++;


                }
            }
            for(int i=0;i<len;i++){
                if((s1.charAt(i)=='?' && s2.charAt(i)=='?') || s1.charAt(i)!=s2.charAt(i)){
                    max++;
                }
            }
            System.out.println(min+" "+max);

        }

    }
}
