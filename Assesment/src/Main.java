import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
public class Main {
    
    public static void frequency(int n) {
        String s=Integer.toString(n);
        int i, m;
        m=s.length();
        int cnt[] = {0,0,0,0,0,0,0,0,0,0};
        int num[] ={0,1,2,3,4,5,6,7,8,9};
        int a, b;
        int k=n;
        for(i=0;i<m;){
            a=k%10;
            b=k/10;
            int j;
            for(j=0;j<10;j++){
                if(num[j]==a){
                    cnt[j]++;
                }
            }
            k=b;
            i++;
        }
        for(i=0;i<10;i++){
            if(cnt[i]>0){
                System.out.println(num[i]+":"+cnt[i]);
            }
        }
    }
    public static void main(String[] args) throws NumberFormatException{
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        frequency(n);
    }
}