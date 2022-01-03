package com.hsc.util;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListUtil {

    static List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    static List<String> list1 = Arrays.asList("1", "10");

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("3");
        Iterator<String> iterator = list.iterator();
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            if (Integer.valueOf(s) % 2 == 0) {
//                iterator.remove();
//                break;
//            }
//        }

//        for (String s : list) {
//            if (Integer.valueOf(s) % 2 == 0) {
//                list.remove(s);
//                break;
//            }
//        }
//        list.stream().forEach(System.out::println);


        for (String s : list1) {
            while (iterator.hasNext()) {
                String x = iterator.next();
                if (s.equals(x)) {
                    iterator.remove();
                    break;
                }
            }
        }
        list.stream().forEach(System.out::println);

    }

}
