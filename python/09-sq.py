while True:
    try:
        n=int(input())
        i=0
        j=0
        for i in range(n):
            if i == 0 or i == n-1:
                for _ in range(n):
                    print("*",end=" ")
                print()
            else:
                for j in range(n):
                    if j==0 :
                        print("*",end=" ")
                    if j==1 :
                        continue
                    if j==n-1 :
                        print("*")
                        
                    else:
                        print(" ",end=" ")
    except:
        break
#解法2 字符串写法
    while True:
        try:
            n=int(input())
            
            for i in range(n):
                line = ""
                if i == 0 or i == n-1:
                    for j in range(n):
                        line += "*"
                    print(line)
                else:
                    for j in range(n):
                        if j==0 or j==n-1:
                            line+="*"   
                        else:
                            line+=" "
                    print(line)

        except:
            break