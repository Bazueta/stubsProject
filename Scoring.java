package project;
import java.util.*;
public class Scoring {
	int totalScore;
	HashMap<String,Integer> ScoringTable = new HashMap<>();
	
	public boolean updateScore(ScoringObject o) {
		Integer pointvalue = ScoringTable.put(o.ID, o.pointValue);
		if(ScoringTable.containsKey(o.ID)) {
			return true;
		}
		else {
			return false;
		}
	}
}
