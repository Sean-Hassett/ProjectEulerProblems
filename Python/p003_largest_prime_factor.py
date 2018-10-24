from math import sqrt

x = 600851475143


def is_prime(a):
    if a % 2 == 0:
        return False
    else:
        for n in range(3, ((int(sqrt(a))) + 1), 2):
            if a % n == 0:
                return False
        return True


for y in range(int(sqrt(x) + 1), 1, -1):
    if x % y == 0:
        if is_prime(y):
            print(y)
            break
