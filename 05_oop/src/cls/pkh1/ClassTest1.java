package cls.pkh1;

/* class : 객체의 속성, 기능을 정의한 문서 (== 설계도)
 * 
 * [class 작성법]
 * 
 * [접근제한자] class 클래스명 {
 * 	
 * 필드 (속성 == 변수)
 * 
 * 기능 1 (생성자)
 * 
 * 기능2(메서드)
 *
 * }
 * 
 * [[class 작성시 알아야할것]]
 * 
 * - class명은 꼭 대문자로 시작!! (이후에는 카멜 표기법)
 * 
 * - 접근 제한자
 * 	1) (+)public
 * 		- 뜻 :
 *   같은 프로젝트에서 누구든지 해당 클래스를 
  	가져가서 (imprt) 해서 사용헐 수 있음
 * 
 * 	2) default
 * 
 * = () == 생략을 의미 -> class 왼쪽에 아무것도 안적음
 * ->가

 * 
 * 
 * */



public class ClassTest1 {
	public void method() {
		System.out.println("public은 어디서든 접근 가능");


	}
}
