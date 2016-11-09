package com.design.abstrat.factory.method;
/**
 * 
* @ClassName: SendMailFactory 
* @Description: TODO
* @author liyongfu
* @date 2016年11月9日 下午10:33:30 
*
 */
public class SendMailFactory implements Provider {
	/**
	 * 
	 */
	public Sender produce() {
		return new MailSender();
	}

}
