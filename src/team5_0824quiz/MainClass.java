package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	ArrayList<StudentInfo> arr = new ArrayList<StudentInfo>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainClass mc = new MainClass();
		int mainNum = 0, viewNum = 0, manageNum = 0;

		while(mainNum != 3) {
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("1. 학생정보 열람");
			System.out.println("2. 학생정보 관리");
			System.out.println("3. 프로그램 종료");
			System.out.print(">>> ");
			mainNum = sc.nextInt();
			System.out.println();

			switch(mainNum) {
			case 1 : // 학생정보 열람 Page
				while(viewNum != 3) {
					System.out.println("== 학생정보 열람 Page ==");
					System.out.println("1. 학생 목록(All)");
					System.out.println("2. 특정학생 상세정보");
					System.out.println("3. Page 나가기");
					System.out.print(">>> ");
					viewNum = sc.nextInt();
					System.out.println();

					switch(viewNum) {
					case 1 : // 학생 목록(All)
						// 학생 목록(All) method 자리
						break;
					case 2 : // 특정학생 상세정보
						// 특정학생 상세정보 method 자리
						break;
					case 3 :
						System.out.println("Page를 나갑니다.\n");
						break;
					default :
						System.out.println("다시 입력하세요.\n");
					}
				}
				break;
			case 2 : // 학생정보 관리 Page
				StudentInfoManagement sim = new StudentInfoManagement();
				while(mainNum != 4) {
					System.out.println("== 학생정보 관리 Page ==");
					System.out.println("1. 학생정보 등록");
					System.out.println("2. 학생정보 수정");
					System.out.println("3. 학생정보 삭제");
					System.out.println("4. Page 나가기");
					System.out.print(">>> ");
					mainNum = sc.nextInt();
					System.out.println();

					switch(mainNum) {
					case 1 : // 학생정보 등록
						mc.arr.add(sim.register());
						break;
					case 2 : // 학생정보 수정
						sim.edit(mc.arr);
						break;
					case 3 : // 학생정보 삭제
						mc.arr = sim.delete(mc.arr);
						break;
					case 4 :
						System.out.println("Page를 나갑니다.\n");
						break;
					default :
						System.out.println("다시 입력하세요.\n");
					}
				}
				break;
			case 3 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("다시 입력하세요.\n");
			}
		}
	}
}
