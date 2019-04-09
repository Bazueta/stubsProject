package project;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

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
	
	//Scoring Class
	@Test
	public void ScoringTest() {
		Scoring scoring = new Scoring();
		ScoringObject sobj1 = new ScoringObject(100,100,2,2,1,"3");
		ScoringObject sobj2 = new ScoringObject(100,100,2,2,1,"3");
		ScoringObject sobj3 = new ScoringObject(100,100,2,2,2,"4");
		assertEquals(scoring.updateScore(sobj1),true);
		scoring.updateScore(sobj2);
		//assertEquals(scoring.ScoringTable.get("3"),2);
	}
	
}
