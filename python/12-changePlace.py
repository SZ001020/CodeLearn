while True:
    try:
        def swap(a,b):
            return b,a
        
        n=int(input())
        for _ in range(n):
            s = input()
            chs = list(s)
            for i in range(0,len(chs)-1,2):
                chs[i],chs[i+1] = swap(chs[i],chs[i+1])
            print("".join(chs))
    except:
        break
#解法02
while True:
    try:
        n = int(input())
        for i in range(n):
            s = input()
            chars = list(s)
            for j in range(0,len(chars)):
                if j%2 == 1:
                    chars[j-1],chars[j] = chars[j],chars[j-1]
            print("".join(chars))
    except:
        break
