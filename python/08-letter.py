while True:
    try:
        nums=int(input())
        result = 0
        while nums!=0 :
            a = nums % 10

            nums= nums//10

            if a%2==0:
                result+=a
        print(result)
        print()
    except:
        break
        