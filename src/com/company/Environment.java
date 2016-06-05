package com.company;

import java.util.List;

/**
 * Created by 10648 on 2016/6/5 0005.
 */
public class Environment {
    private SortInterface sortInterface;

    public Environment(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }
    public Environment(){

    }

    public void setSortInterface(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }
    public void sort(List<Person> list){
        this.sortInterface.sort(list);
    }
}
