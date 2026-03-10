while True :
    try:
        s = input()
        sum_grade = 0
        count = 0
        flag=1
        
        for char in s:
            if char == "A":
                sum_grade+=4
                count+=1
            elif char == "B":
                sum_grade+=3
                count+=1
            elif char == "C":
                sum_grade+=2
                count+=1
            elif char == "D":
                sum_grade+=1
                count+=1
            elif char == "F":
                sum_grade+=0
                count+=1
            elif char ==" ":
                continue
            else:
                flag = 0
                print("Unknown")
                break
        if flag :
            print("{:.2f}".format(sum_grade/count))
    except :
        break
    #解法2
    while True:
        try:
            s = input()
            # 使用字典存储成绩对应的分数
            grade_points = {
                'A': 4,
                'B': 3,
                'C': 2,
                'D': 1,
                'F': 0
            }
            
            sum_grade = 0
            count = 0
            
            for char in s.upper().replace(' ', ''):  # 转大写并移除空格
                if char in grade_points:
                    sum_grade += grade_points[char]
                    count += 1
                else:
                    print("Unknown")
                    break
            else:  # for循环正常结束才会执行
                if count > 0:
                    print("{:.2f}".format(sum_grade/count))
                
        except:
            break