package demo;

public class Master {
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.setName("����");
		dog1.setAge(44);

		// �з���ֵ
		String sound = dog1.bark();
		System.out.println(sound);

		// �в���
		String b = "��ͷ";
		dog1.eat(b);

		// �޷���ֵ �޲���
		dog1.sleep();

		// �з���ֵ �в���
		String word = dog1.sayHello("����");//String n="����";
		System.out.println(word);

	}

}
