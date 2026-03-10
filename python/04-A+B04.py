#解法1
while True:
    try:
        input_line= input().split()
        n=int(input_line[0])
        if n==0:
            break
        total = 0
        for i in range(n):
            total=total+int(input_line[i+1])
        print(total)
    except:
        break
    #解法2
while True:
    try:
        input_line= input().split()
        n=int(input_line[0])
        if n==0:
            break
        numbers=list(map(int,input_line[1:]))
# input_line[1:]是一个切片操作，表示从列表中获取从指定索引（包括该索引）到序列末尾的所有元素
# [1:]表示的为获取从索引1到末尾的所有元素，即列表的第二个元素开始，直到最后
        total=sum(numbers)
        print(total)
    except:
        break