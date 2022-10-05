# 알고리즘 과제 풀이 기록

## IO
### No1019IO
* 2018.8.13과 같이 "."을 구분자로 갖는 값이 입력되었을 때 split()을 활용하려고 하였다.
* 그러나 split(".")은 `suspicious regex expression "." in call to split()` 의 경고메시지를 보였다.
* split()은 문자열을 구분하기 위해 정규표현식(regex) 형태의 구분자를 입력받는다.
* 정규표현식에서 "."은 임의의 문자열을 의미한다. 본래의 의도대로 "."을 구분자로 사용하기 위해서는 `"\\."`, `"[.]"`를 사용해야했다.
* 정규표현식에서 특수문자를 사용할 때는 문자를 대괄호로 감싸거나, 문자 앞에 역슬래시 두 개를 붙인다.
```java
//String[] strDate = br.readLine().split("."); -> suspicious regex expression "." in call to split()
String[] strDate = br.readLine().split("\\.");
```

# 공부

## IO
### Scanner 사용
* 입력 시 Scanner를 사용하면 편하다.

```java
import java.util.Scanner;

public class No1011IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word);
        sc.close();
    }
}
```

### BuffereadReader 사용
* Scanner가 아닌 다른 방법의 입력을 찾았다.
* 그중 Scanner보다 빠른 입력 방법을 찾았다.
* Scanner를 사용하면서 시간이 초과되는 경우 활용할 수 있을 것 같다.
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1014IO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = reader.readLine().split(" ");
        System.out.printf("%s %s", strArray[1], strArray[0]);
        reader.close();
    }
}
```
* BufferedReader 의 생성자는 InputStreamReader를 매개변수로 받는다.
* BufferedReader.readLine() 은 한 줄을 String으로 입력받는다.
* String.split(), Integer.parseInt(String s) 등을 활용하면 입력 값을 활용하기 편하다.

### BufferedWriter 발견
* 빠른 입력이 있다면, 빠른 출력도 있을 것이라 생각했다.
* BufferedWriter 는 일반적인 출력문 System.out.print 등에 비해 빠르다.
```java
import java.io.*;

public class No1017IO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(reader.readLine());
        writer.write(number + " " + number + " " + number);
        writer.flush();
        reader.close();
        writer.close();
    }
}
```
* BufferedReader, BufferedWriter 프로그램이 종료될 때 닫아두는 것이 좋다고 한다. 이유는 나중에 찾아봐야겠다.

### StringBuilder 혹은 StringBuffer
* String은 불변성을 갖는다. 즉, immutable 하다.
  * concat(), 연산자 `+` 등으로 문자열을 결합하면, 새로운 문자열이 만들어진다. 주소값이 변경된다.
* StringBuilder 혹은 StringBuffer은 가변성을 갖는다. 즉, mutable 하다.
  * append() 메소드로 문자열을 결합해도 주소값이 변경되지 않는다.
  * mutable 할 수 있는 이유는 `byte형 배열`을 활용하기 때문이다. 만약 문자열을 추가하게 되면 추가할 문자열의 길이만큼 배열의 공간을 늘려주고, 늘려준 공간에 문자열을 넣어주는 방식이다.
  * 따라서 값이 변경되더라도 같은 주소공간을 참조한다.
* StringBuilder 와 StringBuffer는 동기화(Synchronization)에서 차이가 난다.
  * 단일 스레드의 경우 StringBuilder의 성능이 더 좋다.

