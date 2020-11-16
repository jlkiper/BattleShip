/**
 * TestBattleField.java
 * 
 * This class will test the contents of this third
 * programming project.
 * 
 * @author Jaylon Kiper
 * @version 1.0
 * Programming Project 3
 * SP19
 */
public class TestBattleField {
	public static void main(String[] args) {
		
		HumanPlayer hp = new HumanPlayer();
		
		System.out.println(hp.reportStructure());
		
		Enemy2D ene = new Enemy2D();
		
		System.out.println(ene.reportStructure());

	}//end main

}//end class
