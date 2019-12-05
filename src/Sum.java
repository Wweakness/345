import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=n*n;
        System.out.println(sum(n)+" "+sum(s));

    }
    public static int sum(int a){
        int p=0;
        while(a!=0) {

            p = p + a % 10;
            a = a / 10;
        }

        return p;
    }
}