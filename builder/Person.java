package com.yd.test.builder;

public class Person {
	
	private final String name;
	private final String age;
	private final String sexType;
	private final String birthday;
		
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sexType=" + sexType
				+ ", birthday=" + birthday + "]";
	}

	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getSexType() {
		return sexType;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public Person(Builder builder){
		this.name = builder.name;
		this.age = builder.age;
		this.sexType = builder.sexType;
		this.birthday = builder.birthday;
	}
	

	public static class Builder{
		private String name;
		private String age;
		private String sexType;
		private String birthday;
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setAge(String age) {
			this.age = age;
			return this;
		}
		public Builder setSexType(String sexType) {
			this.sexType = sexType;
			return this;
		}
		public Builder setBirthday(String birthday) {
			this.birthday = birthday;
			return this;
		}
		
		public Person build(){
			return new Person(this);
		}
		
		public Builder create(){
			return this;
		}
		
	}
	
	

}
