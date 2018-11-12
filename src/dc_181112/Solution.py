NUM_LEN = 3;

def solution(baseball):
    answer = 0
    for i in range(123, 988):
        if dup_check(i):
            point = 0
            for guess in baseball:
                if (guess[1], guess[2]) == point_check(i, guess[0]):
                    point += 1
            if point == len(baseball):
                answer += 1;
    return answer

def point_check(answer, guess):
    strike , ball= 0, 0;
    answer = str(answer)
    guess = str(guess)
    for i in range(NUM_LEN):
        for j in range(NUM_LEN):
            if answer[i] == guess[j]:
                if i == j:
                    strike += 1
                else:
                    ball += 1
    return strike, ball

def dup_check(num):
    a = int(num%10)
    b = int((num/10)%10)
    c = int(num/100)
    if a == b or a == c or b == c or a == 0 or b == 0 or c == 0:
        return 0
    else:
        return 1