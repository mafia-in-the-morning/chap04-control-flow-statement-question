package com.ohgiraffers.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("정수를 입력하세요 : ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0){
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
	}
}

