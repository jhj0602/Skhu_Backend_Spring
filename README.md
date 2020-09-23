# Skhu_Backend_Spring
## 2주차 Spring 실습 자료 실행 절차 이해하기 hello2 프로젝트
1
웹브라우저가
웹서버에 요청 HTTP R equest) 을 전달한다
이
요청에는 , 요청 대상을 가르키는 URL 이 담겨 있다
2
웹브라우저로부터
웹서버에 전달된 요청을 Spring Web MVC 엔진이 받는다
스프링
엔진은 요청된 URL 과 일치하는 컨트롤러 액션 메소드 를 찾아서 호출한다
3
컨트롤러의
액션 메소드는 데이터를 Model 객체에 넣는다
4
컨트롤러의
액션 메소드는 뷰의 이름을 리턴한다
5
그
이름의 뷰가 실행된다
6
뷰는
Model 객체에서 데이터를 꺼내서 출력하고 , HTML 태그들도 출력한다
7
뷰가
출력한 HTML 태그들이 웹브라우저에 전송된다
이
전송은 최초 웹브라우저의 요청 http request) 에 대한 응답 (http 이다
8
웹
서버로부터 전송된 HTML 태그들이 웹브라우저에 표시된다
## 구현과제 
ThirdController 클래스 생성
test1
액션 메소드 구현
Student
객체 를 생성 한다
Student
객체에 id, studentNumber, studentName, email 값을 대입
id 변수에는 아무 값이나 채우고 , 나머지 멤버 변수에는 자신의 학번 이름 , 이메일 주소를 채운다 test1 액션 메소드를 호출하기 위한 URL 은 다음과 같아야 한다
h
ttp://localhost:8088/ third/test1
