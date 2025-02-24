import java.util.Scanner;
public class Bai05 {
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap 3 so tu nhien a,b,c : ");
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();
        if(a != b && b != c && a != c)
            {
                if(a<b && a<c)
                {
                    System.out.println("So nho nhat la: " + a);
                }
                else if(b<a && b<c)
                {
                    System.out.println("So nho nhat la: " + b);
                }
                else
                {
                    System.out.println("So nho nhat la: " + c);
                }
            }
                else
            {
                System.out.println("3 so nhap vao phai khac nhau");
            }   
           
    }    
}