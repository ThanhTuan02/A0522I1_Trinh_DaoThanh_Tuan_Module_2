package S03_Array.thuchanh;

import java.util.Scanner;

public class find_elenment_in_array {
    public static void main(String[] args) {
        String [] students = {"Christian","Michael","Camila","Sienna","Tanya","Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        //Khai báo biên lưu tên tìm kiếm và gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's Student: ");
        String input_name = scanner.nextLine();
        //Duyệt mảng sinh viên đã khai báo ở trên,tìm phần tử có giá trị nhập vào
        boolean isExist = false;
        for (int i = 0;i < students.length;i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the student in the list " + input_name+ "is " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + "in the list");
        }
    }
}
