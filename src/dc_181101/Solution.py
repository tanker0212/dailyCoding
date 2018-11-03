import operator

def solution(genres, plays):
    answer = []
    total = {}
    for i in range(len(plays)):
        if genres[i] in total:
            total[genres[i]] += plays[i]
        else:
            total[genres[i]] = plays[i]
    total = sorted(total.items(), key=operator.itemgetter(1), reverse=True)
    for genre in total:
        tmp_dic = {}
        for i in range(genres.count(genre[0])):
            idx = genres.index(genre[0])
            tmp_dic[idx] = plays[idx]
            genres[idx] = ""
        tmp_dic = sorted(tmp_dic.items(), key=operator.itemgetter(1), reverse=True)
        for i in range(2 if len(tmp_dic) > 1 else 1):
            answer.append(tmp_dic[i][0])

    return answer