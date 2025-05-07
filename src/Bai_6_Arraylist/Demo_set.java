package Bai_6_Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Demo_set {
    public static void main(String[] args) {
        Set<Integer> Sochan = new HashSet<Integer>();
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
