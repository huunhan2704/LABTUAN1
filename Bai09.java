import java.util.Scanner;
public class Bai09
{   
    public static int tong(int so) 
    {
        int sum = 0;
        while (so != 0) 
        {
            sum += so % 10;
            so /= 10;
        }
        return sum;
    }
    public static int tich(int so) 
    {
        int tich = 1;
        while (so != 0) 
        {
            tich *= so % 10;
            so /= 10;
        }
        return tich;
    }
    public static void main(String[] args) 
    {
        int so = 1234;
        int tong = tong(so);
        int tich = tich(so);
        System.out.println("Tong cac chu so cua " + so + " la: " + tong);
        System.out.println("Tich cac chu so cua " + so + " la: " + tich);
    }
}
