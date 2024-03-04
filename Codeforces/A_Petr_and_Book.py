"""
Input n
Input pages_a_day as a list of integers

Set day to 0
Set done to 0

While done is less than n:
    If day equals 7:
        Set day to 0
    Increment done by pages_a_day[day]
    Increment day by 1

Output day
"""

"""
n = read_integer()
pages_a_day = read_list_of_integers()

day = 0
done = 0

loop while done < n:
    if day == 7:
        day = 0
    done += pages_a_day[day]
    day += 1

print(day)
"""

n = int(input())
pages_a_day = list(map(int, input().split()))

day = 0
done = 0

while done < n:
  if day == 7:
    day = 0

  done += pages_a_day[day]
  day += 1

  print(f'{day=}, {done=}')

print(day)
