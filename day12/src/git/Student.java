package git;

public class Student extends Person{

	private long number;
	private int math;
	private int english;
	private int computer;
	
	public Student(String name, char sex, int age) {
		super(name, sex, age);
	}

	public Student(String n, char s, int a, long k, int m, int e, int c) {
		super(n, s, a);
		this.number = k;
		this.math = m;
		this.english = e;
		this.computer = c;
	}
	
	public double aver(){
		return aver();
	}
	
	public int max(){
		return max();
	}
	
	public int min(){
		return min();
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", math=" + math + ", english=" + english + ", computer=" + computer + "]";
	}
	
}
