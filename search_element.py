# list = [1, 2, 3, 4, 5, 6, 7]
# x = 2
# count = 0
# for i in list:
#     if (i == x):
#         print("Element found")
#         count = 1
#         break
# if(count == 0):
#     print("Not Element found")

# list = [1, 2, 2, 2, 5, 6, 7]
# x = 2
# count = 0
# for i in list:
#     if(i == x):
#         count = count + 1
# print('{} has occured {} time'.format(x, count))

list = [1, 2, 3, 4, 5, 6, 7]
x = 2
if (x in list):
    print("Element found")
else:
    print("Not found")
