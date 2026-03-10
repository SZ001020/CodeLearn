n = int(input())

queue = input().split()

m = int(input())

for _ in range(m):
    operation = input().split()

    opt = int(operation[0])

    if opt == 1:
        if queue:
            removed_person = queue.pop(0)
    
    elif opt == 2:
        new_person = operation[1]
        queue.append(new_person)

if not queue:
    print("There are no more people in the queue.")
else:
    print(queue[0])