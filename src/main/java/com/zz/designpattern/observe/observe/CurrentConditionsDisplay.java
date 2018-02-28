package com.zz.designpattern.observe.observe;

import com.zz.designpattern.observe.observe.observeImpl.DisplyElements;
import com.zz.designpattern.observe.observe.observeImpl.Observe;
import com.zz.designpattern.observe.subject.subjectImpl.Subject;

/**
 * @author Francis.zz
 */
public class CurrentConditionsDisplay implements Observe, DisplyElements {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject subject;
	public CurrentConditionsDisplay(Subject sb) {
		this.subject = sb;
		sb.registerObserve(this);
	}
	
	public void display() {
		System.out.println("��ǰ���¶�:" + this.temp + "���϶�; ��ǰʪ��Ϊ:" +
							this.humidity + "%; ��ǰ��ѹΪ:" + this.pressure + "P��");
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
	}

}
