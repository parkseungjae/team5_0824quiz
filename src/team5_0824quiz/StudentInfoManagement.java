package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoManagement {
	Scanner sc = new Scanner(System.in);

	public StudentInfo register() {
		StudentInfo si = new StudentInfo();

		System.out.println("�л� ��� ");
		System.out.print("�̸� : ");
		si.setName(sc.next()); 
		System.out.print("���� : ");
		si.setGender(sc.next()); 
		System.out.print("�ּ� : ");
		si.setAddr(sc.next()); 
		System.out.print("���� : ");
		si.setAge(sc.nextInt());
		System.out.print("���� : ");
		si.setKor(sc.nextInt());
		System.out.print("���� : ");
		si.setEng(sc.nextInt());
		System.out.print("���� : ");
		si.setMath(sc.nextInt()); 
		System.out.println("�л� ������ ��ϵǾ����ϴ�.\n");

		return si;
	}

	public void edit(ArrayList<StudentInfo> arr) {
		String name;
		int alterNum;

		System.out.print("������ ����� �̸� : ");
		name = sc.next();
		for(int i = 0; i < arr.size(); i++) {
			StudentInfo sss = arr.get(i);
			if(name.equals(sss.getName())) {
				System.out.println("������ �л�����");
				System.out.println("�̸� : " + sss.getName());
				System.out.println("���� : " + sss.getGender());
				System.out.println("�ּ� : " + sss.getAddr());
				System.out.println("���� : " + sss.getAge());
				System.out.println("���� : " + sss.getKor());
				System.out.println("���� : " + sss.getEng());
				System.out.println("���� : " + sss.getMath());
				System.out.println("\n������ �׸��� �����ϼ���.");
				System.out.println("1.�̸� 2.���� 3.�ּ� 4.����\n5.���� 6.���� 7.���� 8.��������");
				System.out.print(">>> ");
				alterNum = sc.nextInt();
				System.out.println();

				switch(alterNum) {
				case 1 :
					System.out.println(sss.getName() + " ������ �̸� ����");
					System.out.print("������ �̸� : ");
					sss.setName(sc.next());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				case 2 :
					System.out.println(sss.getName() + " ������ ���� ����");
					System.out.print("������ ���� : ");
					sss.setGender(sc.next());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				case 3 :
					System.out.println(sss.getName() + " ������ �ּ� ����");
					System.out.print("������ �ּ� : ");
					sss.setAddr(sc.next());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				case 4 :
					System.out.println(sss.getName() + " ������ ���� ����");
					System.out.print("������ ���� : ");
					sss.setAge(sc.nextInt());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				case 5 :
					System.out.println(sss.getName() + " ������ �������� ����");
					System.out.print("������ ���� : ");
					sss.setKor(sc.nextInt());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				case 6 :
					System.out.println(sss.getName() + " ������ �������� ����");
					System.out.print("������ ���� : ");
					sss.setEng(sc.nextInt());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				case 7 :
					System.out.println(sss.getName() + " ������ �������� ����");
					System.out.print("������ ���� : ");
					sss.setMath(sc.nextInt());
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				case 8 :
					System.out.println("������ ���� �ʽ��ϴ�.\n");
					break;
				default :
					System.out.println("�߸� �ԷµǾ����ϴ�.\n");
				}
				break;
			}
		}
	}

	public void delete() {
		
	}
}
