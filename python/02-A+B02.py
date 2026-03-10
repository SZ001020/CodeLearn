#解法1
while True:
    try:
        N= int(input())
        for _ in range(N):
            data=input().split()
            res=int(data[0])+int(data[1])
            print(res)    
    except:
        break
#解法2 多重赋值
while True:
    try:
        N= int(input())
        for _ in range(N):
            
            a,b=input().split()

            print(int(a)+int(b))    
    except:
        break
#解法3 while语句
while True:
    try:
        N= int(input())
        i=0
        while i < N:
            
            a,b=input().split()
            print(int(a)+int(b))
            i=i+1 
    except:
        break