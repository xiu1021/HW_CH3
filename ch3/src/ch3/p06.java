package ch3;

public class p06 {
	public static void main(String[] args) {
		Car1 car1;
		car1 = new Car1();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("車號是" +car1.num);
		System.out.println("車號是" +car1.gas);
	}
}

class Car1
{
	int num;
	double gas;
}