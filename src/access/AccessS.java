package access;

class Student {
	private int id;
	private String name;
 private int marks;
	public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
}

public class AccessS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sc = new Student();
		sc.setName("sanjukumari sharma");
		System.out.println(sc.getName());
		sc.setId(10);
		System.out.println(sc.getId());
		sc.setMarks(67);
		System.out.println(sc.getMarks());
	}

}
