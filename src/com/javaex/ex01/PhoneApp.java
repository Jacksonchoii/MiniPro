package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//입력
		Reader Friends = new FileReader("C:\\javaStudy\\강의자료\\02.Java_Programming\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(Friends);
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("******************************");
		System.out.println("*       전화번호 관리 프로그램              *");
		System.out.println("******************************");
		
		while(true) {
			
			System.out.println("1. 리스트  2. 등록  3.삭제  4.검색  5.종료");
			System.out.println("--------------------------------------------");
			System.out.print(">메뉴번호: ");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				System.out.println("<1.리스트>");
				while(true) {
					String str = br.readLine();
					
					if(str == null)
						break;
				}
				break;
			case 2 :
				System.out.println("<2.등록>");
				break;
			case 3 :
				System.out.println("<3.삭제>");
				break;
			case 4:
				System.out.println("<4.검색>");
				break;
			case 5:
				System.out.println("********************************");
				System.out.println("*          감사합니다                           *");
				System.out.println("********************************");
				break;
			default :
				System.out.println("[다시 입력 해주세요.]");
				break;
		}
			if(num == 5) {
				break;
			}
			
		}
		
		br.close();
		sc.close();
	}

}
