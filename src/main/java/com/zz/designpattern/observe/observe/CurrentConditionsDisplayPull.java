package com.zz.designpattern.observe.observe;

import com.zz.designpattern.observe.observe.observeImpl.DisplyElements;
import com.zz.designpattern.observe.subject.WeatherDataPull;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲����࣬ʵ��java API�Ĺ۲��߽ӿڣ�ʹ��pull�ķ�ʽ�ӱ��۲����л�ȡ��Ҫ�����
 * @author Francis.zz
 *
 */

public class CurrentConditionsDisplayPull implements Observer, DisplyElements{
	// ��������
	private float temp;
	private float humidity;
	private float pressure;
	private Observable observable;
	
	// ���췽������ʼ��
	public CurrentConditionsDisplayPull(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof WeatherDataPull) {
			WeatherDataPull dataPull = (WeatherDataPull) arg0;
			// �ӱ��۲�������ȡ���
			this.temp = dataPull.getTemperature();
			this.humidity = dataPull.getHumidity();
			this.pressure = dataPull.getPressure();
			
			display();
		}
	}
	
	public void display() {
		System.out.println("��ǰ���¶�:" + this.temp + "���϶�; ��ǰʪ��Ϊ:" +
							this.humidity + "%; ��ǰ��ѹΪ:" + this.pressure + "P��");
	}
}
