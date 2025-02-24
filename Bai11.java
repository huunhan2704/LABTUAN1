public class Bai11 
{
     public static int daoNguocSo(int so) 
     {
        int soDaoNguoc = 0;
        while (so != 0) 
        {
            int chuSo = so % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSo;
            so /= 10;
        }
        return soDaoNguoc;
    }
    public static void main(String[] args) 
    {
        int so = 1234;
        int soDaoNguoc = daoNguocSo(so);
        System.out.println("So " + so + " sau khi dao nguoc la: " + soDaoNguoc);
    }
}