package lws.training.a16;

import java.util.ArrayList;

public class SelectionSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
            for (int a = 0; a < list.size() - 1; a++) {
                for (int b = a +1; b < list.size(); b++) {
                    if(list.get(a) > list.get(b)) {
                        int minNumber = list.get(a);
                        list.set(a,list.get(b));
                        list.set(b, minNumber);
                    }
                }
            }
        return list;
    }

}
