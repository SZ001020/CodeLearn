while True:
    try:
        N=int(input())
        i=0
        for i in range(N):
            intput_line=input().split()
            numbers=list(map(int,intput_line[1:]))
            total = sum(numbers)
            print(total)
            if i < N-1:
                print()
    except:
        break
#解法2
while True:
    try:
        N=int(input())
        
        
        for i in range(N):
            data=input().split()
            M=int(data[0])
            total=0
            for j in range(M):
                total+=int(data[j+1])
            print(total)
            if i < N-1:
                print()
    except:
        break