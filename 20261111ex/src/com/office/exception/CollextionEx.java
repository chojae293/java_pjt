package com.office.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.List;
import java.util.Map;

public class CollextionEx {

	public static void main(String[] args) {

		/*
		 * Arraylist : 배열을 업그레이드
		 */
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.remove(4);
		nums.remove(3);
		
		nums.add(2,100);
		
		nums.clear();  //[]
		
		Map<String, String> hashMap = new HashMap<String, String>();

		
		//String -> StringBuffer -> StringBuilder
		//Array  -> Vector        -> ArrayList
		
		List<Integer> nums2 = new Vector<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.remove(4);
		nums.remove(3);
		
		nums.add(2,100);
		
		nums.clear();  //[]

		//인터페이스의 힘 array와 벡터가 list를 바라보게 된 이유와 배경 그리고 내가 메서드를 만들면 list를 바라보게끔 만들수있게 가능하도록 인터페이스의 힘 
		//linked 리스트 현업에서 많이 사용 
		//set은 중복을 허용하지 않음 어레이나 벡터는 list라 중복이 가능할수도
		//인터페이스는 다형성때문에 사용 
		
	}

}
