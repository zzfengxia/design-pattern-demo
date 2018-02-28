package com.zz.designpattern.observe.subject.subjectImpl;

import com.zz.designpattern.observe.observe.observeImpl.Observe;

/**
 * ����ӿ�
 * @author Francis.zz
 * create by Francis.zz on 20151108
 */
public interface Subject {
	// �۲��߶���
	public void registerObserve(Observe o);
	// ȡ����
	public void removeObserve(Observe o);
	// ֪ͨ����
	public void notifyObserve();
}
