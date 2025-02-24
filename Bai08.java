import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so:");
        int num = scanner.nextInt();
        if (num > 9) 
        {
            int firstDigit=num;
            while (firstDigit>=10) 
            {
                firstDigit/=10;
            }
            int lastDigit=num%10;
            System.out.println("Chu so dau tien:"+firstDigit);
            System.out.println("Chu so tan cung:"+lastDigit);
        } 
        else 
        {
            System.out.println("So nhap vao phai lon hon 9");
        }
    }
}
