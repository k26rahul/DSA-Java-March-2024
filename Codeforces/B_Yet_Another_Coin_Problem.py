T = int(input())

for _ in range(T):
  n = int(input())
  total = 0
  for coin in reversed([1, 3, 6, 10, 15]):
    total += n//coin
    n = n % coin

  print(total)
