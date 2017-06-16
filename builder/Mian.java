package com.yd.test.builder;


public class Mian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 第一种写法
		Person.Builder  builer= new Person.Builder()
		.setName("da")
		.setSexType("male")
		.setAge("22")
		.setBirthday("1995.03.05").create();
		Person person = builer.build();
		System.out.println(person.toString());
		// 第二种写法
		Person person2 = new Person.Builder()
		.setName("xiao")
		.setSexType("female")
		.setAge("25")
		.setBirthday("1997.03.06")
		.build();
		System.out.println(person2.toString());
	}

}
