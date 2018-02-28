package com.zz.designpattern.adapter.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by Francis.zz on 2015/12/15.
 * 描述：使用Iterator适配Enumeration
 */
public class Test {
    public static void main(String[] args) {
        List datalist = new ArrayList();
        String[] strs = {"Francis.zz", "你好", "come on"};
        datalist.addAll(Arrays.asList(strs));

        Enumeration enu = new EnumerationAdapter(datalist.iterator());
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
