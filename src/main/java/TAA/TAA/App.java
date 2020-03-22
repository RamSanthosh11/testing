package TAA.TAA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        if(st.charAt(0)=='A' && st.charAt(1)=='A') {
        	System.out.println(st.substring(2,st.length()));
        }
        else if(st.charAt(0)=='A') {
        	System.out.println(st.substring(1,st.length()));
        }
        else if(st.charAt(1)=='A') {
        	System.out.println(st.charAt(0)+st.substring(2,st.length()));
        }
        else {
        	System.out.println(st);
        }
        
    }
}
