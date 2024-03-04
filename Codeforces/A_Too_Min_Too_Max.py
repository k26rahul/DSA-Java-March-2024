T = int(input())

for _ in range(T):
  n = int(input())
  a = map(int, input().split())
  min_1, min_2 = 10**7, 10**7
  max_1, max_2 = -10**7, -10**7

  for x in a:
    if x < min_1:
      min_2 = min_1
      min_1 = x
    elif x < min_2:
      min_2 = x

    if x > max_1:
      max_2 = max_1
      max_1 = x
    elif x > max_2:
      max_2 = x

  i, j, k, l = min_1, max_2, min_2, max_1
  print(abs(i-j) + abs(j-k) + abs(k-l) + abs(l-i))
