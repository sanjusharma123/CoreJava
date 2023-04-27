package collection_framework;

import java.util.*;

public class CollFrame_CrudExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------CRUD OPERATION---------------------");
		ArrayList<String> student = new ArrayList<>();
		student.add("sanju");
		student.add("Achu");
		student.add("saurav");
		student.add("pranjali");
		student.add("bheem");
//ADDING THE VALUE OF STUDENT FROM THE LIST
		System.out.println("Student Is Added In A List:= " + student);
//READING THE VALUE OF STUDENT FROM THE LIST
		System.out.println("get student := " + student.get(0));
//GET STUDENT
		System.out.println(student.set(2, "simmu"));
//UPDATE THE VALUE OF STUDENT FROM THE LIST
		System.out.println("update student := " + student);
//REMOVE THE VALUE OF STUDENT FROM THE LIST
		System.out.println(student.remove(0));

		System.out.println("remove student := " + student);

	}

}
