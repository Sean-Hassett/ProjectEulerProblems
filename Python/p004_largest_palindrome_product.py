max_palindrome = 0

for x in range(999, 100, -1):
    for y in range(x, 100, -1):
        if str(x * y) == str(x * y)[::-1]:
            if x*y > max_palindrome:
                max_palindrome = x*y
            break

print(max_palindrome)
