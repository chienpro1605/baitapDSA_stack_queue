package demsolanxuathientrenmoitu;

import java.util.Scanner;

public class DemTu {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi bất kỳ:");
        s = scanner.nextLine();
        System.out.println("nhập ký tự cần đếm trong chuỗi");
        char c;
        c = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của ký tự " + c + "là:" + count);
    }
}
