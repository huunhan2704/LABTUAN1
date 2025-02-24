import java.util.Scanner;
public class Bai02 {
    public static void main(String[]args)
    {
        int CD,CR;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        CD = kb.nextInt();
        System.out.println("Nhap vao chieu rong: ");
        CR = kb.nextInt();    
        if (CD>CR)
        {
            System.out.println("dien tich la : " + (CD*CR));
        }
        else
        {
            System.out.println("vui long nhap lai chieu dai lon hon chieu rong");
            System.out.println("Nhap vao chieu dai: ");
            CD = kb.nextInt();
            System.out.println("Nhap vao chieu rong: ");
            CR = kb.nextInt();
            System.out.println("Chu vi hinh chu nhat la: " + (CD*CR));
        }
    }
  
}   