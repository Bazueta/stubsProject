package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testing {
	//Osprey Class
	@Test
	public void OspreyMoveTest1() {
		Osprey o1 = new Osprey(0,0,1,1);
		o1.move();
		assertEquals(1,o1.xloc);
		assertEquals(1,o1.yloc);
	}
	@Test
	public void OspreyMoveTest2() {
		Osprey o2 = new Osprey(50,20,5,-1); 
		o2.move();
		o2.move();
		assertEquals(60,o2.xloc);
		assertEquals(18,o2.yloc);
	}
	@Test
	public void OspreyMoveTest3() {
		Osprey o3 = new Osprey(10,30,30,10);
		o3.move();
		o3.move();
		o3.move();
		assertEquals(100, o3.xloc);
		assertEquals(60, o3.yloc);
	}
		
	
	//ScoringTest and ScoringObjectTest
	@Test
	public void ScoringTestandScoringObjectTest() {
		Scoring scoring = new Scoring();
		ScoringObject sobj1 = new ScoringObject(100,100,2,2,1,"3");
		ScoringObject sobj2 = new ScoringObject(100,100,-2,-2,1,"3");
		ScoringObject sobj3 = new ScoringObject(100,100,2,2,3,"4");
		assertEquals(scoring.updateScore(sobj1), true);
		assertEquals(scoring.updateScore(sobj2), true);
		assertEquals(scoring.updateScore(sobj3), true);
		assertEquals(scoring.amountContained("3"),2);
		sobj1.move();
		assertEquals(sobj1.xloc,102);
		assertEquals(sobj1.yloc,102);
		sobj2.move();
		assertEquals(sobj2.xloc,98);
		assertEquals(sobj2.yloc,98);
		sobj1.move();
		assertEquals(sobj1.xloc,104);
		assertEquals(sobj1.yloc,104);
		sobj2.move();
		assertEquals(sobj2.xloc,96);
		assertEquals(sobj2.yloc,96);
	}
	
}
