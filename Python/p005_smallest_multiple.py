def is_valid(num):
    for x in range(20, 1, -1):
        if num % x != 0:
            return False
    return True


y = 20*19
finished = False
while not finished:
    if is_valid(y):
        print(y)
        finished = True
    else:
        y += 20
