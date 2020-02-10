package lec10.ex7;

public class SubB extends A {
	
	private int z;
	
	public SubB(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public int methodInSubB() {
		return methodInA() * z;
	}
}