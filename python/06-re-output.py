while True:
    try:
        N=int(input())
        numbers=list(map(int,input().split()))
        numbers.reverse()        
        for j in range(N):
            print(numbers[j],end=" ")
        print()
        numbers.reverse()
        for i in range(0,N,2):
            print(numbers[i],end=" ")
    except:

        break
#解法2
while True:
    try:
        N = int(input())
        numbers = list(map(int, input().split()))
        # 创建一个反转的列表副本
        renumbers = numbers[::-1]
        
        # 打印原始序列
        for j in range(N):
            print(numbers[j], end=" ")  # 使用方括号
        print()
        
        # 打印反转序列的偶数位置元素
        for i in range(0, N, 2):
            print(renumbers[i], end=" ")  # 使用方括号
        print()  # 添加换行
    except:
        break
#解法3