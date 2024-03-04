"""
1. Read the number of children `n` and the number of candies given in each round `m`.

2. Create a list of tuples containing the index of each child (from 1 to n) and the number of candies each child wants.

3. Repeat the following steps until there are no children left in line:

4. For each child in line:
     - Check if the child has received less than the required candies (`wants > m`).
     - If so, subtract `m` from the required candies and keep the child in line for the next round.
     - If the child has received enough or more than enough candies, they leave the line and go home.

5. Replace the original list of children with the new list of children who still need candies.

6. Print the index of the last child who goes home.
"""


n, m = map(int, input().split())
children = list(
    zip(range(1, n + 1), map(int, input().split()))
)

last = None
while len(children) > 0:
  new_children = []
  for child in children:
    i, wants = child
    last = i
    if wants > m:
      new_children.append((i, wants - m))

  children = new_children

print(last)
