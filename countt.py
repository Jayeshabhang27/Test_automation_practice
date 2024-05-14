# # Python program to count upper and lower case characters without using inbuilt functions
# my_string = input("Enter a number: ")

# lower_case = 0
# upper_case = 0
# for i in my_string:
#     if i.isupper():
#         upper_case += 1
#     elif i.islower():
#         lower_case += 1
# print("Upper case count", upper_case)
# print("Lower case count", lower_case)

# Python Program for Convert characters of a string to opposite case

# str = input("Enter a string. ")
# world = ''
# for i in str:
#     if(i.isupper()) == True:
#         world += (i.lower())
#     elif(i.islower()) == True:
#         world += (i.upper())
#     elif(i.isspace()) == True:
#         world += i
# print("The result is:", world)

# # Python | Convert a list of characters into a string

# list = ['j', 'a', 'y', 'e', 's', 'h']
# alpha = ''
# for i in list:
#     alpha += i
# print("The answer is", alpha)
  

# Python Program to find the Larger String without Using Built-in Functions

str1 = input("Enter first string.")
str2 = input("Enter second string.")
count1 = 0
count2 = 0
for i in str1:
    count1 = count1 + 1
for  j in str2:
    count2 = count2 + 1
if(count1 < count2):
        print("Its is largesr string is.")
        print(str2) 
elif (count1 == count2):
        print("Both string are equal.")
else:
    print("Its is largesr string is")
    print(str1)




