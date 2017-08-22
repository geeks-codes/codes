list1 = [1,2]
list2 = [3,4]


'''
append the second array 
sort the first array
'''


list1.extend(list2)
list1.sort()


center = len(list1) // 2



if center % 2 == 0:
    median = (list1[center - 1] + list1[center]) / 2

else:
    median = list1[center]

print(median)