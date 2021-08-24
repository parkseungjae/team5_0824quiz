package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoManagement {
	Scanner sc = new Scanner(System.in);

	public StudentInfo register() {
		StudentInfo si = new StudentInfo();

		System.out.println("학생 등록 ");
		System.out.print("이름 : ");
		si.setName(sc.next()); 
		System.out.print("성별 : ");
		si.setGender(sc.next()); 
		System.out.print("주소 : ");
		si.setAddr(sc.next()); 
		System.out.print("나이 : ");
		si.setAge(sc.nextInt());
		System.out.print("국어 : ");
		si.setKor(sc.nextInt());
		System.out.print("영어 : ");
		si.setEng(sc.nextInt());
		System.out.print("수학 : ");
		si.setMath(sc.nextInt()); 
		System.out.println("학생 정보가 등록되었습니다.\n");

		return si;
	}

	public void edit(ArrayList<StudentInfo> arr) {
		String name;
		int alterNum;

		System.out.print("수정할 사람의 이름 : ");
		name = sc.next();
		for(int i = 0; i < arr.size(); i++) {
			StudentInfo sss = arr.get(i);
			if(name.equals(sss.getName())) {
				System.out.println("수정할 학생정보");
				System.out.println("이름 : " + sss.getName());
				System.out.println("성별 : " + sss.getGender());
				System.out.println("주소 : " + sss.getAddr());
				System.out.println("나이 : " + sss.getAge());
				System.out.println("국어 : " + sss.getKor());
				System.out.println("영어 : " + sss.getEng());
				System.out.println("수학 : " + sss.getMath());
				System.out.println("\n수정할 항목을 선택하세요.");
				System.out.println("1.이름 2.성별 3.주소 4.나이\n5.국어 6.영어 7.수학 8.수정안함");
				System.out.print(">>> ");
				alterNum = sc.nextInt();
				System.out.println();

				switch(alterNum) {
				case 1 :
					System.out.println(sss.getName() + " 힉생의 이름 수정");
					System.out.print("수정할 이름 : ");
					sss.setName(sc.next());
					System.out.println("수정이 완료되었습니다.\n");
					break;
				case 2 :
					System.out.println(sss.getName() + " 힉생의 성별 수정");
					System.out.print("수정할 성별 : ");
					sss.setGender(sc.next());
					System.out.println("수정이 완료되었습니다.\n");
					break;
				case 3 :
					System.out.println(sss.getName() + " 힉생의 주소 수정");
					System.out.print("수정할 주소 : ");
					sss.setAddr(sc.next());
					System.out.println("수정이 완료되었습니다.\n");
					break;
				case 4 :
					System.out.println(sss.getName() + " 힉생의 나이 수정");
					System.out.print("수정할 나이 : ");
					sss.setAge(sc.nextInt());
					System.out.println("수정이 완료되었습니다.\n");
					break;
				case 5 :
					System.out.println(sss.getName() + " 힉생의 국어점수 수정");
					System.out.print("수정할 점수 : ");
					sss.setKor(sc.nextInt());
					System.out.println("수정이 완료되었습니다.\n");
					break;
				case 6 :
					System.out.println(sss.getName() + " 힉생의 영어점수 수정");
					System.out.print("수정할 점수 : ");
					sss.setEng(sc.nextInt());
					System.out.println("수정이 완료되었습니다.\n");
					break;
				case 7 :
					System.out.println(sss.getName() + " 힉생의 수학점수 수정");
					System.out.print("수정할 점수 : ");
					sss.setMath(sc.nextInt());
					System.out.println("수정이 완료되었습니다.\n");
					break;
				case 8 :
					System.out.println("수정을 하지 않습니다.\n");
					break;
				default :
					System.out.println("잘못 입력되었습니다.\n");
				}
				break;
			}
		}
	}

	public void delete() {
		
	}
}
