package basic;

import java.lang.reflect.InvocationTargetException;

/**
 * 1,获取class对象
 * 2,可以动态创建
 * @author dell
 *
 */

public class Reflect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//方法一
		Iphone iphone=new Iphone();
		Class clz=iphone.getClass();
		//方法二
		clz=Iphone.class;
		//方法三
		clz=Class.forName("basic.Iphone");
		
		//创建对象
		Iphone iphone2=(Iphone)clz.newInstance();//不安全的
		System.out.println(iphone2);
		
		Iphone iphone3=(Iphone)clz.getConstructor().newInstance(1);
		System.out.println(iphone3.getId());
	}

}
class Iphone{
	private int id;
	public int getId() {
		return id;
	}
	public Iphone(int id) {this.id=id;}
	public Iphone() {
	}
	
}
