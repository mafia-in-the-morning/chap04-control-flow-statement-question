package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 * 
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 * 
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 * 
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */

		Scanner sc = new Scanner(System.in);
		System.out.print("받으신 금액을 입력하세요: ");
		int receivedMoney = sc.nextInt();
		System.out.print("상품 가격을 입력하세요: ");
		int productPrice = sc.nextInt();
		int change = receivedMoney - productPrice;

		int change50000;
		int change10000;
		int change5000;
		int change1000;
		int change500;
		int change100;
		int change50;
		int change10;

		change50000 = change / 50000;
		change = change %= 50000;

		change10000 = change / 10000;
		change = change %= 10000;

		change5000 = change / 5000;
		change = change %= 5000;

		change1000 = change / 1000;
		change = change %= 1000;

		change500 = change / 500;
		change = change %= 500;

		change100 = change / 100;
		change = change %= 100;

		change50 = change / 50;
		change = change %= 50;

		change10 = change / 10;
		change = change %= 10;

		System.out.println("===========================");
		System.out.println("50000원권 지폐 " + change50000 + "장");
		System.out.println("10000원권 지폐 " + change10000 + "장");
		System.out.println("5000원권 지폐 " + change5000 + "장");
		System.out.println("1000원권 지폐 " + change1000 + "장");
		System.out.println("500원권 동전 " + change500 + "개");
		System.out.println("100원권 동전 " + change100 + "개");
		System.out.println("50원권 동전 " + change50 + "개");
		System.out.println("10원권 동전 " + change10 + "개");
		System.out.println("===========================");
		System.out.println("거스름돈: "+ (receivedMoney - productPrice));
	}

}
