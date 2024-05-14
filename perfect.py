no = int(input("Enter a number: "))
count = 0
for i in range(1, no):
    if i * i == no:
        count = 1
        break
if count == 1:
    print("Its is perfect number:")
else:
    print("Its is not a perfect number")
