import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Input: chieu dai a, chieu rong b
        * Process: S = a*b
        * Output: Dien tich hinh chu nhat
        * */
        //B1. Nhap chieu dai va chieu rong hinh chu nhat
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai hinh chu nhat: ");
        float a = sc.nextFloat();
        System.out.println("Nhap vao chieu rong hinh chu nhat: ");
        float b = sc.nextFloat();
        //B2. Tinh dien tich hinh chu nhat
        float s = a*b;
        //B3. In ra dien tich hinh chu nhat
        System.out.println("Dien tich hinh chu nhat la: "+s);

    }
}