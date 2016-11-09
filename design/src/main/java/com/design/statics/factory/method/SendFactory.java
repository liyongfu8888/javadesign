package com.design.statics.factory.method;
/**
 * 
* @ClassName: SendFactory 
* @Description: 工厂方法模式之静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，
* 不需要创建实例，直接调用即可。
* @author liyongfu
* @date 2016年11月9日 下午10:24:58 
*
 */
public class SendFactory {
	/**
	 * 
	* @Description: TODO
	* @return Sender  
	* @throws
	 */
	public static Sender produceMail(){  
        return new MailSender();  
    }  
    
	/**
	 * 
	* @Description: TODO
	* @return Sender  
	* @throws
	 */
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
