package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        long res1 = 5L * num1 * num1 + 3;
        long res2 = 5L * num2 * num2 + 3;

        if(res1 != res2){
            return Long.compare(res1, res2);
        }

        return Long.compare(num1, num2);
    }
}
