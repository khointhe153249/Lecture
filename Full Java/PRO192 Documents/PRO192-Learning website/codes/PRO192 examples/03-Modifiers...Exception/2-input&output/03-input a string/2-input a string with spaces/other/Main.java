import java.io.*;
class Main
 {public static void main(String args[])
   {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String a=null;
    System.out.print("\n Enter a string = ");
    try {a = in.readLine();} catch(Exception e) {}
    System.out.println(" A string entered is: " + a);
   }
 }