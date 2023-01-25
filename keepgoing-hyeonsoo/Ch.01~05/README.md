# Ch 1.

## 자바의 특징

1. 운영체제에 독립적이다

   자바어플리케이션 → JVM → OS → 하드웨어

   JVM 이 OS 와 직접적인 통신을 하므로 자바 어플리케이션은 OS 에 독립적이다.

   ( JVM 은 OS 에 의존적이여서 OS 마다 다른 JVM 이 존재한다. )

2. 객체지향언어이다.
3. 가비지콜렉터가 메모리 관리를 자동으로 해준다.
4. 네트워크와 분산처리를 지원한다.
5. 멀티쓰레드를 지원한다.

   일반적으로 멀티쓰레드 프로그램 구현은 OS 마다 달라야 하는데 자바는 JVM 에 의해 컴파일되므로 OS 에 상관없이 멀티쓰레드 프로그램을 구현할 수 있다.

6. 동적 로딩(Dynamic Loading) 을 지원한다.

   자바 프로그램은 클래스 단위로 이뤄지는데, 실행 시에 모든 클래스가 로딩되지 않고 필요한 시점에만 클래스가 로딩된다.

## JVM

Java 는 컴파일 언어 이면서 인터프리터 언어인데, JVM(Java Virtual Machine)은 단순한 컴파일러나 인터프리터가 아닌 Java 런타임 환경을 제공하는 가상머신이다.

