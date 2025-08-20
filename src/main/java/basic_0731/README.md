## **Java 기초 개념 정리**

### 1. **클래스와 메서드**

* **클래스 이름 규칙:** PascalCase → `Solution01`, `MyClass`
* **변수, 메서드 이름 규칙:** camelCase → `num`, `scannerInput()`
* **주석**

    * 한 줄: `//`
    * 여러 줄: `/* ... */`
    * JavaDoc: `/** ... */` (HTML 태그 사용 가능)

```java
/**
 * <p>JavaDoc 예시</p>
 * 🫠 마크다운 일부는 안되고 태그는 적용됨
 */
public class Solution01 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

---

### 2. **출력**

* `System.out.println()` : 줄바꿈 후 출력
* `System.out.print()` : 줄바꿈 없이 출력
* `\n` : 줄바꿈 escape 문자

```java
System.out.println("줄바꿈 출력");
System.out.print("줄바꿈 없이 출력");
System.out.print("\n"); // 직접 줄바꿈
```

---

### 3. **입력 (Scanner)**

* `Scanner sc = new Scanner(System.in);` → 입력 객체 생성
* 숫자 입력: `sc.nextInt()`
* 실수 입력: `sc.nextDouble()`, `BigDecimal` 사용 가능
* 문자열 입력:

    * 한 단어: `sc.next()`
    * 한 줄: `sc.nextLine()`
* 버퍼 문제 주의: 숫자 입력 후 `nextLine()` 필요

```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
sc.nextLine(); // 엔터 제거
String name = sc.nextLine();
sc.close();
```

---

### 4. **변수와 타입**

* **정수형:** `int` (32bit), `long` (64bit, L 붙임)
* **실수형:** `float`, `double`, `BigDecimal` (정밀도 높음)
* **문자열:** `String`
* **논리형:** `boolean`

```java
int a = 10;
long b = 30_000_000_000L; // _로 가독성
BigDecimal eye = sc.nextBigDecimal();
```

---

### 5. **연산자**

1. **산술 연산자:** `+ - * / %`

2. **대입/복합 대입:** `=, +=, -=, *=, /=, %=`

3. **증감 연산자:** `++`, `--`

    * `a++`: 후위 연산 (사용 후 증가)
    * `++a`: 전위 연산 (증가 후 사용)

4. **비교/관계 연산자:** `==, !=, >, <, >=, <=`

5. **논리 연산자:** `&&` (AND), `||` (OR), `!` (NOT)

    * 단축 평가: `&&` 앞이 false면 뒤 평가 안함, `||` 앞이 true면 뒤 평가 안함

```java
int a = 10;
a += 5; // a = 15
boolean c = (a > 10) && (a < 20); // true
```

---

### 6. **문자열 비교**

* `==` : **주소값 비교**
* `equals()` : **값 비교**

```java
String s1 = "1";
String s2 = new String("1");
System.out.println(s1 == s2); // false
System.out.println(s1.equals(s2)); // true
```

---

### 7. **입력 예제 통합**

```java
Scanner sc = new Scanner(System.in);

System.out.print("좋아하는 숫자 입력: ");
int num = sc.nextInt();
sc.nextLine(); // 버퍼 제거

System.out.print("좋아하는 아이돌 입력: ");
String idol = sc.nextLine();

System.out.println("좋아하는 숫자: " + num);
System.out.println("좋아하는 아이돌: " + idol);

sc.close();
```

---