import itertools

def solution(relation):
    answer = 0
    c_key_list = []

    col = len(relation[0])
    row = len(relation)
    col_name = []
    for i in range(1, col+1):
        col_name += [i]

    for choice in range(1, col+1):
        choice_list = list(itertools.combinations(col_name,choice))
        for selected_col in choice_list:
            dub_check = False
            for c_key in c_key_list:
                if c_key.issubset(set(selected_col)):
                    dub_check = True
            if not dub_check:
                tmp_set = set()
                tmp_relation = []
                for selected_row in range(row):
                    tmp = ''
                    for idx in selected_col:
                        tmp += relation[selected_row][idx-1]
                    tmp_relation += [tmp]
                for b in tmp_relation:
                    tmp_set.add(b)
                if len(tmp_set) == row:
                    c_key_list += [set(selected_col)]
                    answer += 1
    return answer