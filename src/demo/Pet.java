package demo;

public class Pet {
	private String name;
	private int age;

	
	public String bark() {
		return "������";
	}

	public void eat(String food) {
		System.out.println("������" + name + "  ������" + age + "�Ĺ��ڳ�" + food);
	}

	public void sleep() {
		System.out.println("������" + name + "  ������" + age + "�Ĺ�����˯��");
	}

	public String sayHello(String dogName) {
		return "����" + dogName;
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
			System.out.println("���ݴ���");
		}else
		this.age = age;
	}

}
