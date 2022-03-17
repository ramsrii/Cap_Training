package com.training.test;

public class Employee {
		private int rno;
		private int age;
		private String name,des;
		public Employee() {
			
		}
		public Employee(int rno, String name, String des,int age) {
			super();
			this.rno = rno;
			this.age = age;
			this.name = name;
			this.des = des;
		}
		public int getRno() {
			return rno;
		}
		public void setRno(int rno) {
			this.rno = rno;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDes() {
			return des;
		}
		public void setDes(String des) {
			this.des = des;
		}
		@Override
		public String toString() {
			return "Employee [rno=" + rno + ", age=" + age + ", name=" + name + ", des=" + des + "]";
		}

}
