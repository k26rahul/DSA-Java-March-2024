import math

T = int(input())

for _ in range(T):
  x = int(input())
  print(2 ** int(math.log2(x)))
