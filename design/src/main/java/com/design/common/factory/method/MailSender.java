package com.design.common.factory.method;
/**
 * 
* @ClassName: MailSender 
* @Description: TODO
* @author liyongfu
* @date 2016年11月9日 下午9:59:01 
*
 */
public class MailSender implements Sender {

	public void send() {
		System.out.println("this is mail sender!");  
	}

}
