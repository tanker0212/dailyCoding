def solution(phone_book):
    answer = True
    phone_list = []
    for phone_num in phone_book:
        phone_list.append((len(phone_num), phone_num))
    phone_book.sort(key = len)

    for i in range(len(phone_book)):
        for j in range(i+1, len(phone_book)):
            if(phone_book[j].find(phone_book[i]) == 0):
                return False

    return answer