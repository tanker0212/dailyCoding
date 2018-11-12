# 쇠막대기
* 출처 : https://programmers.co.kr/learn/courses/30/lessons/42585

## 문제 설명
여러 개의 쇠막대기를 레이저로 절단하려고 합니다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고, 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자릅니다. 쇠막대기와 레이저의 배치는 다음 조건을 만족합니다.
```
- 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있습니다.
- 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓습니다.
- 각 쇠막대기를 자르는 레이저는 적어도 하나 존재합니다.
- 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않습니다.
```
아래 그림은 위 조건을 만족하는 예를 보여줍니다. 수평으로 그려진 굵은 실선은 쇠막대기이고, 점은 레이저의 위치, 수직으로 그려진 점선 화살표는 레이저의 발사 방향입니다.

![](https://grepp-programmers.s3.amazonaws.com/files/ybm/dbd166625b/d3ae656b-bb7b-421c-9f74-fa9ea800b860.png)

이러한 레이저와 쇠막대기의 배치는 다음과 같이 괄호를 이용하여 왼쪽부터 순서대로 표현할 수 있습니다.
```
(a) 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 '()'으로 표현합니다. 또한 모든 '()'는 반드시 레이저를 표현합니다.
(b) 쇠막대기의 왼쪽 끝은 여는 괄호 '('로, 오른쪽 끝은 닫힌 괄호 ')'로 표현됩니다.
```
위 예의 괄호 표현은 그림 위에 주어져 있습니다.
쇠막대기는 레이저에 의해 몇 개의 조각으로 잘리는데, 위 예에서 가장 위에 있는 두 개의 쇠막대기는 각각 3개와 2개의 조각으로 잘리고, 이와 같은 방식으로 주어진 쇠막대기들은 총 17개의 조각으로 잘립니다.

쇠막대기와 레이저의 배치를 표현한 문자열 arrangement가 매개변수로 주어질 때, 잘린 쇠막대기 조각의 총 개수를 return 하도록 solution 함수를 작성해주세요.

## 제한사항
* arrangement의 길이는 최대 100,000입니다.
* arrangement의 여는 괄호와 닫는 괄호는 항상 쌍을 이룹니다.

## 입출력 예
| arrangement | return |
| --- | --- |
| ()(((()())(())()))(()) | 17 |

## 입출력 예 설명
문제에 나온 예와 같습니다.

[출처](https://www.digitalculture.or.kr/koi/selectOlymPiadDissentList.do)


## 실행 결과
### 채점을 시작합니다.
#### 정확성  테스트
```
테스트 1 〉	통과 (7.83ms, 10.8MB)
테스트 2 〉	통과 (0.05ms, 10.7MB)
테스트 3 〉	통과 (7.24ms, 10.8MB)
테스트 4 〉	통과 (0.39ms, 10.7MB)
테스트 5 〉	통과 (0.49ms, 10.7MB)
테스트 6 〉	통과 (0.49ms, 10.7MB)
테스트 7 〉	통과 (4.54ms, 10.7MB)
테스트 8 〉	통과 (4.54ms, 10.8MB)
테스트 9 〉	통과 (5.24ms, 10.7MB)
테스트 10 〉	통과 (4.97ms, 10.8MB)
테스트 11 〉	통과 (3.84ms, 10.9MB)
테스트 12 〉	통과 (3.91ms, 10.8MB)
테스트 13 〉	통과 (4.20ms, 10.8MB)
테스트 14 〉	통과 (6.02ms, 10.7MB)
테스트 15 〉	통과 (6.49ms, 10.8MB)
테스트 16 〉	통과 (6.70ms, 10.7MB)
테스트 17 〉	통과 (7.28ms, 10.9MB)
테스트 18 〉	통과 (7.48ms, 10.8MB)
테스트 19 〉	통과 (7.30ms, 10.8MB)
테스트 20 〉	통과 (7.47ms, 10.8MB)
```
### 채점 결과
* 정확성: 100.0
* 합계: 100.0 / 100.0