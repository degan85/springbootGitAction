# Spring Boot Git Action Test

## 1. git clone

```shell
git clone https://github.com/degan85/springbootGitAction.git
```

## 2. vscode로 연다

## 3. `AccountRepositoryTest.java` 파일을 연다.

## 4. 코드르 변경한다

```java

// 성공 테스트 시
assertThat(true).isTrue();

// 실패 테스트 시
assertThat(true).isFalse();
```

## 5. push

```shell
git status

git pull origin main

git add .

git commit -m "message"

git push origin main
```

## 6. git repository에서 상단에 Action 탭을 확인한다.
- 실패 시 slack message 확인
