#A+B 3
while True:
    try:
        s=input().split()
        a,b=int(s[0]),int(s[1])
        if a==0 and b==0:
            continue
        print(a+b)
    except:
        break