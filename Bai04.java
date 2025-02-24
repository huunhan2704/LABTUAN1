import java.util.Scanner;
public class Bai04 {
    public static void main(String[]args)
    {
        double namnhuan;
        Scanner nam = new Scanner(System.in);
        System.out.println("Nhap nam can tinh: ");
        namnhuan = nam.nextDouble();
        if(namnhuan % 4 == 0 && namnhuan % 100 != 0 || namnhuan % 400 == 0)
        {
            System.out.println(namnhuan + " la nam nhuan");
        }
        else
        {
            System.out.println(namnhuan + " khong phai la nam nhuan");
        }

    }
}
