
public class Operator3 {
	public static void main(String[] args) {
		
		/*
		 * 비교 연산자 
		 * 크고 작음을 나타내는 연산자 입니다.
		 * 
		 * 
		 */
		System.out.println(10 < 20);   //true
		System.out.println(10 > 20);	//false
		
		System.out.println(10 <= 20); //true
		System.out.println(10 >= 20); //false
		
		System.out.println(10 == 20); //false
		System.out.println(10 != 20); //true
		
	//	System.out.println(10 === 20); //false
	//	System.out.println(10 !== 20); //false
		
		float num5 = 0.1f;        // 0.10000000149 > double       false <참고>
		double num6 = 0.1;		  // 0.10000000000 > double       true
		 
		System.out.println("num5: "+ num5);  //0.1
		System.out.println("num6: "+ num6);  //0.1
		System.out.println("num5 + num6: "+ (num5 + num6));  //0.2
		
		System.out.println("num5 == num6: "+ (num5 == num6)); //false         false인 이유 위에 참고
		System.out.println("num5 != num6: "+ (num5 != num6)); //true
		
		System.out.println("num5 > num6: "+ (num5 > num6));	//true
		System.out.println("num5 < num6: "+ (num5 < num6)); //false
		
		int num7 = 10;
		float num8 = 10.0f;
		
		// int + float => float + float  // num7 : 10.0         num8 : 10.0
		
		System.out.println("num7 > num8: "+ (num7 > num8));    //false
		System.out.println("num7 >= num8: "+ (num7 >= num8));  //true
		System.out.println("num7 < num8: "+ (num7 < num8));		//false
		System.out.println("num7 <= num8: "+ (num7 <= num8));	//true
		System.out.println("num7 == num8: "+ (num7 == num8));	//true
		System.out.println("num7 != num8: "+ (num7 != num8));	//false
		
		
		//********************************************************************************
		// 문자열 비교 <중요>
		String str1 = "hello";      
		String str2 = "hello";
		// 레퍼런스 타입이다. 기초데이터 타입이 아니다.
		
		System.out.println("str1 == str2: " + (str1 == str2));  //true
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		// 객체는 메모리에 객체를 new로 만들어주고 해야 한다.
		System.out.println("str3 == str4: "+ (str3 == str4));  //false
		// 주소가 달라서 false가 나온다. 
		
		System.out.println(str3.equals(str4));  // str3 == str4  true
		// equals는 주소만 보는 함수가 아니라 주소안에 값을 확인하는 함수다.
		
		// 문자열은 무조건 equals를 사용
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
