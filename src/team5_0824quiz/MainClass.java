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
						break;
					case 2 : // Ư���л� ������
						// Ư���л� ������ method �ڸ�
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
						mc.arr.add(sim.register());
						break;
					case 2 : // �л����� ����
						sim.edit(mc.arr);
						break;
					case 3 : // �л����� ����
						mc.arr = sim.delete(mc.arr);
						break;
					case 4 :
						System.out.println("Page�� �����ϴ�.\n");
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���.\n");
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
