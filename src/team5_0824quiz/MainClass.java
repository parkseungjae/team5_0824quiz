package team5_0824quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentInfo> arr = new ArrayList<StudentInfo>();
		int mainNum = 0, viewNum = 0, manageNum = 0;
		
		while(mainNum != 3) {
			System.out.println("=== �л� ���� �ý��� ===");
			System.out.println("1. �л����� ����");
			System.out.println("2. �л����� ����");
			System.out.println("3. ���α׷� ����");
			System.out.print(">>> ");
			mainNum = sc.nextInt();
			System.out.println();
			
			switch(mainNum) {
			case 1 : // �л����� ���� Page
				while(viewNum != 3) {
					System.out.println("== �л����� ���� Page ==");
					System.out.println("1. �л� ���(All)");
					System.out.println("2. Ư���л� ������");
					System.out.println("3. Page ������");
					System.out.print(">>> ");
					viewNum = sc.nextInt();
					System.out.println();
					
					switch(viewNum) {
					case 1 : // �л� ���(All)
						// �л� ���(All) method �ڸ�
						System.out.println();
						break;
					case 2 : // Ư���л� ������
						// Ư���л� ������ method �ڸ�
						System.out.println();
						break;
					case 3 :
						System.out.println("Page�� �����ϴ�.\n");
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���.\n");
					}
				}
				break;
			case 2 : // �л����� ���� Page
				StudentInfoManagement sim = new StudentInfoManagement();
				while(mainNum != 4) {
					System.out.println("== �л����� ���� Page ==");
					System.out.println("1. �л����� ���");
					System.out.println("2. �л����� ����");
					System.out.println("3. �л����� ����");
					System.out.println("4. Page ������");
					System.out.print(">>> ");
					mainNum = sc.nextInt();
					System.out.println();
					
					switch(mainNum) {
					case 1 : // �л����� ���
						
						arr.add(sim.register());
						// �л����� ��� method �ڸ�
						for(int i = 0; i < arr.size(); i++) {
		                    StudentInfo ss = arr.get(i);
		                    System.out.println("�̸� : " + ss.getName());
		                    System.out.println("���� : " + ss.getGender());
		                    System.out.println("�ּ� : " + ss.getAddr());
		                    System.out.println("���� : " + ss.getAge());
		                    System.out.println("���� : " + ss.getKor());
		                    System.out.println("���� : " + ss.getEng());
		                    System.out.println("���� : " + ss.getMath());
		                }
						System.out.println();
						break;
					case 2 : // �л����� ����
						// �л����� ���� method �ڸ�
						System.out.println();
						break;
					case 3 : // �л����� ����
						// �л����� ���� method �ڸ�
						System.out.println();
						break;
					case 4 :
						System.out.println("Page�� �����ϴ�.\n");
						break;
					}
				}
				break;
			case 3 :
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���.\n");
			}
		}
	}
}
