package com.zd.TestSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yc.bean.Person;
import com.yc.biz.StudentBiz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApp() {
		Person p = new Person();
		p.showHello();
		Person p2 = new Person();
		p.showHello();
	}

	public void testApp2(){
    	//1，创建spring容器，集合    它会读取applicationContext.xml文件
    	
    	ApplicationContext context=
    			new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
    	//2.从容器中取出对象
    	Person p=(Person) context.getBean("p");
    	p.showHello();
    	
    	Person p2=(Person) context.getBean("p");
    	p.showHello();
    }
	public void testApp3(){
    	//1，创建spring容器，集合    它会读取applicationContext.xml文件
    	
    	ApplicationContext context=
    			new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
    	StudentBiz sb=(StudentBiz)context.getBean("sboi");
    	sb.addStudent();
    }
	public void testApp4(){
    	Resource res=new ClassPathResource("applicationContext.xml");
    	BeanFactory factory=new XmlBeanFactory(res);
    	StudentBiz sb=(StudentBiz)factory.getBean("sboi");
    	sb.addStudent();
    }
	public void testApp5(){
    	ApplicationContext context=new FileSystemXmlApplicationContext("E:\\workspaceLydia\\TestSpring\\target\\classes\\applicationContext.xml");
    	StudentBiz sb=(StudentBiz)context.getBean("sboi");
    	sb.addStudent();
    }
	//装配基本类型的数据
	public void testApp6(){
		Person p=new Person();
		p.setName("张三 ");
		p.setAge(20);
		System.out.println(p.toString());
	}
	public void testApp7(){
    	ApplicationContext context=
    			new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
    	Person p=(Person) context.getBean("p");
    	System.out.println(p.toString());
    }
}
