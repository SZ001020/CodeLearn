n = int(input())
for _ in range(n):
    s = input()
    temp = [0] * 26  # 初始化一个长度为26的列表，用于存储每个字母的频率
    for char in s:
        a = ord(char)-ord('a')
        temp[a] += 1
    maxFreq = 0
    for i in range(26):
        if temp[i] > maxFreq:
            maxFreq = temp[i]
            maxFreqChar = i
    res = chr(maxFreqChar+ord('a'))
    print(res)