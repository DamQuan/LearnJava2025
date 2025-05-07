package Bai_6_Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo_list {
    public static void main(String[] args) {
        List<Integer> Sochan = new ArrayList<>();
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
