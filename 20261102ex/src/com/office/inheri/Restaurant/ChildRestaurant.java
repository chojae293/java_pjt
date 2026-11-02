package com.office.inheri.Restaurant;

public class ChildRestaurant extends ParentRestaurant implements CheckList,CheckList2{
	
	public final static int PARENT_MENU	 = 1;
	public final static int CHILD_MENU 	 = 2;
	
	public void makeBokkeumbap() {
		
		System.out.println("아들 볶음밥");
	}
	
//	@Override
	public void makeJajang(int menu) {
		if (menu == PARENT_MENU) {
			super.makeJajang();
		}else {
			System.out.println("MZ세대 짜장");
		}
	}
	@Override
	public void makeTangsuyuk() {
		System.out.println("탕수육 만듦!!");
	}

	@Override
	public void checkFloor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkToilet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkHwagu() {
		// TODO Auto-generated method stub
		
	}
	
	

}
