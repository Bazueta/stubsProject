package project;
import java.util.*;

public class Model {
	Player player;
	ArrayList<ScoringObject> scoringObjList = new ArrayList<>();
	Scoring score;
	Model(){
		player = new Osprey(100,100,2,2);
		ScoringObject sobj1 = new ScoringObject(100,100,2,2,1,"2");
		ScoringObject sobj2 = new ScoringObject(100,100,-2,-2,2,"3");
		scoringObjList.add(sobj1);
		scoringObjList.add(sobj2);
	}
	
	/**
	 * updates locations of all the moving objects
	 * @param none
	 * @return none
	 * @author Ken Chan
	 */
	public void updateGame() {
		player.move();
		for(ScoringObject scoringObj: scoringObjList) {
			scoringObj.move();
		}
	}

}
