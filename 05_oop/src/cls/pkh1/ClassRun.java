package cls.pkh1;

public class ClassRun {

	public static void main(String[] args) {
		
		// public class + 같은 패키지 
		// ClassTest1 객체 생성 하기  ->  문제 O/X
		
		ClassTest1 t1 = new ClassTest1();
		t1.method();
		
		
		//(default) class + 같은 패키지
		DefaultClass d1 = new DefaultClass();
		d1.method();
		
//		System.out.println(f1.protectedValue);
		
		
	}
	
	
}
