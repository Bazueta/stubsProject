package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testing {

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
	
	@Test
	public void ScoringObjectTest() {
		
	}
}
