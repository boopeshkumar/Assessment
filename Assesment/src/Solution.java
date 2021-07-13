
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        HashMap<Integer, String>Student = new HashMap<Integer, String>();
        for(i=0;i<n;i++){
            int a = sc.nextInt();
            String s =sc.nextLine();
            Student.put(a,s);
        }
        int m= sc.nextInt();
        if(Student.get(m)==null){
            System.out.println("-1");
        }
        else{
            System.out.println(Student.get(m).trim());
        }
        
    }
}