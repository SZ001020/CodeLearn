k = int(input())
for _ in range(k):
    m = int(input())
    elements = set(map(int,input().split()))
    n = int(input())
    if n in elements:
        print('YES')
    else:
        print('NO')
    