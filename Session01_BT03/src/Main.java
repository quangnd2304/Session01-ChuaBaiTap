import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Input: num < 1000
         * process:
         *   + num < 10
         *   + num < 100
         *   + num < 1000
         * Output: phien am num
         * */
        //B1. Nhap vao 1 so co gia tri < 1000
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int num = sc.nextInt();
        //B2. Xet cac truong hop so chu so cua num
        String str_output = "";
        if (num < 10) {
            //num co 1 chu so
            switch (num) {
                case 0:
                    str_output = "Khong";
                    break;
                case 1:
                    str_output = "Mot";
                    break;
                case 2:
                    str_output = "Hai";
                    break;
                case 3:
                    str_output = "Ba";
                    break;
                case 4:
                    str_output = "Bon";
                    break;
                case 5:
                    str_output = "Nam";
                    break;
                case 6:
                    str_output = "Sau";
                    break;
                case 7:
                    str_output = "Bay";
                    break;
                case 8:
                    str_output = "Tam";
                    break;
                default:
                    str_output = "Chin";

            }
        } else if (num < 100) {
            //num co 2 chu so
            //B2.1. Tach chu so hang chuc va hang don vi
            int chuc,dvi;
            chuc = num/10;
            dvi = num%10;
            //B2.2. Phien am
            switch (chuc){
                case 1:
                    // a+=b --> a = a+b
                    str_output += "Mot chuc";
                    break;
                case 2:
                    str_output += "Hai chuc";
                    break;
                case 3:
                    str_output = "Ba chuc";
                    break;
                case 4:
                    str_output = "Bon chuc";
                    break;
                case 5:
                    str_output = "Nam chuc";
                    break;
                case 6:
                    str_output = "Sau chuc";
                    break;
                case 7:
                    str_output = "Bay chuc";
                    break;
                case 8:
                    str_output = "Tam chuc";
                    break;
                default:
                    str_output = "Chin chuc";
            }
            switch (dvi){
                case 0:
                    str_output += " Khong don vi";
                    break;
                case 1:
                    str_output += " Mot don vi";
                    break;
                case 2:
                    str_output += " Hai don vi";
                    break;
                case 3:
                    str_output += " Ba don vi";
                    break;
                case 4:
                    str_output += " Bon don vi";
                    break;
                case 5:
                    str_output += " Nam don vi";
                    break;
                case 6:
                    str_output += " Sau don vi";
                    break;
                case 7:
                    str_output += " Bay don vi";
                    break;
                case 8:
                    str_output += " Tam don vi";
                    break;
                default:
                    str_output += " Chin don vi";
            }
        } else {
            //num co 3 chu so
            //B2.3. Tach chu so hang tram, chuc, dvi
            int tram,chuc,dvi;
            tram = num/100;
            chuc = (num%100)/10;
            dvi = num%10;
            switch (tram){
                case 1:
                    // a+=b --> a = a+b
                    str_output += "Mot tram";
                    break;
                case 2:
                    str_output += "Hai tram";
                    break;
                case 3:
                    str_output = "Ba tram";
                    break;
                case 4:
                    str_output = "Bon tram";
                    break;
                case 5:
                    str_output = "Nam tram";
                    break;
                case 6:
                    str_output = "Sau tram";
                    break;
                case 7:
                    str_output = "Bay tram";
                    break;
                case 8:
                    str_output = "Tam tram";
                    break;
                case 9:
                    str_output = "Chin tram";
            }
            switch (chuc){
                case 1:
                    // a+=b --> a = a+b
                    str_output += " Mot chuc";
                    break;
                case 2:
                    str_output += " Hai chuc";
                    break;
                case 3:
                    str_output += " Ba chuc";
                    break;
                case 4:
                    str_output += " Bon chuc";
                    break;
                case 5:
                    str_output += " Nam chuc";
                    break;
                case 6:
                    str_output += " Sau chuc";
                    break;
                case 7:
                    str_output += " Bay chuc";
                    break;
                case 8:
                    str_output += " Tam chuc";
                    break;
                case 9:
                    str_output += " Chin chuc";
            }
            switch (dvi){
                case 1:
                    str_output += " Mot don vi";
                    break;
                case 2:
                    str_output += " Hai don vi";
                    break;
                case 3:
                    str_output += " Ba don vi";
                    break;
                case 4:
                    str_output += " Bon don vi";
                    break;
                case 5:
                    str_output += " Nam don vi";
                    break;
                case 6:
                    str_output += " Sau don vi";
                    break;
                case 7:
                    str_output += " Bay don vi";
                    break;
                case 8:
                    str_output += " Tam don vi";
                    break;
                case 9:
                    str_output += " Chin don vi";
            }
        }
        //B3. In ra phien am
        System.out.println("PHIEN AM: "+str_output);
    }
}