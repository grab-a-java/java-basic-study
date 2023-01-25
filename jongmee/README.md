# CH01~CH05 개념 정리

# #CH01
## 1. 자바의 특징
 1) 운영체제에 독립적 : JVM(자바가상머신)에 의해 응용프로그램이 동작하기 때문
 2) 객체지향언어
 3) 자동 메모리 관리(Gabage Collection) : garbage collector가 프로그램이 실행되면 자동으로 메모리 관리
 4) 네트워크와 분산처리 지원 : Java API(자바 라이브러리)를 통해 개발 가능
 5)  멀티쓰레드 지원 : 구현은 Java API를 통해 쉽게, 여러 쓰레드에 대한 스케줄링은 자바 인터프리터가 담당
 6)  동적 로딩(Dynamic Loading) 지원 : 여러 개의 클래스로 구성된 자바 응용프로그램(애플리케이션)은 실행 시에 모든 클래스가 로딩되지 않고 필요한 시점에 클래스를 로딩하여 사용
## 2. 동작 원리
 Hello.java → javac.exe가 컴파일 → Hello.class 생성 → java.exe가 실행 → “Hello, world!” 출력
## 3. 프로그램 작성 시
 1) 하나의 Java application에는 main 메서드를 포함한 클래스가 반드시 하나는 존재해야
 2) 소스파일의 이름은 public class의 이름과 일치해야

# #CH02
## 1. 변수의 타입
 1) 자료형은 크게 ‘기본형’과 ‘참조형’으로 나뉨
 2) 기본형 : boolean, char, byte, short, int, long, float, double → 변수 간 연산 가능
 3) 참조형: 객체의 주소를 저장, 위 8개의 기본형을 제외한 나머지 타입 → 변수 간 연산 불가능
    ```java
        Date today = new Date(); // Date 객체를 new 연산으로 생성해서, 그 주소를 today에 저장
    ```

# #CH04
## 1. 향상된 for문
    ```java
        for(타입 변수명 : 배열 또는 컬렉션){
            // 반복할 문장
                }
    ```
# #CH05
## 1. 배열의 선언과 생성
    ```java
        int[] score = new int[5];
    ```
## 2. 배열의 초기화
    ```java
        int score = new int[]{10, 20, 30, 40, 50}; // 배열의 생성과 초기화를 동시에
    ```
## 3. 배열의 복사
    ```java
        System.arraycopy(num, 0, newNum, 0, num.length); // num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
    ```
## 4. 참조형 배열
- 참조형 배열의 경우 배열에 저장되는 것은 객체의 주소이다.
- String 클래스는 char 배열에 메서드를 추가한 것이다.

## 5. 다차원 배열
    ```java
        int[][] arr = {
            {1, 2, 4},
            {3, 4, 5}};
    ```    
## 6. 가변 배열
    ```java
        int[][] score = new int[5][]; 
        int[][] score = {
                {1, 1, 2},
                {2},
                {2, 3, 4, 5, 6}};
    ```