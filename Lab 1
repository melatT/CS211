import java.util.Scanner;

public class Lab1 {
public static void main(String[] args) 
{ 
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine(); 
    strToBinary(s);       
}
 
public static void strToBinary(String s) 
{ 
    int n = s.length();//takes length of string
    int[] array = new int[256]; //create an array with 256 ASCII
int val =0;
    for (int i = 0; i < n; i++)  
    { 
        // convert each char to ASCII value 
          val = Integer.valueOf(s.charAt(i)); 
       
        array[val]++;
         
         
        // Convert ASCII value to binary 
        String bin = ""; 
        while (val > 0)  
        { 
            if (val % 2 == 1) 
            { 
                bin += '1'; 
            } 
            else
                bin += '0'; 
            val /= 2; 
        } 
        bin = reverse(bin); 
//print out the binary numbers
        System.out.print(bin + " "); 
         
     
} 
//how many times each letter comes up
System.out.println();
  for(int j=0;j<array.length;j++)
    {
        if(array[j]==1){
            System.out.println("'"+((char)j) + "'" + " appered 1 time");
        }     
        else if(array[j]>1)
        {
            System.out.println("'"+((char)j) + "'" + " appered " + array[j] + " times");
        }
    } 
     
     
} 

public static String reverse(String input)  
{ 
    char[] a = input.toCharArray(); //Converts this string to a new character array.
    //this array contains the character sequence represented by this string
    int l, r = 0; 
    r = a.length - 1; 
    //sorts the sentence using binary numbers
    for (l = 0; l < r; l++, r--) 
    { 
        // Swap values of l and r  
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
} 
}
