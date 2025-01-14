package broadcastSchedule;

import java.util.Scanner;

public class BroadMain {
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int menu = 0;
		do {
			printMenu("프로그램 추가", "프로그램 수정", "프로그램 검색", "종료");
			menu = scan.nextInt();
			scan.nextLine();
			runMenu(menu);




		}while(menu != 4);






	

	}
public static void printMenu(String ... menus ) {
	printBar('-', 15);
	//메뉴가 없는 경우
	if(menus.length == 0) {
		System.out.println("메뉴 없음");
		return;
	}
	//메뉴들을 숫자를 붙여서 출력
	for(int i = 0; i < menus.length; i++) {
		String menu = menus[i];
		System.out.println(i+1 + ". " + menu);
	}
	printBar('-', 15);
	System.out.print("메뉴 선택 : ");
}
public static void printBar(char bar, int count) {
	for(int i = 1; i <= count; i++) {
		System.out.print(bar);
	}
	System.out.println();
}

private static void runMenu(int menu) {
	switch(menu) {
	case 1 :
		System.out.println("프로그램 추가");
		insBd();
		break;
	case 2 :
		System.out.println("프로그램 수정");
		modBd();
		break;
	case 3 :
		System.out.println("프로그램 검색");
		srcBd();
		break;
	case 4 : 
		System.out.println("종료");
		break;
	}
	return;
}


private static void srcBd() {
	System.out.println("프로그램 검색");
	
	
}
private static void modBd() {
	System.out.println("프로그램 수정");
	
}
private static void insBd() {
	System.out.println("프로그램 추가");
	
}

}
