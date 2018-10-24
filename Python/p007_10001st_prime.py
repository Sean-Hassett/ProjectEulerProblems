from math import sqrt


def is_prime(a):
    if a % 2 == 0:
        return False
    else:
        for i in range(3, ((int(sqrt(a))) + 1), 2):
            if a % i == 0:
                return False
        return True


y = 3
n = 2
while n < 10001:
    y += 2
    if is_prime(y):
        n += 1


print(y)
