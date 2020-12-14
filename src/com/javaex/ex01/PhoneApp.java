package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 입력
		Reader fr = new FileReader("C:\\javaStudy\\강의자료\\02.Java_Programming\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		// 스캐너
		Scanner sc = new Scanner(System.in);

		List<Person> pList = new ArrayList<Person>();

		System.out.println("******************************");
		System.out.println("*       전화번호 관리 프로그램              *");
		System.out.println("******************************");

		while (true) {

			System.out.println("1. 리스트  2. 등록  3.삭제  4.검색  5.종료");
			System.out.println("--------------------------------------------");
			System.out.print(">메뉴번호: ");

			int num = sc.nextInt();

			String str = br.readLine();

			if (str == null) {
				break;
			}
			
			switch (num) {
			case 1:
				System.out.println("<1.리스트>");
				
				String[] data = str.split(",");
				Person person01 = new Person(data[0], data[1], data[2]);
				pList.add(person01);

				for (int i = 0; i < pList.size(); i++) {
					System.out.print((i + 1) + "." + "   ");
					pList.get(i).showInfo();
				}
				//System.out.println(pList.toString());
				break;
				
			case 2:
				
				Writer fw = new FileWriter("C:\\javaStudy\\강의자료\\02.Java_Programming\\PhoneDB.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				Person person02 = new Person();
				
				System.out.println("<2.등록>");
				
				System.out.print(">이름: ");
				person02.setName(sc.next());
				
				System.out.print(">휴대전화: ");
				person02.setHp(sc.next());

				System.out.print(">회사전화: ");
				person02.setCompany(sc.next());

				pList.add(person02);
				
				for (Person p : pList) {
					String str1 = p.getName() + "," + p.getHp() + "," + p.getCompany();
					bw.write(str1);
					bw.newLine();
				}
				System.out.println("[등록되었습니다.]");
				System.out.println("");
				
				bw.close();
				
				break;
				
			case 3:
				Writer fw2 = new FileWriter("C:\\javaStudy\\강의자료\\02.Java_Programming\\PhoneDB.txt");
				BufferedWriter bw2 = new BufferedWriter(fw2);
				
				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				
				int num2 = sc.nextInt();
				pList.remove((num2 - 1));
				
				for (Person p : pList) {
					String str1 = p.getName() + "," + p.getHp() + "," + p.getCompany();
					bw2.write(str1);
					bw2.newLine();
				}
				System.out.println("[삭제되었습니다.]");
				System.out.println("");
				
				bw2.close();
				
				break;
				
			case 4: //실패
				System.out.println("<4.검색>");
				break;
			case 5:
				System.out.println("********************************");
				System.out.println("*          감사합니다                           *");
				System.out.println("********************************");
				break;
			default:
				System.out.println("[다시 입력 해주세요.]");
				break;
			}
			if (num == 5) {
				break;
			}

		}

		br.close();
		sc.close();
	}

}
