package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10648 on 2016/6/5 0005.
 */
public class Client {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(1);
        p1.setAge(20);
        p1.setName("abc");

        Person p2 = new Person();
        p2.setId(2);
        p2.setAge(30);
        p2.setName("abc");

        Person p3 = new Person();
        p3.setId(3);
        p3.setAge(40);
        p3.setName("xioafengzneg");


        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Environment environment = new Environment();
        UpNameSort upNameSort = new UpNameSort();
        environment.setSortInterface(upNameSort);
        environment.sort(list);

        for (int i = 0; i < list.size(); i++){
            Person p = list.get(i);
            System.out.println("id: " + p.getId() + "age :" + p.getAge()  + "name:" + p.getName());
        }
        DownNameSort downNameSort = new DownNameSort();
        environment.setSortInterface(downNameSort);
        environment.sort(list);
        for (int i = 0; i < list.size(); i++){
            Person p = list.get(i);
            System.out.println("id: " + p.getId() + "age :" + p.getAge()  + "name:" + p.getName());
        }

    }
}
