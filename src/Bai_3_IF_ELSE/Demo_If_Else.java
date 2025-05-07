package Bai_3_IF_ELSE;

public class Demo_If_Else {
    public static void main(String[] args) {
        int number = 100;
        if (number > 50) {
            System.out.println("Kết quả lớn hơn 50");
        } else if (number < 50) {
            System.out.println("Kết quả nhỏ hơn 50");
        } else if (number == 100) {
            System.out.println("Kết quả bằng 100");
        }
        else {
            System.out.println("Empty");
        }
    }
}
