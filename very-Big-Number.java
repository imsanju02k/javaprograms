import java.util.Scanner;
import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        long sum=0;
        while(n-- >0){
            sum+=obj.nextInt();
        }
        System.out.println(sum);
    }
}

