import java.util.Scanner;
public class Bai03 {
    public static void main(String[]args)
    {
        int dof = 0;
        int doc = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("nhap vao do F: ");
        dof = kb.nextInt();
        System.out.println("do C la: ");
        doc = (int)((dof - 32) / 1.8);
        System.out.println(doc);
    }
}    