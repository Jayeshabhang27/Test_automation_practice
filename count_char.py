# string = input("Enter a string: ")
# def count(str):
#     dict = {}
#     for i in string:
#         if i in string:
#             dict[i] += 1
#         else:
#             dict[i] = 1
#     return dict
# print(count(string))

string = input("Enter a string: ")
count = {}
for i in  string:
    if i in count:
        count[i] += 1
    else:
        count[i] = 1
print("Count frequency.")
for key, value in count.items():
    print(f"{key} occured {value} time")
