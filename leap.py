no = int(input("Enter a number: "))

if (no % 400 == 0) and (no % 100 == 0):
    print("Its is leap year")
elif (no % 4 == 0) and (no % 100 != 0):
    print("Its is leap year")
else:
    print("Its is not leap year")