import java.util.Scanner;
public class Bai01 {
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap vao ho va ten sinh vien: ");
        String ten = kb.nextLine();
        System.out.println("Nhap vao ngay sinh(yy/mm/dd): ");
        String ngaysinh = kb.nextLine();
        System.out.println("Nhap vao ma so sinh vien: ");
        String mssv = kb.nextLine();
        System.out.println("ten sv là:" + ten);
        System.out.println("ngay sinh la:" + ngaysinh);
        System.out.println("ma so sinh vien la:" + mssv);
    }

}