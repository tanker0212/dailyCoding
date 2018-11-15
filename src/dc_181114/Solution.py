def solution(n, lost, reserve):
    answer = 0
    s_list = [0] * (n + 1)
    for i in range(1, n + 1):
        s_list[i] = 1
    for lo in lost:
        s_list[lo] = 0;
    for i in range(len(reserve)):
        if s_list[reserve[i]] == 0:
            s_list[reserve[i]] = 1
            reserve[i] = -1
    for res in reserve:
        if res == -1:
            continue
        if res == 1:
            s_list[res+1] = 1
        elif res == n:
            s_list[res-1] = 1
        else:
            if s_list[res-1] == 0:
                s_list[res-1] = 1
            else:
                s_list[res+1] = 1
    for do in s_list:
        answer += do
    return answer