package com.design.many.factory.method;
/**
 * 
* @ClassName: SendFactory 
* @Description: 工厂模式之多个工厂方法模式：
* 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
* 而多个工厂方法模式是提供多个工厂方法，分别创建对象
* @author liyongfu
* @date 2016年11月9日 下午10:09:48 
*
 */
public class SendFactory {
	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
}
