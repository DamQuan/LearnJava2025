package Bai_5_Mang;

public class Demo_mang {
    public static void main(String[] args) {
        int a[] = new int[100];
        int index = 0;

        for (int i = 0; i < a.length; i += 2) {
            if (i % 2 == 0) {
                a[index] = i;
                index++;
            }
        }
            for (int j = 0; j < a.length; j++){
                System.out.println("Số Chẵn: " + a[j]);

            }

        }
    }