![출처 : [https://www.nowwatersblog.com/cs/JVM](https://www.nowwatersblog.com/cs/JVM)](imgs/Untitled.png)

출처 : [https://www.nowwatersblog.com/cs/JVM](https://www.nowwatersblog.com/cs/JVM)

1. javac 컴파일러가 자바 파일(.java) 을 바이트코드(.class) 로 변환한다.
2. JVM 의 class loader 가 바이트코드를 JVM 메모리 영역으로 로딩한다.
3. 로딩된 클래스 파일은 JVM 의 Execution Engine 에 의해 해석된다.
   1. java interpreter : 바이트코드를 하나씩 읽어서 해석하고 실행한다. 실행속도가 비교적 느리다.
   2. JIT (Just In Time) Compiler : 인터프리터의 단점을 보완하기 위해 도입됐으며, 바이트 코드 전체를 컴파일하여 바이너리 코드로 변환하고 실행한다. 실행속도가 비교적 빠르다.
4. 바이트코드가 실행되는 과정에서 JVM 은 필요에 따라 스레드 동기화나 GC 같은 메모리 작업을 수행한다.

## Runtime Data Area (JVM Memory)

1. Heap 영역

   런타임에 동적으로 할당되는 데이터가 저장되는 영역. GC 의 대상이 되는 영역이다.

2. Stack 영역

   지역변수, 매개변수, 메서드 정보 등을 저장

3. Method 영역

   JVM 이 시작될 때 생성되고, JVM 이 읽은 클래스, 메서드 코드 등을 저장한다.

4. PC Register

   Thread 가 생성될 때마다 생기는 공간으로 Thread 가 어떤 명령을 실행하게 될 지 기록

[JVM의 Runtime Data Area](https://www.holaxprogramming.com/2013/07/16/java-jvm-runtime-data-area/)

## java 프로그램 작성 시 유의

### main 메서드

Java 어플리케이션은 main 메서드의 호출로 시작해서 main 메서드가 수행을 마치면 종료된다.

따라서 Java 어플리케이션에는 main 메서드를 포함한 클래스가 적어도 하나는 존재해야 한다.

### java 소스파일 명

1. java 소스파일의 이름은 public class 명과 동일해야한다.

   ```java
   // 파일명은 Hello2.java 여야 한다.

   public class Hello2() {..}

   class Hello3() {..}
   ```

2. public class 가 없다면, 소스파일 내의 어떤 class 이름으로 해도 상관없다.

   ```java
   // 파일명은 Hello2.java 와 Hello3.java 둘 다 가능

   class Hello2() {..}

   class Hello3() {..}
   ```

3. 일반적으로 하나의 소스파일에 하나의 클래스를 정의하지만, 여러 클래스를 정의해도 상관없다. 단 public class 는 딱 하나만 존재해야 한다.

## java 프로그램 실행 과정

Hello 클래스 작성

```java
// Hello.java

package ch1;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

[Hello.java](http://Hello.java) 컴파일

```bash
$ javac Hello.java
```

컴파일을 하면 `Hello.class` 라는 바이트코드가 생성된다.

![Untitled](imgs/Untitled%201.png)

바이트코드를 인터프리터로 실행

```bash
$ java ch1.Hello

Hello World!
```

`java ch1.Hello` 의 내부 동작은 아래와 같다.

1. Hello.class 파일에서 실행에 필요한 클래스를 로드한다.
2. 클래스(Hello) 문법을 검사한다.
3. 클래스(Hello) 에서 main 메서드를 호출한다.

# Ch 2.

## 변수

프로그래밍에서 변수란 변하는 수 보다는 **값을 저장할 수 있는 메모리 상의 공간**을 의미한다.

<aside>
☝🏻 자바 권장 컨벤션

1. 클래스 첫 글자는 대문자
2. 변수, 메서드 첫 글자는 소문자
3. 상수 이름은 대문자로 하고, 여러 문자로 이루어진 경우는 ‘\_’ 로 구분

</aside>

### 변수의 타입

자료형(data type) : 값(data) 의 종류(type) 에 따라 값이 **저장될 공간의 크기**와 **저장형식**을 정의한 것

자료형은 기본형과 참조형으로 나뉠 수 있다.

1. 기본형(primitive type)

   실제 값을 저장한다.

   논리형(`boolean`), 문자형(`char`), 정수형(`byte`,`short`,`int`,`long`), 실수형(`float`,`double`)

   ![Untitled](imgs/Untitled%202.png)

1. 참조형(reference type)

   객체의 주소를 저장한다. 위의 기본형이 아닌 나머지 타입이 참조형이다.

   ex)

   ```java
   Date today = new Date();

   // Data 객체를 생성해서, 그 주소를 today 에 저장
   ```

## 상수와 리터럴 (constant & literal)

### 상수(constant)

- 변수와 달리 한 번 값을 저장하면 다른 값으로 변경 불가
- 변수의 타입 앞에 `final` 키워드를 붙여준다.
  ```java
  final int MAX_SPEED = 10;
  ```
- 선언만 하면 안 되고, 선언과 동시에 초기화까지 해야함.

  ```java
  final int MAX_SPEED; // error. 상수는 선언과 동시에 초기화해야함

  final int MAX_VALUE = 100; // ok
  ```

### 리터럴(literal)

- 그 자체로 값을 의미하는 것
  12, 3.14, ‘A’ 와 같은 값이 리터럴이다.

  ```java
  int year = 2014;
  final int MAX_VALUE = 100;

  // year : 변수
  // MAX_VALUE : 상수
  // 2014, 100 : 리터럴
  ```

- 리터럴 접미사

  자바에서는 리터럴마다 타입이 따로 존재하는데, 변수의 타입과 리터럴의 타입을 맞춰줘야 한다.

  long 과 float 사용 시에만 명시적으로 접미사를 붙여줘야 한다.

  - 정수형 long type : 접미사 `L`(또는 소문자 `l`)
  - 실수형 float type : 접미사 `F`(또는 소문자 `f`)
    ![float 에 1.0 (double) 을 할당하려고 하니 에러가 나는 모습](imgs/Untitled%203.png)
    float 에 1.0 (double) 을 할당하려고 하니 에러가 나는 모습
    자바에서 실수형 기본은 double 타입이기 때문에 float 을 쓰고 싶다면 `1.0F` 로 써야 한다.
    ![1.0 에 접미사 F 를 붙히니 정상작동](imgs/Untitled%204.png)
    1.0 에 접미사 F 를 붙히니 정상작동

- 문자 리터럴과 문자열 리터럴

  - 문자 리터럴 : 홑따옴표 사용
    ```java
    char ch = 'J';
    ```
  - 문자열 리터럴 : 쌍따옴표 사용

    ```java
    String name = "Java";
    ```

    cf) 문자열 리터럴은 빈 문자열도 허용하지만, 문자 리터럴은 빈 문자를 허용하지 않는다.

    ```java
    String str = ""; // OK

    char ch = ''; // error

    char ch = ' '; // 공백문자는 ok
    ```

  - 문자열 과 다른 타입의 덧셈연산
    신기하게도 java 같은 강타입 언어에서 문자열과 다른 타입의 덧셈연산을 허용해준다.
    이 때 다른 타입은 문자열타입으로 변한다.

    ```java
    System.out.println(true+"Hello"); // "trueHello"

    System.out.println(7+"Hello"); // "7Hello"

    System.out.println(null+"Hello"); // "nullHello"

    System.out.println(7 + "" + 8); // "78"
    ```

## 형식화된 출력 : printf()

```java
System.out.printf("age:%d year:%d", 14, 2017); // age:14 year:2017
```

## 기본형 (primitive type)

### 논리형 - boolean

true, false (소문자) 중 하나이고 default 값은 false

```java
boolean checked = false;
```

### 문자형 - char

c언어에서는 char 이 1byte 였지만 자바에서는 2byte 이다.

- 문자 인코딩 : 문자 → 유니코드 변환 ( ex. ‘A’ → 65 )
- 문자 디코딩 : 유니코드 → 문자 변환 ( ex. 65 → ‘A’ )

문자를 저장할 때는 문자를 인코딩해서 숫자(유니코드)로 변환해서 저장해야하고, 저장된 문자를 불러올 때는 디코딩을 해서 문자로 되돌려야 한다.

### 정수형 - byte, short, int, long

byte(1byte) < short(2byte) < int(4byte) < long(8byte)

자바에서의 모든 정수형은 부호 있는 정수이다.

byte 나 short 는 거의 사용되지 않는다.

JVM 의 피연산자 스택(operand stack) 에서 피연산자를 4byte 단위로 저장하기 때문에 byte 나 short 를 써도 어차피 4byte 로 변환하는 동작이 수행된다.

따라서 int 나 long 만 쓴다고 생각해도 무방하다.

<aside>
☝🏻 short 와 char 의 차이

공통점 : 둘 다 2byte (65536)
차이점 :

- short : 부호 있음 ( -32768 ~ 32767 )
- char : 문자형 타입이므로 부호가 없음 ( 0 ~ 65535 )

</aside>

### 실수형 - float, double

float : 4byte (정밀도 7자리)

double : 8byte (정밀도 15자리)

double 이 float 보다 정밀도가 2배 가량 높으므로 double 을 사용할 것

## 형 변환(casting)

```java
// (타입)피연산자

double d = 85.4;
int score = (int) d;
```

기본형 타입에서 boolean 을 제외한 나머지 타입들끼리는 형 변환이 가능하다.

boolean 은 형 변환이 안 된다.

![Untitled](imgs/Untitled%205.png)

### 암묵적 형 변환 (Implicit conversion)

서로 다른 타입 변수들끼리 연산을 할 때, 명시적으로 형 변환을 안 해줘도 작은 타입에서 큰 타입으로 암묵적으로 형 변환을 해준다.

```java
System.out.println('A'+10);
// 75
// char 'A' 가 int 65 로 형 변환

System.out.println("A"+10); // A10 (문자열과 다른 타입 연산은 항상 문자열로 형 변환 됨)
```

# Ch 3.

## 연산자 (operator)

- 연산자 : 연산을 수행하는 기호 (ex. +, -, \*, / ..)
- 피연산자 : 연산자의 작업 대상 (변수, 상수, 리터럴, 수식)

![Untitled](imgs/Untitled%206.png)

### 문자열 비교

`==` 대신 `equals()` 를 사용해야 한다.

- `==` : 실제 문자열 객체가 같은 객체(주소값 동일)인 비교
- `equals()` : 문자열의 내용만 같은 지 비교 ( 같으면 true, 다르면 false 를 리턴 )
  대소문자를 구별하지 않고 비교하려면 `equalsIgnoreCase()` 사용

```java
String str = "abc";
String newstr = new String("abc");

boolean result = str.equals("abc"); // true
boolean result2 = str == newstr; // false
```

### 삼항연산자

```java
// 조건식 ? 식1(참일 때) : 식2(거짓일 때)
```

# Ch 4.

## 조건문

### if문

- 조건식에서 C언어와 달리 boolean 타입만으로 규정돼있다. java 에서는 int 타입을 boolean 으로 형 변환 못하므로 boolean 변수나 논리연산자 결과만 if 조건식 안에 들어와야 한다.

  ```java
  // 에러임. java 에서는 1 은 true 가 아니다

  if(1){
  			System.out.println("hi");
  }
  ```

### switch문

```java
switch (조건식) {
	case 값1:
				...
				break;
	case 값2:
				...
				break;
	default:
				...
}
```

**switch문 제약조건**

1. switch문 조건식 결과는 정수 또는 문자열이 들어와야 한다.
2. case문 값은 정수 상수만 들어와야 하고 중복되지 않아야 한다.

## 반복문

### 일반적인 for문

```java
for (int i=0; i<5; i++){
			System.out.println(i);
}
```

### 향상된 for문

배열이나 컬렉션의 요소를 하나씩 받아오는 for문이 java 에도 존재한다.

```java
for (타입 변수명 : 배열 또는 컬렉션) {
	// 반복할 문장
}
```

```java
int[] arr = {1,2,3,4,5};

for (int temp : arr) {
	System.out.println(temp);
}
```

### while문

```java
while (조건식) {
	// 반복할 문장
}
```

## 이름 붙은 반복문

java 에서는 반복문에 이름(라벨)을 붙혀서 break 문과 continue 문에 특정 반복문을 지정해줌으로써 하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.

```java
Loop1 : for(int i=2; i<=9; i++){
   for (int j=1; j<=9; j++){
      if (j==5)
         break Loop1;
   }
}
```

# Ch 5.

## 배열

### 배열 선언과 생성

java 스타일의 배열은 `타입[] 변수이름;` 으로 선언한다.

타입 자체를 배열이라고 생각하는 것도 괜찮다.

( c 스타일 배열 선언도 가능하긴 하지만 java 스타일로 선언하는 것을 추천 )

```java
// 타입[] 변수이름 : 배열 선언
// new 타입[길이] : 배열 생성
// 타입[] 변수이름 = new 타입[길이] : 배열 선언과 생성 동시에

int[] score = new int[5];
String[] name = new String[2];
```

### 배열 길이

```java
// 배열이름.length

int[] score = new int[] {50,60,70,80,90}; // 5
```

배열의 길이는 한 번 생성하면 변경할 수 없다.

즉, `.length` 값은 읽을 수만 있고 쓸 수는 없는 상수이다.

### 배열 초기화

생성할 때 초기화를 하는 문법을 지원한다.

```java
int[] score = new int[] {50,60,70,80,90};
```

더 간단하게 아래와 같이 쓸 수도 있다.

```java
int[] score = {50,60,70,80,90};
```

다만 선언과 생성을 따로할 때는 생성자를 생략할 수 없다.

```java
int[] score;

score = new int[] {50,60,70,80,90}; // OK
score = {50,60,70,80,90}; // ERROR
```

### 배열 출력

일반적으로는 for문을 사용해서 인덱스를 지정해주면 되고,

예외적으로 char 배열은 println 으로 출력 시 문자열로 그대로 출력된다.

```java
char[] chArr = {'a','b','c'};

System.out.println(chArr); // abc
```

### 배열 복사

배열은 한 번 생성하면 길이를 변경할 수 없기 때문에 배열의 크기를 늘릴려면 큰 배열을 새로 만들어서 기존 배열을 복사해야 한다.

배열의 복사 방법은 **for문으로 직접 복사하는 방법**과 **System.arraycopy() 를 이용하는 방법**이 있다.

1. **for문으로 직접 복사하는 방법**

   ```java
   int[] arr = new int[5];
   ...
   int[] tmp = new int[arr.length * 2]; // 2배 큰 배열 생성

   for (int i=0; i<arr.length; i++)
   	tmp[i] = arr[i]

   arr = tmp // 참조변수 arr 이 새로운 배열 tmp 를 가리키게 함

   // GC 가 tmp 배열 메모리는 수거해감.
   ```

2. **System.arraycopy() 를 이용하는 방법**

   ```java
   System.arraycopy(num, 0, newNum, 0, num.length);

   // num[0] 에서 newNum[0] 으로 num.length 개의 데이터를 복사
   ```

for문은 원소 하나하나에 접근하지만 `System.arraycopy()` 는 배열의 연속적인 성질을 이용해서 한꺼번에 처리를 하기 때문에 더 효율적이다.

## char 배열 vs String 클래스

c언어의 char 배열과 문자열 간의 관계랑 유사하다.

char배열 : 변경가능

String 클래스 : 변경불가하지만 문자열을 다루기 쉽게 하기 위한 메서드를 제공함

![대표적인 메서드](imgs/Untitled%207.png)

대표적인 메서드

[Java String Reference](https://www.w3schools.com/java/java_ref_string.asp)

## 다차원 배열

1차원 배열의 배열이라고 생각하면 된다.

### 2차원 배열 생성

```java
int[][] score = new int[2][3]; // 2행 3열의 int 형 2차원배열을 생성
```

### 2차원 배열 초기화

```java
int[][] arr = {
				{1,2,3},
				{4,5,6}
};
```

### 2차원 배열 요소 읽기

1. 일반적인 for문 사용

   ```java
   int[][] arr = {
   				{1,2,3},
   				{4,5,6}
   		};

   for(int i=0; i<arr.length; i++){
   	for(int j=0; j<arr[0].length; j++){
   		System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
   	}
   }
   ```

2. 향상된 for문 사용

   ```java
   int[][] arr = {
   				{1,2,3},
   				{4,5,6}
   		};

   for(int[] tmp: arr){  // arr 의 행을 tmp 에 저장
   			for(int a: tmp){ // tmp 에서 arr 의 열에 접근
   				System.out.println(a);
   			}
   }
   ```

### 가변 배열

2차원 이상의 배열에서는 마지막 차수의 길이를 지정하지 않을 수 있다.

이를 이용해서 추후에 각기 다른 길이의 배열을 생성할 수 있다.

```java
int[][] arr = new int[5][]; // 마지막 치수 지정 안 함

// 각기 다르게 생성 가능
arr[0] = new int[3];
arr[1] = new int[4];
arr[2] = new int[2];
arr[3] = new int[3];
arr[4] = new int[1];
```
