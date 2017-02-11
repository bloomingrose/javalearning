package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {

	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Sobha");
		list.add("Haris");
		list.add("Hasini");
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
		//Iterating with for loop
		
		for(String al:list){
			System.out.println(al);
		}
	}

}
