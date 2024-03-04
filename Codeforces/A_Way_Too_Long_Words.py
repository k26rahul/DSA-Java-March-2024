"""
Input n as an integer
For each word from 1 to n:
    Input the word
    If the length of the word is greater than 10:
        Print the abbreviation of the word (first character + count of characters between first and last + last character)
    Else:
        Print the word
"""

n = int(input())
words = []

for i in range(n):
  words.append(input())

for word in words:
  if len(word) > 10:
    print(word[0] + str(len(word[1:-1])) + word[-1])
  else:
    print(word)
