package com.office.game;

public class AirPlane implements ICharactor {
	
	private void fly(int x, int y) {
		System.out.printf("%d, %로 날아간다.\n", x, y);
	}

	
	@Override
	public void run(int x, int y) {
		fly(x, y);
	}

}
