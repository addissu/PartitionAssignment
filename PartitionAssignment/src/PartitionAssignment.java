import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PartitionAssignment {

	@Test
	void test() {
		List<Integer> list = new LinkedList<Integer>();
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
		if(!list.contains(-1)) {
			fail();
		}
	}

}
