def max_subarray(array):
    '''
    Returns the maximum sum in array. Runtime O(n)
    :param array:list of numbers
    :return: biggest sum in array
    '''
    max_ending_here = max_so_far = array[0]

    for i in array[1:]:
        max_ending_here = max(i, max_ending_here + i)
        max_so_far = max(max_ending_here, max_so_far)

    return max_so_far


#---------------_TEST_----------------

a = [-1, -2, -3]

result = max_subarray(a)

print(result)