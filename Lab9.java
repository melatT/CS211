import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lab09 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
               Scanner sc = new Scanner(System.in);
          double num1 = sc.nextDouble();
            double s1 = sc.nextDouble();
              
                double num2 = sc.nextDouble(); 
                double s2 = sc.nextDouble();
    
       
        double t = Math.toRadians(num2 - num1); 
        double t1 = Math.toRadians(s2 - s1); 
  
        // convert to radians 
        num1 = Math.toRadians(num1); 
        num2 = Math.toRadians(num2); 
  
        // apply formulae 
        double a = (Math.pow(Math.sin(t/2),2)+Math.pow(Math.sin(t1/2),2)*Math.cos(num1)*Math.cos(num2));


        double c= 6371*(2 * Math.asin(Math.sqrt(a)));
        
        int j =(int) Math.round(c);
        int round = j%100/10;

        if(round>=5)
        {
        int rounded = ((j+100)/100)*100;
        System.out.println(rounded);
        }
        else{
           int rounds = ((j+10)/100)*100;
            System.out.println(rounds);
        }
        
       // int k = Math.round(j);
//int rounded = //((j+100) / 100) * 100;//(int) Math.round((k / 10.0) * 10);
        //System.out.println(round);
    }
}
