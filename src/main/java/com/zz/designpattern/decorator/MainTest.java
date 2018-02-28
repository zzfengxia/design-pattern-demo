package com.zz.designpattern.decorator;

import com.zz.designpattern.decorator.component.Beverage;
import com.zz.designpattern.decorator.component.DarkRoast;
import com.zz.designpattern.decorator.component.Kola;
import com.zz.designpattern.decorator.decorator.Milk;
import com.zz.designpattern.decorator.decorator.Moca;

import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * 装饰器模式
 * create on 20151115 by Francis.zz
 */
public class MainTest extends FilterInputStream{
	protected MainTest(InputStream in) {
		super(in);
	}

	/*public int read(byte[] b) throws IOException {
		int result = super.read();
		return result == -1 ? result : Character.toLowerCase((char)result);
	}

	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for(int i = off; i < off + result; i++) {
			b[i] = (byte) Character.toLowerCase((byte)b[i]);
		}
		return result;
	}
	public static void main(String[] args) throws IOException{
		MainTest mainTest = new MainTest(new BufferedInputStream(new FileInputStream("D:\\test.txt")));
		int c;
		while((c = mainTest.read()) >= 0) {
			System.out.print((char)c);
		}
	}*/
	
	public static void main(String[] args) {
		Milk milk = new Milk(new Moca(new Kola()));
		System.out.println(milk.getDescription() + milk.cost() + "￥");
		
		Beverage beverage = new DarkRoast();
		beverage = new Moca(beverage);
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription() + beverage.cost() + "￥");
	}
	
}
