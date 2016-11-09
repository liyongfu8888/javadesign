package com.design.abstrat.factory.method;
/**
 * 
* @ClassName: SendSmsFactory 
* @Description: TODO
* @author liyongfu
* @date 2016年11月9日 下午10:34:08 
*
 */
public class SendSmsFactory implements Provider {
	/**
	 * 
	 */
	public Sender produce() {
		return new SmsSender();
	}

}
