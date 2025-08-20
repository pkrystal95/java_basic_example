## 자바 주석
 **주석(Comment)** 은 코드에 메모를 남기거나 설명을 붙이는 용도로 사용합니다. 프로그램 실행에는 영향을 주지 않아요.


## 자바 주석 종류

### 1. 한 줄 주석 (Single-line comment)

`//` 뒤에 오는 내용은 무시됩니다.

```java
public class Main {
    public static void main(String[] args) {
        // 화면에 메시지를 출력하는 코드
        System.out.println("Hello, Java!"); // 이것도 주석
    }
}
```


### 2. 여러 줄 주석 (Multi-line comment)

`/*` 와 `*/` 사이에 있는 내용은 전부 주석 처리됩니다.

```java
public class Main {
    public static void main(String[] args) {
        /*
         이 부분은 여러 줄 주석입니다.
         코드 설명을 길게 적을 때 사용합니다.
        */
        System.out.println("여러 줄 주석 연습");
    }
}
```

### 3. 문서 주석 (Documentation comment)

`/**` 로 시작하고 `*/` 로 끝납니다.
**Javadoc** 이라는 도구로 자동 문서를 만들 때 사용합니다.

```java
/**
 * 프로그램의 시작 클래스
 */
public class Main {
    /**
     * 프로그램 시작점
     * @param args 실행할 때 입력값
     */
    public static void main(String[] args) {
        System.out.println("문서 주석 예제");
    }
}
```
<br />

--- 

## IntelliJ 단축키

### 탐색 / 검색
| 기능         | Windows / Linux    | macOS          |
| ---------- | ------------------ | -------------- |
| 전체 검색      | `Double Shift`     | `Double Shift` |
| 클래스 검색     | `Ctrl+N`           | `Cmd+O`        |
| 파일 검색      | `Ctrl+Shift+N`     | `Cmd+Shift+O`  |
| 심볼 검색      | `Ctrl+Alt+Shift+N` | `Cmd+Alt+O`    |
| 네비게이션 바 열기 | `Alt+Home`         | `Cmd+Up`       |

### 코드 편집
| 기능                  | Windows / Linux          | macOS                  |
| ------------------- | ------------------------ | ---------------------- |
| 코드 자동 완성            | `Ctrl+Space`             | `Ctrl+Space`           |
| 스마트 자동 완성           | `Ctrl+Shift+Space`       | `Ctrl+Shift+Space`     |
| 구문 자동 완성            | `Ctrl+Shift+Enter`       | `Cmd+Shift+Enter`      |
| 주석 처리 (라인/블록)       | `Ctrl+/`, `Ctrl+Shift+/` | `Cmd+/`, `Cmd+Shift+/` |
| 현재 줄 복제             | `Ctrl+D`                 | `Cmd+D`                |
| 현재 줄 삭제             | `Ctrl+Y`                 | `Cmd+Backspace`        |
| 다음 줄 이동             | `Shift+Enter`            | `Shift+Enter`          |
| 코드 자동 정렬 (Reformat) | `Ctrl+Alt+L`             | `Cmd+Option+L`         |

### 이동
| 기능          | Windows / Linux         | macOS                                 |
| ----------- | ----------------------- | ------------------------------------- |
| 선언부로 이동     | `Ctrl+B`, `Ctrl+Click`  | `Cmd+B`, `Cmd+Click`                  |
| 이전/다음 파일 이동 | `Alt+Left`, `Alt+Right` | `Cmd+Option+Left`, `Cmd+Option+Right` |
| 최근 파일       | `Ctrl+E`                | `Cmd+E`                               |
| 최근 수정 파일    | `Ctrl+Shift+E`          | `Cmd+Shift+E`                         |

### 리팩토링
| 기능             | Windows / Linux | macOS          |
| -------------- | --------------- | -------------- |
| 이름 변경 (Rename) | `Shift+F6`      | `Shift+F6`     |
| 메서드 추출         | `Ctrl+Alt+M`    | `Cmd+Option+M` |
| 변수 추출          | `Ctrl+Alt+V`    | `Cmd+Option+V` |
| 필드 추출          | `Ctrl+Alt+F`    | `Cmd+Option+F` |
| 상수 추출          | `Ctrl+Alt+C`    | `Cmd+Option+C` |

### 실행 & 디버깅
| 기능               | Windows / Linux | macOS       |
| ---------------- | --------------- | ----------- |
| 실행               | `Shift+F10`     | `Ctrl+R`    |
| 디버깅 실행           | `Shift+F9`      | `Ctrl+D`    |
| Step Over        | `F8`            | `F8`        |
| Step Into        | `F7`            | `F7`        |
| Step Out         | `Shift+F8`      | `Shift+F8`  |
| Run to Cursor    | `Alt+F9`        | `Option+F9` |
| Breakpoint 설정/해제 | `Ctrl+F8`       | `Cmd+F8`    |

### 기타
| 기능           | Windows / Linux | macOS          |
| ------------ | --------------- | -------------- |
| 실행/디버깅 구성 검색 | `Double Ctrl`   | `Double Cmd`   |
| 액션 검색        | `Ctrl+Shift+A`  | `Cmd+Shift+A`  |
| 탭 전환         | `Ctrl+Tab`      | `Ctrl+Tab`     |
| 빠른 수정 제안     | `Alt+Enter`     | `Option+Enter` |
