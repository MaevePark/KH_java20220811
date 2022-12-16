package kh.java.a1;

import java.util.Scanner;
//import java.util.*; //유틸안에 종류가 많은데 뒤에 *; 을 붙이면 모든걸 퉁 칠수있다 

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hi Everyone!!");

		Scanner sc = new Scanner(System.in); // Scanner은 화면에 입력되는 데이터를 받아들이는 클래스

		sc.close();// 꼭 닫아줘라

		// TODO
		// Scanner; 작성을 하다만 코드를 보통 작성, 언젠가는 처리해야할 구간을 표시하고 설명을 붙일때 사용
		// 단축키 연습 필수

		// 주석

		/* System.out.println("Hi Everyone!!"); */
		// 범위 주석은 범위를 설정하고 ctrl + shift + / 누르면, 구간을 /* ~~ */ 주석으로 처리한다

		/** System.out.println("Hi Everyone!!"); */
		   // 여기서 /** 처럼 *을 한번더 누르면 색깔이 달라짐 -> 작성된 클래스에 대한 API 도큐먼트 문서에 기록될 내용 입력
		// javadoc 은 엑셀에 F1 키 같이 알림

		
	}

}
