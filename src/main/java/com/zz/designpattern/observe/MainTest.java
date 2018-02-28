package com.zz.designpattern.observe;

import com.zz.designpattern.observe.observe.CurrentConditionsDisplay;
import com.zz.designpattern.observe.observe.CurrentConditionsDisplayPull;
import com.zz.designpattern.observe.subject.WeatherData;
import com.zz.designpattern.observe.subject.WeatherDataPull;

/**
 * ʹ�ù۲���ģʽ���ģ��С������վ���Է���
 * @author Francis.zz
 * create on 20151108
 */
public class MainTest {
	public static void main(String[] args) {
		// ************push***********************
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
		System.out.println("--------------push�ĸ������--------------");
		weatherData.setMeasurements(28, 40, 88);
		weatherData.setMeasurements(33, 32, 78);
		// ************pull***********************
		
		WeatherDataPull dataPull = new WeatherDataPull();
		CurrentConditionsDisplayPull displayPull = new CurrentConditionsDisplayPull(dataPull);
		System.out.println("--------------pull�ĸ������--------------");
		dataPull.setMeasurements(28, 40, 88);
		dataPull.setMeasurements(33, 32, 78);
	}
}
