package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoManagement {
	Scanner sc = new Scanner(System.in);
	
	
	public StudentInfo register() {
		StudentInfo  si = new StudentInfo();
		String name,gender,addr;
		int age,kor,eng,math,sum,avg;

		System.out.println("�л� ��� ");
		System.out.println("�̸� : ");
		si.setName(sc.next()); 
		System.out.println("���� : ");
		si.setGender(sc.next()); 
		System.out.println("�ּ� : ");
		si.setAddr(sc.next()); 
		System.out.println("���� : ");
		si.setAge(sc.nextInt());
		System.out.println("���� : ");
		si.setKor(sc.nextInt());
		System.out.println("���� : ");
		si.setEng(sc.nextInt());
		System.out.println("���� : ");
		si.setMath(sc.nextInt()); 
		System.out.println("��ϵǾ����ϴ�.");
		
		return si;
		
	}
	public void edit() {


	}
	public void delete() {

	}
}
