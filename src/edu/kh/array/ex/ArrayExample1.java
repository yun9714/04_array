package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample1 {
	/* 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것(자료구조)
	 * - 묶여진 변수들은 하나의 배열 명으로 불려지고 구분은 index를 이용함
	 * (index는 0부터 시작하는 정수)
	 */
	public void ex1() {
		// 변수 vs 배열
		
		// 1-1)변수 선언
		int num; 
		// stack 영역에 int자료형을 저장할 수 있는 공간 4byte를 생성(할당)하고
		// 그 공간에 num이라는 이름을 부여
		
		// 1-2)변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10을 대입
		
		// 1-3)변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//--------------------------------------------
		
		// 2-1)배열 선언
		int[] arr;
		// stack영역에 int[] (int배열) 자료형 공간을 4byte할당하고
		// 그 공간에 arr이라는 이름을 부여
		// **해당 변수는 참조형으로 주소 값(4byte)만을 저장할 수 있음
		
		// 2-2)배열 할당
		arr = new int[3];
		// new : "new 연산자"라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)를 할당
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타냄
		// new int[3] : Heap영역에 int 3칸짜리 int[]을 생성(할당)
					// ** 생성된 int[]에는 시작주소가 지정된다!! **
		
		// 2-3)배열 요소 값 대입
		// arr은 int[] 참조형 변수이지만
		// arr[0] int 자료형 변수이기 때문에 정수값을 대입할 수 있다.
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		// 2-4)배열 요소 값 읽어오기
		System.out.println(arr); // 참조하는 주소값만 나옴
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];
		// 1) stack영역에 int[] 자료형 참조형 변수 arr 선언
		// 2) heap영역에 int 자료형 4개 묶음으로 다루는 int[] 할당
		// 3) 생성된 int[]의 주소를 arr에 대입하여 참조하는 형태를 만듦
		
		// 배열 길이(몇 칸인가?) : 배열명.length
		System.out.println("배열 길이 : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		// arr[4] = 1500; -> 입력 시 error, 길이보다 길다
		
		for(int i = 0; i < arr.length; i++) {
			// 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
	}
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		// 1번 키 입력 : 170.5	
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		// 입력 받은 키 : 170.5 165.7 184.3 190.2 174.4
		// 평균 : 177.02cm
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1번 키 입력 : ");
		double cm1 = sc.nextDouble();
		double[] arr = new double[4];
		arr[0] = cm1;
		System.out.print("2번 키 입력 : ");
		double cm2 = sc.nextDouble();
		arr[1]= cm2;
		System.out.print("3번 키 입력 : ");
		double cm3 = sc.nextDouble();
		arr[2] = cm3;
		System.out.print("4번 키 입력 : ");
		double cm4 = sc.nextDouble();
		arr[3] = cm4;
		System.out.print("5번 키 입력 : ");
		double cm5 = sc.nextDouble();
		arr[4] = cm5;
		double avg = (cm1 + cm2 + cm3 + cm4 + cm5) / 5;
		
		for(int i = 0; i < arr.length; i++) {
			// 0 1 2 3 4
			System.out.printf("입력받은 키 : %d\n", arr[i]);
		}System.out.println("평균 : " + avg);
	}

	
	
//
}
