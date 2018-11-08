def compare(a, b):
    a, b = str(a), str(b)
    return True if a + b > b + a else False

# mergeSort() 코드 출처 : http://ejklike.github.io/2017/03/04/sorting-algorithms-with-python.html
def mergeSort(x):
    if len(x) > 1:
        mid = len(x)//2
        lx, rx = x[:mid], x[mid:]
        mergeSort(lx)
        mergeSort(rx)
        li, ri, i = 0, 0, 0
        while li < len(lx) and ri < len(rx):
            if compare(lx[li], rx[ri]):
                x[i] = lx[li]
                li += 1
            else:
                x[i] = rx[ri]
                ri += 1
            i += 1
        x[i:] = lx[li:] if li != len(lx) else rx[ri:]

def solution(numbers):
    answer = ''
    mergeSort(numbers)
    for num in numbers:
        answer += str(num)
    return answer if answer[0] != '0' else '0'