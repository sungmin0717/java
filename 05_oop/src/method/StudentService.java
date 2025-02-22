package method;

import java.util.Scanner;

// 기능 제공용 클래스
public class StudentService {

	// 필드
	private Scanner sc = new Scanner(System.in); //Scanner 객체 생성
	
	/*
	 * 메인 메뉴 화면
	 * */
	
	public void mainMenu () {
		int input = 0; // 입력받은 메뉴 번호를 저장할 변수
	
		//생성된 학생 객체 주소를 저장할 참조 변수
		// (null : 참조하는 객체가 없다, 주소 저장 X)
		Student std = null;
		
			//do ~ while : 최소 1회 이상 반복하고싶을떄 
		do {
			System.out.println("\n ==== 학생1명 관리 프로그램 ====");
			
			System.out.println("1. 학생 등록");
			
			System.out.println("2. 학생 정보 확인");
			System.out.println("3. 학생 이름 수정");
			System.out.println("4. Java 공부하기");
			System.out.println("5. html 공부하기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 입력 : ");
			input = sc.nextInt();
			
			sc.nextLine(); // 입력 버퍼에 남아있는 엔터 제거하는 코드
			
			System.err.println(); // 줄바꿈
			//1 ~ 5
			switch(input){
			
			case 1: 
				std = registStdent();
				System.out.println(std.getName() + "학생 등록됨!!");
				break;
				
			case 2: 
				System.out.println("[학생 정보 확인]");
				//static은 클래스명붙혀서 호출
				System.out.println("학교 : "+ Student.schoolName);
				
				System.out.println(std.toString());
				
				break;
			case 3: 
				//학생 이름 수정 메서드 호출 시
				//std에 저장된 학생 객체 참조 주소 전달 (얕은 복사) 
				updateName(std);
				break;
			case 4: 
				studyJava(std);
				break;
			case 5: 
				studyHtml(std);
				break;
			
			case 0: System.out.println("====프로그램 종료====="); break;
			
			default: System.out.println("====알맞은 메뉴 번호를 입력해주세요 ====");
			}
			
	}while (input != 0); //메뉴 0 선택시 종료.
	//0이 입력되기 전까지는 무한히 반복, 0이 입력될시 빠져나간다
	}
	

	/**
	 * 
	 * 학생 등록 메서드
	 * @return 생성된 Student 객체의 주소 반환
	 */
	
	private Student registStdent() {
		
		System.out.println("[학생 등록]");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학번 : ");
		String studentNumber = sc.nextLine();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		
		Student student = new Student(name,studentNumber, gender);
		
		// student 변수에는 
		//생성된 Student 객체를 참조하는 주소 값 담겨있다!
		// -> 주소 값으 반환 
		// 		(== 주소 값이 복사되어 호출한 곳으로 돌아감)
		
		
		return student;
	}
	
	/**
	 * 학생이름 수정
	 * @param std : 전달 받은 Student 객체 참조 주소
	 */
	private void updateName(Student std) {
		
		System.out.println("[학생 이름 수정]");
		
		System.out.println("기존 이름 :" + std.getName());
		
		System.out.print("변경할 이름 입력 : ");
		String newName = sc.nextLine();
		
		//이름을 홍길동 -> 김철수 로 변경 하시겠습니까? (y/n)?
		System.out.printf("이름을 %s -> %s 로 변경 하시겠습니까? (y/n)",std.getName() ,newName );
		
		//String.toUpperCase() -> 대문자로 변환
		//String.toLowerCase() -> 소문자로 변환
		char check = sc.next().toLowerCase().charAt(0);
		
		if(check == 'n') { // 'n'이 입력된 경우
			System.out.println("=== 이름 변경 취소 ===");
			return;
		}
		//y가 입력되었을떄
		std.setName(newName); //새로운 이름을 std가 참조하는 객체에 세팅
		System.out.println("===이름 변경 완료!!===");
	}
	
	
	
	/**
	 *자바 공부 수행 -> std의 자바 역량 변경
	 *단, 수정된 자바 역량은 최다값(100), 최소값(0) 범위 초과 불가
	 *@param std
	 */
	public void studyJava(Student std) {
		System.out.println("[Java 공부하기]");
		
		int before = std.getJava(); // 이전 점수 저장
		System.out.println("현재 Java 역량 점수 : " +std.getJava());
		
		System.out.print("증가 또는 감소한 Java 역량 점수 입력 : ");
		int score = sc.nextInt();
		int temp =  std.getJava() + score; // 기존 점수  + 입력된 점수
		
		if(temp > Student.MAX_VALUE) {
			temp = Student.MAX_VALUE;
		}
		
		if(temp < Student.MIN_VALUE)
			temp = Student.MIN_VALUE;
		
		//기존 점수에 누적!!
		std.setJava(temp); // 참조하고 있는 학생 객체 Java 필드에 대입
		
		
		System.out.println("=== Java 역량 점수 수정 완료 ===");
		
		//기존 -> 변경 ()
		
		//50 -> 80 (+30)
		// 50 -> 30 (-20)
		
		//90 -> 100 (+30)
		// 10 -> 0 (-40)
		
		//음수인 경우 score
		//양수인 경우 +score
		String str = (score < 0) ? (score + "") : ("+" + score);
		System.out.printf("%d -> %d (%s)\n", before, std.getJava(), str);
	}
	
	/** HTML 역량 점수 변경
	 * @param std
	 */
	private void studyHtml(Student std) {
		System.out.println("[HTML 공부하기]");
		
		int before = std.getHtml(); 
		System.out.println("현재 HTML 역량 점수 : " + std.getHtml());
		
		
		System.out.print("증가 또는 감소한 HTML 역량 점수 입력 : ");
		int score = sc.nextInt();
		
		int temp = std.getHtml() + score; 
		
		if(temp > Student.MAX_VALUE) {
			temp = Student.MAX_VALUE;
		}
		
		if(temp < Student.MIN_VALUE) {
			temp = Student.MIN_VALUE;
		}
		
		std.setHtml(temp); 
		
		System.out.println("=== HTML 역량 점수 수정 완료 ===");
		
		String str = (score <= 0) ? (score + "") : ("+" + score);
		
		System.out.printf("%d -> %d (%s) \n", before, std.getHtml(), str);
	}
	
}
