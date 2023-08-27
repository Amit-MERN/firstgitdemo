package ifElse;
import java.util.Scanner;

public class StrInt {
    public static void main(String[] args) {
        int count =0,l;
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                l = s1.length();
                System.out.print(s1);
                for(int j=l;j<15;j++){
                    System.out.print(" ");
                }
                int temp = x;
                while(x!=0){
                    x = x / 10;
                    count++;
                }
                if(count>=3)
                System.out.println(temp);
                else
                 System.out.println("0"+temp);
            }
            System.out.println("================================");

    }
}



