package Bai_6_Arraylist;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Demo_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> Sochan = new ArrayList<Integer>();
        int max = 100;

        for (int i = 0; i < max; i++){
            if (i % 2 == 0) {
                Sochan.add(i);
            }
        }
            for (int j = 0; j< Sochan.size(); j++){
            }
        System.out.println("Số chẵn: " + Sochan);

}
}
