package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 10648 on 2016/6/5 0005.
 */
public class DownNameSort implements SortInterface,Comparator<Person> {
    @Override
    public void sort(List<Person> list) {
        Collections.sort(list, this);

    }

    @Override
    public int compare(Person o1, Person o2) {
        int result = o2.getName().compareTo(o1.getName());
        if (0 == result){
            return o2.getId() - o1.getId();
        }
        return result;
    }
}
