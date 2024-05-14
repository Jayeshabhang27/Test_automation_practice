no = int(input("Enter a number: "))
fact = 1
while(no > 0):
    fact = fact * no
    no = no - 1
print(f"The factorial is: {fact}" )

# WAP to find the factorial using define function

# no = int(input("Enter a number: "))
# def fact(no):
#     if no == 1:
#         return no
#     elif no == 0 or no < 0:
#         return "Please Enter a greather number than 0."
#     else:
#         return no * fact(no - 1)
# print(fact(no))