// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
class Main
{
   public static void main(String args[]) throws Exception
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter student id: ");
       String id = in.readLine();
       System.out.print("Enter student name: ");
       String name = in.readLine();
       System.out.print("Enter student semester: ");
       int semester = Integer.parseInt(in.readLine());
       System.out.print("Enter TC: ");
       int tc = Integer.parseInt(in.readLine());
       System.out.println("OUTPUT:");
       Student s = new Student(id,name,semester);
       if(tc == 1) 
           System.out.println(s);
       else if(tc == 2)
           System.out.println(s.getStudentCode());      
   }
 }
