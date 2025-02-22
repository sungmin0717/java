package ex;

public class variavle {

	/**
	 * [main method]
	 * <p>
	 * 자바 프로그램을 실행 시키기 위한 구문 (기능)
	 * </p>
	 * 
	 */

	public static void main(String[] args) {
//		변수 : 메모리에 값을 저장하는 공간
//		변수에 저장된 값은 바꿀 수 있음

		/*
		 * 자료형 (Data Type) - 변수에 저장되는 값으 종류/크기
		 * 
		 * [Java 기본 자료형 8가지]
		 * 
		 * -논리형 boolean (1byte) - true/false
		 * 
		 * -정수형- byte (1byte) short (2byte) int (4byte) - 정수 기본형 (123 -> int 인식) long
		 * (8byte) - 숫자 뒤에 l 또는 L 붙임 (123L)
		 * 
		 * -실수형- float (4byte) -숫자 뒤에 f 또는 F (3.14f) double (8byte) - 실수 기본형
		 * 
		 * -문자형- char (2byte) -문자 하나를 의미 , 'A' 형식으로 작성
		 */

		// 변수 선언 : 메모리에 값을 저장할 공간을 만듦 (== 할당)

		int num1;   // 메모리에 int형
					// 데이터(정수)를 저장하기 위한 공간 4btye를 할당하고
					// 변수 이름을 num1 이라고 지정

		// 자바는 초기화 (처음 값 대입) 되지 않은
		// 지역 변수를 추력, 연산할 수 없다!! (대입 연산만 가능)

		// The local variable num1 may not have been initialized
		// -> num1 변수가 초기화 되지 않았다
		//System.out.println(num1);
		
		//변수에 값 대입
		num1 = 2000;
		System.out.println(num1);
		
		System.out.println("-----------------------------------");
		System.out.println("[자료형별 리터럴 작성법]");
		
		// 논리형 (1byte)
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println("isTrue :" + isTrue);
		System.out.println("isFalse :" + isFalse);
		
		// JS에서는 true == 1 비교 가능 하지만 Java는 안됨.
		// 왜? 자료형이 같지 않아서 비교 불가
//		System.out.println(ture == 1);
		
		// [정수형]
		int intNum = 2147483647; //int 최대값
		
		//The literal 2147483648 of type int is out of range 
		//int 범위 초과 대입 -> 오류 발생
//		int intNum2 = 2147483648; //int 최대값 +1 
		
//		long longNum2 = 2147483648; //일반 정수값 == int (기본형)
		long longNum2 = 2147483648L; //일반 정수값 == int (기본형)
		System.out.println("intNum : " + intNum);
		System.out.println("longNum2 : " + longNum2);
		// longNum뒤에 L 안붙어서 출력됨
		// 코드에만 l 작성 출력시에는 미표기.
		
		//[실수형]
		// 
//		float floatNum = 1.23;
		float floatNum = 1.23f; // 뒤에 f == float 자료형
		//Type mismatch: cannot convert from double to float
		// -> float 변수에 double 값을 저장할 수 없다
		
		// 왜?  실수 기본형 double
		// (1.23처럼 보통 실수 표기법이 double로 인식됨)
		double doubleNum = 3.14;
		
		System.out.println("floatNum :" +floatNum);
		System.out.println("doubleNum :" +doubleNum);
		
		
		// [문자열]
		char ch1 = 'A'; //2byte, 리터럴 표기법('')
		char ch2 = '가';
		char ch3 = '♥';
		char ch4 = '㉾';
		
//		char ch5 = 'AB'; // 두개 안됨
//		char ch6 = "A"; //쌍따옴표 "" 안됨
		System.out.println("ch1 :"+ ch1);
		System.out.println("ch2 :"+ ch2);
		System.out.println("ch3 :"+ ch3);
		System.out.println("ch4 :"+ ch4);
		
		
		
		
		
		
		System.out.println("-------------------------------------");
		
		System.out.println("[float와 double의 차이점]");
		
		/* float (4btye) double (8byte)
		 * byte 크기가 float 2배라서 double이 아님!
		 * 
		 * 정확도가 2배 == 소수점 표션 자릿 수가 2배라서 double
		 * */
		
		
		//소수점 아래 19자리
		float test1 = 1.1234567890123456789f;
		double test2 = 1.1234567890123456789;
		System.out.println("test1 :"+ test1);
		System.out.println("test2 :"+ test2);
		
		/*String (문자열)
		 * - 기본 자료형 (8가지)에 포함되지 않음.
		 * 
		 * - 기본 자료형 O : 변수에 직접 값을 저장
		 * 
		 * - 기본 자료형 X : 변수에값의 위치 (주소)를 저장
		 *	 == 참조형 					ㄴ를 찾아감.
		 * */
		
		String str1 = "문자열 리터럴 표기법은 쌍따옴표";
		String str2 = "String은 주소를 저장하고 찾아가는 참조형";
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
