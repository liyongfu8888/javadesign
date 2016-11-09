package com.design.many.factory.method;

/**
 * 
* @ClassName: SmsSender 
* @Description: TODO
* @author liyongfu
* @date 2016年11月9日 下午10:00:13 
*
 */
public class SmsSender implements Sender {

	public void send() {
		System.out.println("this is sms sender!");  
	}

}
