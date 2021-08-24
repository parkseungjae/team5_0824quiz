package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectInfo {
	StudentInfo st = new StudentInfo();
	Scanner sc = new Scanner(System.in);

	public void displayStInfo(ArrayList<StudentInfo> arr) {
		int selectNum = 0;

		while(selectNum != 2) {
			System.out.println("학생 이름을 입력해주세요");
			System.out.println(">>>");
			String name = sc.next();
			for(int i = 0; i< arr.size(); i++) {
				StudentInfo st1 = arr.get(i);
				if(name.equals(st1.getName())) {
					System.out.println("이름 : " + st1.getName());
					System.out.println("성별 : " + st1.getGender());
					System.out.println("주소 : " + st1.getAddr());
					System.out.println("나이 : " + st1.getAge());
					System.out.println("국어 : " + st1.getKor());
					System.out.println("영어 : " + st1.getEng());
					System.out.println("수학 : " + st1.getMath());
					System.out.println("-------------------");
					System.out.println("1.다른학생 정보보기 2.나가기");
					selectNum = sc.nextInt();
					name = null;
					switch(selectNum) {
					case 1:
						System.out.println("확인하고 싶은 학생의 이름을 입력해주세요.");
						continue;
					case 2:
						System.out.println("학생정보검색을 나갑니다!");

					}
				}
			}
		}
	}
}
