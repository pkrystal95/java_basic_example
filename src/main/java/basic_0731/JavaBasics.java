package step1;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Java 기초 실습
 * 1. 출력(System.out)
 * 2. 입력(Scanner)
 * 3. 변수와 타입
 * 4. 연산자(산술, 비교, 논리, 증감)
 */
public class JavaBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================
        // 1. 출력 예제
        // =========================
        System.out.println("큰따옴표로 묶인 문자열 출력");
        System.out.println(123456);

        System.out.print("줄바꿈 없이 출력 ");
        System.out.print("계속 출력");
        System.out.println(" <- 줄바꿈 포함");

        // =========================
        // 2. 입력 예제
        // =========================
        System.out.print("좋아하는 숫자를 입력하세요: ");
        int num = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        System.out.println("당신이 좋아하는 숫자: " + num);

        System.out.print("좋아하는 아이돌을 입력하세요: ");
        String idol = sc.nextLine();
        System.out.println("당신이 좋아하는 아이돌: " + idol);

        System.out.print("시력을 입력해주세요: ");
        BigDecimal eye = sc.nextBigDecimal(); // 부동소수점 오차 없이 입력
        System.out.println("당신의 시력: " + eye);

        // =========================
        // 3. 변수와 타입
        // =========================
        int a = 10;        // 정수형
        long b = 30_000_000_000L; // long형, 큰 숫자
        double d = 3.14;   // 실수형
        boolean flag = true; // 논리형
        String name = "홍길동"; // 문자열

        System.out.println("a + b = " + (a + b));
        System.out.println("이름: " + name + ", 플래그: " + flag);

        // =========================
        // 4. 연산자
        // =========================
        // 산술
        System.out.println("1 + 2 = " + (1 + 2));
        System.out.println("10 / 3 = " + (10 / 3));
        System.out.println("10 / 3.0 = " + (10 / 3.0));
        System.out.println("10 % 3 = " + (10 % 3));

        // 문자열 연결
        System.out.println("문자열 + 숫자 = " + ("사자" + 10));

        // 대입, 복합 대입
        a += 5;   // a = a + 5
        System.out.println("a += 5 -> " + a);
        a++;      // a = a + 1
        System.out.println("a++ -> " + a);

        // 비교 연산
        System.out.println("1 == 1 : " + (1 == 1));
        System.out.println("1 != 2 : " + (1 != 2));

        // 문자열 비교
        String s1 = "1";
        String s2 = "1";
        String s3 = new String("1");
        System.out.println("s1 == s2 : " + (s1 == s2)); // 주소 비교
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // 값 비교

        // 논리 연산
        boolean c1 = num++ == 0;
        boolean c2 = num++ == 1;
        System.out.println("c1 || c2 : " + (c1 || c2));
        System.out.println("num 최종값: " + num);

        // Scanner 종료
        sc.close();
    }
}
