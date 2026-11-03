package com.office.game;

public class Game {
	
	private Bear bear;
	
	private Robot robot;
	
	private Dog dog;
	
	private AirPlane airPlane;
	
	private ICharactor[] iCharactors;
	
	public Game(Bear bear, Robot robot, Dog dog, AirPlane airPlane) {
		this.bear = bear;
		this.robot = robot;
		this.dog = dog;
		this.airPlane = airPlane;
		
		iCharactors = new ICharactor[] {
				this.bear,
				this.robot,
				this.airPlane,
				this.dog
		};
	}
	
	
	
	
	public void move(int x, int y) {
//		bear.run(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPlane.run(x, y);
		
		for (int i = 0; i < iCharactors.length; i++) {
			
		}
		
	}

	
	public void execute() {
		
	}

}
