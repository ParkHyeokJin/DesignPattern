package ProxyPattern;

public class RealSubject implements Subject {

	@Override
	public void action1() {
		// TODO Auto-generated method stub
		System.out.println("간단한 업무");
	}

	@Override
	public void action2() {
		// TODO Auto-generated method stub
		System.out.println("복잡한 업무");
	}

}
