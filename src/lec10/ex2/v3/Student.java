package lec10.ex2.v3;

public interface Student extends Person {
	enum Status {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR}

	void addCredits(int num_credits);
	Status getStatus();
	
}
