package ifElse;
import java.util.*;
import java.lang.Math;
//
//class ApSeriese{
//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int sum = 0,s=0;
//           for(int j=0;j<n;j++){
//        	   s = s + (int)Math.pow(2,j) * b;
//                sum = a + s;
//                System.out.print(sum + " ");
//            }
//            System.out.println("");
//        }
//        in.close();          
//    }
//}

public class ApSeriese {
	public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
      for(int i=1;scan.hasNext()==true;i++)
      {
          System.out.println(i + " " + scan.nextLine());
      }
    }
}