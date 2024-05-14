# WAP to accept user from list of sum, max, min, avg

no = int(input("Enter a number: "))
l1 = list()
for i in range(no):
    ele = int(input("Enter a number: "))
    l1.append(ele)

s = sum(l1)
min = min(l1)
max = max(l1)
avg = s / len(l1)

print(s)
print(min)
print(max)
print(avg)