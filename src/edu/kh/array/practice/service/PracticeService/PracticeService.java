package edu.kh.array.practice.service.PracticeService;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	public void practice1() {
		// 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 짝수 번째 인덱스 값의 합을 출력하세요(0번째 인덱스는 짝수로 취급)
		// ex)
		// 1 2 3 4 5 6 7 8 9
		// 짝수 번째 인덱스 합 : 25
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.print("짝수 번째 인덱스 합 : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || i % 2 == 0) {
			sum += arr[i];
			}
		} System.out.println(sum);
	}
	public void practice2() {
		// 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		// 짝수 번째 인덱스 값의 합을 출력하세요(0번째 인덱스는 짝수로 취급)
		// ex)
		// 9 8 7 6 5 4 3 2 1
		// 홀수 번째 인덱스 합 : 20
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.print("홀수 번째 인덱스 합 : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 1) {
			sum += arr[i];
			}
		} System.out.println(sum);
	}
	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
		// ex)
		// 양의 정수 : 5
		// 1 2 3 4 5
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	public void practice4() {
		// 정수 5개를 입력받아 배열을 초기화하고
		// 검색할 정수를 하나 입력받아 배열에서 같은 수가 있는 인덱스를 찾아 출력
		// 배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다" 출력
		// ex)
		/*입력 0 : 5
		 *입력 1 : 8
		 *입력 2 : 9
		 *입력 3 : 10
		 *입력 4 : 4
		 *검색할 값 : 8
		 *인덱스 : 1
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("입력 "+ (i) + " : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int a = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a) {
				System.out.print("인덱스 : " + i);
				flag = true;
			} 
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	public void practice5() {
		// 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가
		// 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
		// 인덱스를 출력하세요
		// ex)
		// 문자열 : application
		// 문자 : i
		// application에 i가 존재하는 위치(인덱스) : 4 8
		// i 개수 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
			}
		}System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				count++;
			}
		}System.out.print(ch + " 개수 : " + count);
	}
	public void practice6() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 가각의 인덱스에 값을 초기화하세요
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
		/* ex)
		 * 정수 : 5
		 * 배열 0번째 인덱스에 넣을 값 : 4
		 * 배열 1번째 인덱스에 넣을 값 : -4
		 * 배열 2번째 인덱스에 넣을 값 : 3
		 * 배열 3번째 인덱스에 넣을 값 : -3
		 * 배열 4번째 인덱스에 넣을 값 : 2
		 * 4 -4 3 -3 2
		 * 총 합 : 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println(); 
		System.out.print("총 합 : " + sum);
	}
	public void practice7() {
		// 주민등록번호 번호를 입력받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요
		// ex)
		// 주민등록번호(-포함) : 123456-1234567
		// 123456-1******
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()]; // 14개
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		for(int i = 8; i < arr.length; i++) {
			arr[i] = '*';
		} System.out.println(arr);
	}
	public void practice8() {
		/* 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
    	 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
    	 * 다시 정수를 받도록 하세요.
    	 * ex)
    	 * 정수 : 4
    	 * 다시 입력하세요.
    	 * 정수 : -6
    	 * 다시 입력하세요.
    	 * 정수 : 5
    	 * 1, 2, 3, 2, 1
		 */
		
		
	
	}
	// practice8 다시
	public void practice9() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		// ex)
		// 발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice10() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				
				if(random == arr[x]) {
					i--;
					break;
					}
			}
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("최대값 : " + max);
		System.out.println();
		System.out.print("최소값 : " + min);
		}
	public void practice11() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요
		// ex)
		// 4 1 3 6 9 5 8 10 7 2 
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 45 + 1);
			arr[i] = random;
			
			for(int x = 0; x < i; x++) {
				
				if(random == arr[x]) {
					i--;
					break;
					}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void practice12() {
		// 로또 번호 자동 생성기 프로그램을 만들기.
		// (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		// ex)
		// 3 4 15 17 28 40
		
		// 1.크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2.배열에 중복 값 없이 1부터 45 사이의 난수 초기화
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int x = 0; x < i; x++) {
				if(lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}
		
		// 3. 오름차순 정렬(선택정렬)
		for(int i = 0; i < lotto.length; i++) { // 비교 주체
			for(int x = i + 1; x < lotto.length; x++) {
				if(lotto[i] > lotto[x]) {
					int temp = lotto[i];
					lotto[i] = lotto[x];
					lotto[x] = temp;
				}
			}
		}
		// 4.출력
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
	}
	// practice12 다시
	public void practice13() {
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력하세요. (중복 제거)
		// ex)
		// 문자열 : application
		// 문자열에 있는 문자 : a, p, l, i, c, t, o, n
		// 문자 개수 : 8
		
		// 1.사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		// 2.해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// 3.char배열에 중복값 존재할 경우 출력X
		int count = 0; // 문자 개수 카운트
		System.out.println("문자열에 있는 문자 : ");
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true; // 중복 체크용 flag
			
			for(int x = 0; x < i; x++) {
				if(arr[i] == arr[x]) {
					flag = false; // 중복이 발생했을 때
					break;
				}
			}
			if(flag) { // 중복이 발생하지 않았을 경우
				if(i == 0) {
					System.out.println(arr[i]);
				} else {
					System.out.println("," + arr[i]);
				} count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	// practice13 다시
	public void practice14() {
		// 사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
		// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		// 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		// 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		// 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
		// 1.첫 배열 크기 지정
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		
		// 2.첫 배열에서 저장할 문자열 입력 받기
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
			}
		
		// 3.반복이 시작되는 구간부터 무한루프로 작성하여 내부에 종료 조건을 만들어 break
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			// 4.값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') {
				// 5. 더 입력받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				// 6.새로 값을 입력받을 배열 생성 -> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사 + 새로운 문자열 입력 받기
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i];
					} else {
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				// 8.기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
				arr = newArr;
			} else if(ch == 'n' || ch == 'N') { // 9. 값을 더 입력하지 않은 경우
				break; // 반복문 종료
			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}System.out.println(Arrays.toString(arr));
	}
	// practice14 다시 
//
}