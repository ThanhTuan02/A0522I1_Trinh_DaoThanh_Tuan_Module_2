package s01_Java.baitap;

import java.util.Scanner;

public class chyen_doi_tien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VND: " + quydoi);
    }
}
