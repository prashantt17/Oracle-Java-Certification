package com.prashant.MyProject.Interface;


interface A {
	
	public void getName();
}

interface B {
	
	public void getEmail();
	
}

public class InterfaceTest implements A,B {

	public static void main(String[] args) {
		A obj = new InterfaceTest();
		obj.getName();
		
		B obj2 = new InterfaceTest();
		obj2.getEmail();

	}

	@Override
	public void getName() {
		System.out.println("getName Method Called!!");
		
	}

	@Override
	public void getEmail() {
		System.out.println("getEmail Method Called!!");
		
	}

}
