from math import sqrt


def is_prime(a):
    if a % 2 == 0:
        return False
    else:
        for i in range(3, ((int(sqrt(a))) + 1), 2):
            if a % i == 0:
                return False
        return True


def space_efficient(n):
    total = 2
    x = 1
    while x + 2 < n:
        x += 2
        if is_prime(x):
            total += x
    return total


def time_efficient(n):
    total = 0
    n_list = [True] * n
    for x in range(2, n):
        if n_list[x]:
            total += x
            for y in range(x*2, n, x):
                n_list[y] = False
    return total


print(time_efficient(2000000))
