
import java.util.Scanner;
public class Bai07 {
        public static void main(String[]args)
    {
        Double diemLY;
        Double diemHOA;
        Double diemSINH;
        Double diemToan;
        Double diemMT;
        Double phantramDiem;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap diem cac mon hoc theo thu tu LY HOA SINH TOAN MT:");
        diemLY = kb.nextDouble();
        diemHOA = kb.nextDouble();
        diemSINH = kb.nextDouble();
        diemToan = kb.nextDouble();
        diemMT = kb.nextDouble();
        phantramDiem = ((diemLY + diemHOA + diemSINH + diemToan + diemMT) / 5)*10;
        System.out.println("Diem trung binh cua hoc sinh la: " + phantramDiem);
        if(phantramDiem<40)
        {
            System.out.println("Hang F la:" + phantramDiem + "%");
        }
        else if(phantramDiem>=40 && phantramDiem<60)
        {
            System.out.println("Hang E la:" + phantramDiem + "%");
        }
        else if(phantramDiem>=60 && phantramDiem<70)
        {
            System.out.println("Hang C la:" + phantramDiem + "%");
        }
        else if(phantramDiem>=70 && phantramDiem<80)
        {
            System.out.println("Hang B la:" + phantramDiem + "%");
        }
        else
        {
            System.out.println("Hang A la:" + phantramDiem + "%");
        }
    }
}    