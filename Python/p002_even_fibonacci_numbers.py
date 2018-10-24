total = 0
n1 = 1
n2 = 1

while n2 + n1 < 4000000:
    n2 = n2 + n1
    if n2 % 2 == 0:
        total += n2
    # switcheroo
    n1 = n1 + n2
    n2 = n1 - n2
    n1 = n1 - n2

print(total)
