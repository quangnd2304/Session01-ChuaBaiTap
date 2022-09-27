import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Input: USD
        * Process: VND = USD*Tygia
        * Output: VND
        * */
        final float TYGIA = 23000;
        //B1. Nhap USD
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so usd can chuyen doi: ");
        float usd = sc.nextFloat();
        //B2. chuyen doi sang tien VND
        float vnd = usd*TYGIA;
        //B3. In ra VND
        System.out.println("So tien VND sau khi chuyen doi: "+vnd);
    }
}