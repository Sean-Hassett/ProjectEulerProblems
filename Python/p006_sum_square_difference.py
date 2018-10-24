sum_squares = 0
sum_all = 0


for n in range(1, 101):
    sum_squares += (n * n)
    sum_all += n
squared_sum = sum_all * sum_all

print(squared_sum - sum_squares)
