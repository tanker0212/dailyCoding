def solution(arrangement):
    answer = 0
    pipe_count = 0
    pre_cha = arrangement[0]
    for cha in arrangement:
        if cha == '(':
            pipe_count += 1
        elif cha == ')':
            pipe_count -= 1
            if pre_cha == '(':
                answer += pipe_count
            else:
                answer += 1
        pre_cha = cha
    return answer