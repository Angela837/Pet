package demo;

public class Master {
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.setName("汪汪");
		dog1.setAge(44);

		// 有返回值
		String sound = dog1.bark();
		System.out.println(sound);

		// 有参数
		String b = "骨头";
		dog1.eat(b);

		// 无返回值 无参数
		dog1.sleep();

		// 有返回值 有参数
		String word = dog1.sayHello("旺财");//String n="旺财";
		System.out.println(word);

	}

}
