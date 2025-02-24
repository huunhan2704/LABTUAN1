import java.util.Scanner;
public class Bai10
{
    public static int demChuSo(int so) 
    {
        int dem = 0;
        while (so != 0) 
        {
            so /= 10;
            dem++;
        }
        return dem;
    }
    public static void main(String[] args) 
    {
        int so = 1234;
        int soChuSo = demChuSo(so);
        System.out.println("So chu so cua " + so + " la: " + soChuSo);
    }
}
