package lec10.ex5;

public class Main {

	public static void main(String[] args) {
		A a_obj = new A();
		SubA suba_obj = new SubA();
		SubSubA sub_suba_obj = new SubSubA();
		
		System.out.println("a_obj.method(1,2): " + 
							a_obj.method(1, 2));
		
		System.out.println("suba_obj.method(1,2): " + 
							suba_obj.method(1, 2));
		
		System.out.println(sub_suba_obj.method(1, 2));
	}
}

class A {
	public int method(int x, int y) {
		return x+y;
	}
}

class SubA extends A {
	public int method(int x, int y) {
		return x-y;
	}
}

class SubSubA extends SubA {
	
}