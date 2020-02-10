package lec10.ex4;

public class Main {

	public static void main(String[] args) {
		A a_obj = new A();
		SubA suba_obj = new SubA();
	
		System.out.println("a_obj.method(1,2): " + 
							a_obj.method(1, 2));
		
		System.out.println("suba_obj.method(1,2): " + 
							suba_obj.method(1, 2));

		System.out.println("suba_obj.method(1,2,3): " + 
							suba_obj.method(1, 2, 3));
		A a_ref = suba_obj;
	}
}

class A {
	public int method(int x, int y) {
		return x+y;
	}
}

class SubA extends A {
	public int method(int x, int y, int z) {
		return x+y+z;
	}
}