"""
Input T
Repeat T times:
    Input n
    Input n integers as a list a
    Create an empty list new_a
    For each element x in a:
        Add the absolute value of x to new_a
    Print the sum of elements in new_a
"""

T = int(input())

for _ in range(T):
  n = int(input())
  a = map(int, input().split())
  new_a = []
  for x in a:
    new_a.append(abs(x))

  print(sum(new_a))
