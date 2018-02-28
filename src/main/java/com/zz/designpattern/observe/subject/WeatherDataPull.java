package com.zz.designpattern.observe.subject;

import java.util.Observable;

/**
 * ����java API�ı��۲����࣬ʹ��pull��ʽ���۲����Լ��ӱ��۲����л�ȡ��Ҫ�����
 * @author Francis.zz
 *
 */
public class WeatherDataPull extends Observable {
	// �������
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged() {
		setChanged();	// ���µ�״̬���������
		notifyObservers();  // ����ʱ֪ͨ�۲���
	}
	// ��ȡ������ݣ�����������ץȡ��ݣ��˴�ģ��Ϊ�Լ�����
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
}
