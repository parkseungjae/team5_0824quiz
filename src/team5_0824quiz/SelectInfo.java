package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectInfo {
	StudentInfo st = new StudentInfo();
	Scanner sc = new Scanner(System.in);

	public void displayStInfo(ArrayList<StudentInfo> arr) {
		int selectNum = 0;

		while(selectNum != 2) {
			System.out.println("�л� �̸��� �Է����ּ���");
			System.out.println(">>>");
			String name = sc.next();
			for(int i = 0; i< arr.size(); i++) {
				StudentInfo st1 = arr.get(i);
				if(name.equals(st1.getName())) {
					System.out.println("�̸� : " + st1.getName());
					System.out.println("���� : " + st1.getGender());
					System.out.println("�ּ� : " + st1.getAddr());
					System.out.println("���� : " + st1.getAge());
					System.out.println("���� : " + st1.getKor());
					System.out.println("���� : " + st1.getEng());
					System.out.println("���� : " + st1.getMath());
					System.out.println("-------------------");
					System.out.println("1.�ٸ��л� �������� 2.������");
					selectNum = sc.nextInt();
					name = null;
					switch(selectNum) {
					case 1:
						System.out.println("Ȯ���ϰ� ���� �л��� �̸��� �Է����ּ���.");
						continue;
					case 2:
						System.out.println("�л������˻��� �����ϴ�!");

					}
				}
			}
		}
	}
}
