import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Partit {
	 
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		//linked list added to list
		list.add(15);
		list.add(1);
		list.add(6);
		list.add(12);
		list.add(-3);
		list.add(4);
		list.add(8);
		list.add(21);
		list.add(2);
		list.add(30);
		list.add(-1);
		//call method partition 
		partition(list, 5);
		//print new list reorganized 
		System.out.println(list);
	}
	//create method partition with two parameters 
	public static void partition (List<Integer> list, int E){
		//instance of iterator
		Iterator<Integer> itr = list.iterator();
		//new list 
		List<Integer> listing = new LinkedList<Integer>();
		
		
		//looping through list removing values less than or equal to 5
		while(itr.hasNext()) {
			int values = itr.next();
			//removes values less than or = to 5 stored in values
			if(values<= E) {
				itr.remove();
				
				listing.add(values);
			}else {
				//System.out.println(list.addAll(0,listing));
			}
		}
		//adding the numbers to list 
		list.addAll(0, listing);
		
		
		
		
	}

}
