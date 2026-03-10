#first demo
while True:
    try:

        data = input().split()

        res= int(data[0])+int(data[1])

        print(res)

    except  EOFError:
        break
