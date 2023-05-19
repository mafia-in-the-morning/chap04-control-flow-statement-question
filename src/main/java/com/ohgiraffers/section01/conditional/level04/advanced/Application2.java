package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("월 급여 입력: ");
		int monthlySalary = scanner.nextInt();

		System.out.print("매출액 입력: ");
		int salesAmount = scanner.nextInt();

		double bonusRate;
		if (salesAmount >= 50000000) {
			bonusRate = 0.05;
		} else if (salesAmount >= 30000000) {
			bonusRate = 0.03;
		} else if (salesAmount >= 10000000) {
			bonusRate = 0.01;
		} else {
			bonusRate = 0.0;
		}

		int bonusAmount = (int) (salesAmount * bonusRate);
		int totalSalary = monthlySalary + bonusAmount;

		System.out.println("======================");
		System.out.println("매출액: " + salesAmount);
		System.out.println("보너스율: " + (bonusRate * 100) + "%");
		System.out.println("월 급여: " + monthlySalary);
		System.out.println("보너스 금액: " + bonusAmount);
		System.out.println("======================");
		System.out.println("총 급여: " + totalSalary);
	}

}
