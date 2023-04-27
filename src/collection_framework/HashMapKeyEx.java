package collection_framework;
import java.util.*;
public class HashMapKeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer>stuid=new HashMap<>();
stuid.put("sanju",1);
stuid.put("anju",4);
stuid.put("anju",4);
stuid.put("ganju",1);
//stuid.add("sikha",67);not working
System.out.println("hashmap element := " +stuid);
stuid.putIfAbsent("simran", 4);
System.out.println("hashmap element := " +stuid);

int value=stuid.get("sanju");
System.out.println("checking value := "+value);

System.out.println("Size := "+ stuid.size());

System.out.println("contains := "+ stuid.containsKey("s"));

Set<String> keySet = stuid.keySet();

for (String key : keySet) 
{
    System.out.println(key);
}

	}

}
