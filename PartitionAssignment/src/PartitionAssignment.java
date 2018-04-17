import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;



class PartitionAssignment extends Partit {

	
	@Test
	void test() {
		
		List<Integer> list = new LinkedList<Integer>();
		
		Partit.partition(list, 5);
		//LinkedList<Integer> newList = new LinkedList<Integer>();
		//added list for test
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
		
		//checks if list contains certain values
		assertEquals(11, list.size());
		//assertEquals(21, list.get(7));
		assertTrue(list.contains(-3));
		assertFalse("should have 11 including index",list.isEmpty());
		//loops through and checks for value of -1, if doesnt exit will fail.
		
		Partit.partition(list, 5);

		ArrayList<Integer>newList = new ArrayList<Integer>();
		
		newList.add(15);
		newList.add(1);
		newList.add(6);
		newList.add(12);
		newList.add(-3);
		newList.add(4);
		newList.add(8);
		newList.add(21);
		newList.add(2);
		newList.add(30);
		newList.add(-1);
		
		
		
		//assertEquals(list, newList);
	
		
		
			for(int i = 0; i < 4; i++) {
				assertTrue(list.get(i)<(5));
				
				
			
			
			
		
			}
			
			
			}
	
}


	
	


