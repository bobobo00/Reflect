package basic;

import java.lang.reflect.InvocationTargetException;

/**
 * 1,��ȡclass����
 * 2,���Զ�̬����
 * @author dell
 *
 */

public class Reflect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//����һ
		Iphone iphone=new Iphone();
		Class clz=iphone.getClass();
		//������
		clz=Iphone.class;
		//������
		clz=Class.forName("basic.Iphone");
		
		//��������
		Iphone iphone2=(Iphone)clz.newInstance();//����ȫ��
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
