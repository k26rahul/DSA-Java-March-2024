T = int(input())


def solve(n, s1, s2):
  path = s1[0]
  nos_path = 1

  for i in range(1, n):
    cell_r = s1[i]
    cell_b = s2[i-1]

    if cell_b == cell_r:
      nos_path += 1
      path += cell_r
      if i == n-1:
        path += s2[-1]
      continue

    if cell_r == '0':
      nos_path = 1
      path += cell_r
      continue

    if cell_b == '0':
      path += s2[i-1:]
      break

  return path, nos_path


for _ in range(T):
  n = int(input())
  s1 = input()
  s2 = input()
  path, nos_path = solve(n, s1, s2)
  print(path)
  print(nos_path)
