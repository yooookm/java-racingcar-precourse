# 📜 기능 명세 목록

---

## 🌟 주요 기능

### 자동차 이름 & 시도 회수 입력 및 유효성 검사

- 입력 안내 메시지 출력
- 사용자로부터 입력 받음
- 입력값 유효성 검사

### Car 등록

- 이름 개수에 따라 Car 객체 생성 후 리스트에 저장

#### Car 객체
```angular2html
- 자동차 이름
- 자동차 전진값
- 자동차 전진
    - 랜덤값 생성
    - 생성된 값이 4 이상일 경우 자동차 전진 (전진값 +1 증가)
```

### 경주 실행

- 시도 휫수만큼 자동차 경주 실행
- 매 회차마다 자동차 전진값 출력

### 경주 종료
- 자동차 리스트의 전진값을 비교해서 승리자 체크
    - 승리자 문자열 리턴 (여러 명의 승리자일 때 `,`로 구별)

---

## ⚠️ 예외 처리

### 🚫 잘못된 입력 처리

- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException` 발생
- 잘못된 입력에 대한 `[ERROR]` 메시지 출력
- 잘못된 입력 시 재입력 안내


###  ✅ 입력값 유효성 검사
#### 자동차 이름 입력 유효성 검사
```
- 쉼표로 구분되어 있는지
    - 쉼표가 중복되거나 앞뒤에 있지 않은지
- 이름이 5자 이하로 구성되어 있는지
- 중복된 이름은 없는지
```

#### 횟수 입력 입력 유효성 검사
```
- 입력된 값이 숫자인지
- 입력 값이 0 이상인지
```

