package project;
import java.util.*;
public class Scoring {
	int totalScore;
	HashMap<ScoringObject,Integer> ScoringTable;
	
	public boolean updateScore(ScoringObject o) {
		if(ScoringTable.put(o, o.pointValue) != null) {
			return true;
		}
		else {
			return false;
		}
	}
}
