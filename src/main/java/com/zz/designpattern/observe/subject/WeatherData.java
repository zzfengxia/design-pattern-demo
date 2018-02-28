package com.zz.designpattern.observe.subject;

import com.zz.designpattern.observe.observe.observeImpl.Observe;
import com.zz.designpattern.observe.subject.subjectImpl.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * ģ��С������վ���ⷢ����̳�����ӿ�,�Թ۲����������͵ķ�ʽ(push)
 * @author Francis.zz
 * create on 20151108
 */
public class WeatherData implements Subject {
	private List<Observe> observes;    // ���ĵĹ۲����б�
	// �������
	private float temperature;
	private float humidity;
	private float pressure;
	// ���췽��,�������ĵĹ۲����б�
	public WeatherData() {
		observes = new ArrayList<Observe>();
	}
	// ���ķ���
	public void registerObserve(Observe o) {
		observes.add(o);
	}
	// ȡ����
	public void removeObserve(Observe o) {
		int index = observes.indexOf(o);
		if(index >= 0) {
			observes.remove(index);
		}

	}
	// ����֪ͨ�۲���
	public void notifyObserve() {
		for(Observe observe : observes) {
			observe.update(temperature, humidity, pressure);
		}
	}
	// ��������и���ʱ���ô˷���
	public void measurementsChanged() {
		this.notifyObserve();
	}

	// ��ȡ������ݣ�����������ץȡ��ݣ��˴�ģ��Ϊ�Լ�����
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	/**
	 * *********************************
	 * *********************************
	 * *********����������չ************
	 * *********************************
	 * *********************************
	 */
}
