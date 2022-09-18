package study.codingImps;

import java.util.ArrayList;
import java.util.Collections;

//sorting id and name or sort using encapsulation in collection.
public class Q_58 {

	public static void main(String[] args) {

		ArrayList<Test> al = new ArrayList<>();
		al.add(new Test(44, "suyog"));
		al.add(new Test(33, "aniket"));
		al.add(new Test(12, "rakhi"));
		al.add(new Test(11, "sanket"));
		
		//sorting based on id
		Collections.sort(al,(al1,al2)->{
			Integer l,m;
			l = al1.getId();
			m = al2.getId();
			return l.compareTo(m);
		});
		
		System.out.println("after sorting by id");
		printArrayList(al);
		System.out.println("--------------------------------------------------");
		
		//sorting by name
		Collections.sort(al, (al1,al2)->{
			return al1.getName().compareTo(al2.getName());
		});;
		
		System.out.println("after sorting by name");
		printArrayList(al);
	}
	
	public static void printArrayList(ArrayList<Test> al)
	{
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).getId()+ " "+al.get(i).getName());
		}
	}

}

class Test
{
	private int id;
	private String name;
	
	public Test(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
