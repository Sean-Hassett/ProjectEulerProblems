for a in range(1, 333):
    for b in range(a + 1, 500):
        c = 1000 - a - b
        if (c*c) == (a*a) + (b*b):
            print(a*b*c)
