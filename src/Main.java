import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nn=sc.nextLine();
        int n=Integer.parseInt(nn);
        String aa=sc.nextLine();
        String[] A=aa.split(" ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(A[i]);
        }
        String bb=sc.nextLine();
        String[] B=bb.split(" ");
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=Integer.parseInt(B[i]);
        }
        float[] c=new float[b.length];
        for(int i=0;i<b.length;i++){
            if(b[i]>=90&&b[i]<=100){
                c[i]=4.0f;
            }
            if(b[i]>=85&&b[i]<=89){
                c[i]=3.7f;
            }
            if(b[i]>=82&&b[i]<=84){
                c[i]=3.3f;
            }
            if(b[i]>=78&&b[i]<=81){
                c[i]=3.0f;
            }
            if(b[i]>=75&&b[i]<=77){
                c[i]=2.7f;
            }
            if(b[i]>=72&&b[i]<=74){
                c[i]=2.3f;
            }
            if(b[i]>=68&&b[i]<=71){
                c[i]=2.0f;
            }
            if(b[i]>=64&&b[i]<=67){
                c[i]=1.5f;
            }
            if(b[i]>=60&&b[i]<=63){
                c[i]=1.0f;
            }
            if(b[i]<60){
                c[i]=0f;
            }
        }
        //System.out.println(Arrays.toString(c));
        float[] s=new float[c.length];
        for(int i=0;i<c.length;i++){
            s[i]=a[i]*c[i];
        }
        float sum=0;
        int score=0;
        for(int i=0;i<s.length;i++){
            sum=sum+s[i];
            score=score+a[i];
        }
       // System.out.println(sum);
        //System.out.println(score);
        //float GPA=sum/score;
        System.out.printf(String.format("%.2f",sum/score));



    }
}