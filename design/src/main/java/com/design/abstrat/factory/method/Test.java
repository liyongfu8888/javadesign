package com.design.abstrat.factory.method;

/**
 * 
 * @ClassName: Test
 * @Description: TODO
 * @author liyongfu
 * @date 2016年11月9日 下午10:35:20
 *
 */
public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
		System.out.println("=======================");
		
		Provider provider2 = new SendSmsFactory();
		Sender sender2 = provider2.produce();
		sender2.send();
	}

}
