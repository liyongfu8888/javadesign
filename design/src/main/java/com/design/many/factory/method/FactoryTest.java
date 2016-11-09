package com.design.many.factory.method;
/**
 * 
* @ClassName: Test 
* @Description: TODO
* @author liyongfu
* @date 2016年11月9日 下午10:15:08 
*
 */
public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory=new SendFactory();
		Sender mailSender= factory.produceMail();
		Sender smsSender=factory.produceSms();
		mailSender.send();
		smsSender.send();
	}

}
