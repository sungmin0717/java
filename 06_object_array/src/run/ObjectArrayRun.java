package run;

import service.MemberService;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		
		// MemberService 객체 생성
		// ->MemberService 생성자를 작성한 적 없다
		// --> 그러면 컴파일러가 "기본생성자"를 만들어준다
		MemberService service = new MemberService();
		
		service.method1();
		
	}
}
