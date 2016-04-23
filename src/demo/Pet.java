package demo;

public class Pet {
	private String name;
	private int age;

	
	public String bark() {
		return "汪汪汪";
	}

	public void eat(String food) {
		System.out.println("名字是" + name + "  年龄是" + age + "的狗在吃" + food);
	}

	public void sleep() {
		System.out.println("名字是" + name + "  年龄是" + age + "的狗困了睡觉");
	}

	public String sayHello(String dogName) {
		return "我是" + dogName;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>20||age<0){
			System.out.println("数据错误");
		}else
		this.age = age;
	}

}
