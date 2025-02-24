import java.util.Scanner;
public class Bai06 {
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac theo thu tu a b c:");
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.println("3 so nhap vao la 3 canh cua tam giac");
        }
        else
        {
            System.out.println("3 so nhap vao khong phai la 3 canh cua tam giac");
        }
    }
}    