while True:
    try:
        n = int(input())
        if n == 0 :
            break
        
        nums = list(map(int,input().split()))
        total=sum(nums)

        per=total//n
        result=0
        for num in nums:
            if num > per :
                result += num -per
        print(result)
        print()
    except:
        break