package com.OOPSinheritence;

class testA{
	public class MethodHiding {
	
		public static void main(String[] args) {
	     testA t = new testA();
	     
	
		}
	
	}

	public static void main(String[] args){
		System.out.println("MAin method Started from A");
	}
	
}

class testB extends testA{
   public static void main(String[] args){
	   System.out.println("MAin method Started from B");
	}
}
