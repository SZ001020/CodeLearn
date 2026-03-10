while True:
    try:
        n = int(input())
        def change_char(a):
                if a.islower():
                    return a.upper()
                return a
        for _ in range(n):
            s = input()
            result = ''
            result += change_char(s[0])
            for i in range(1,len(s)-1):

                if s[i] == ' ' and s[i+1] != ' ' :

                   result +=change_char(s[i+1])
            
            print(result)
    except:
        break


#解法02
while True:
    try:
        n =int(input())
        for _ in range(n):
            words = input().split()
            result = ''
            for word in words:
                result += word[0].upper()
            print(result)
    except:
        break