# # WAP to check armstrong number
# no = int(input("Enter a number: "))
# orig = no
# sum = 0
# while(no > 0):
#     sum = sum + (no % 10) * (no % 10) * (no % 10)
#     no = no // 10
# if orig == sum:
#     print("Its is armstrong number") 
# else:
#     print("Its is not a armstrong number")

no = int(input("Enter a number: "))
fact = 1
while(no > 0):
    fact = fact * no
    no = no - 1
print(fact)