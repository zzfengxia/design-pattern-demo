package com.zz.designpattern.adapter.example;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Francis.zz on 2015/12/15.
 * 描述：对象适配器模式， 使用Iterator适配Enumeration
 * 需要使用哪种对象，则实现该对象，并组合原先存在的对象
 * 类适配器模式：使用多继承实现，java无法实现
 */
public class EnumerationAdapter implements Enumeration {
    Iterator it;

    public EnumerationAdapter(Iterator ite) {
        this.it = ite;
    }
    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
}
