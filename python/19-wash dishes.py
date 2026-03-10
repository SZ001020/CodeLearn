n = int(input())
plates = list(map(int, input().split()))
m = int(input())
for _ in range(m):
    operation = input().split()
     
    opt = int(operation[0])
    
    if opt == 1:
        if plates:
            cleaned_plate = plates.pop()

    elif opt == 2:

        plates_number = int(operation[1])

        plates.append(plates_number)

    if not plates:
        print('All the dishes have been cleaned.')
    
    else:
         print(plates[-1])
