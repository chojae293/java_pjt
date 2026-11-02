package com.office.inheri;

import com.office.inheri.Restaurant.ParentRestaurant;

import com.office.inheri.Restaurant.ChildRestaurant;

public class MainClass {

	public static void main(String[] args) {

//		ParentRestaurant parentRestaurant = new ParentRestaurant();
		
		
		ChildRestaurant childRestaurant = 
				new ChildRestaurant();
		childRestaurant.makeBokkeumbap();
		childRestaurant.makeJajang(childRestaurant.CHILD_MENU); 		//true: 아들 false:아빠
		childRestaurant.makeJjamppong();
		childRestaurant.makeTangsuyuk();
		
		
		
	}

}
