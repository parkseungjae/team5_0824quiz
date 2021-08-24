package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoManagement {
	Scanner sc = new Scanner(System.in);
	
	
	public StudentInfo register() {
		StudentInfo  si = new StudentInfo();
		String name,gender,addr;
		int age,kor,eng,math,sum,avg;

		System.out.println("학생 등록 ");
		System.out.println("이름 : ");
		si.setName(sc.next()); 
		System.out.println("성별 : ");
		si.setGender(sc.next()); 
		System.out.println("주소 : ");
		si.setAddr(sc.next()); 
		System.out.println("나이 : ");
		si.setAge(sc.nextInt());
		System.out.println("국어 : ");
		si.setKor(sc.nextInt());
		System.out.println("영어 : ");
		si.setEng(sc.nextInt());
		System.out.println("수학 : ");
		si.setMath(sc.nextInt()); 
		System.out.println("등록되었습니다.");
		
		return si;
		
	}
	public void edit() {


	}
	public void delete() {

	}
}
