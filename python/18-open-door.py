s = int(input())

for _ in range(s):
    umap = {}

    n = int(input())
    

    for _ in range(n):
    
        key, door = map(int,input().split())
        
        umap[key] = door
    
    x = int(input())
    flag = True

    for key,door in umap.items():
        if door == x:
            print(key)
            flag = False
            break
    
    if flag:
        print("Can't open the door.")