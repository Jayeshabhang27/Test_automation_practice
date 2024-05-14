# # no = int(input("Enter a number: "))
# list = [1, 2, 3, 4, 5, 6]
# def sum(list):
#     sum_list = 0
#     for i in list:
#         sum_list += i
#     return sum_list
# print(sum(list))

# WAP to remove duplicate from list

list = [1, 2, 2, 3,3, 4, 5, 6]
my_list = []
for i in list:
    if i  not in my_list:
        my_list.append(i)
print("The ans", my_list)

  