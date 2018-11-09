def solution(m, n, puddles):
    answer = 0
    map_2_school = [[0 for i in range(m+1)] for j in range(n+1)]
    map_2_school[0][0] = 1;
    for i, j in puddles:
        map_2_school[j - 1][i - 1] = -1

    for i in range(n):
        for j in range(m):
            if i == j == 0:
                continue
            elif map_2_school[i][j] == -1:
                map_2_school[i][j] = 0
                continue
            else:
                map_2_school[i][j] = map_2_school[i-1][j] + map_2_school[i][j-1]

    answer = (map_2_school[n-1][m-1])%1000000007
    return answer