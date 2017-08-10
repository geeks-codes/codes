'''Given an array of size n-1 and given that there are numbers from 1 to n with one missing, the missing number is to be found.'''

def check_missing_number(array):
    '''
    Return True if no elements are missing
    :param array: list of numbers
    :return: boolean
    '''
    previous_element = array[0]

    for current_element in array[1:]:
        if current_element != previous_element + 1:
            return False

        previous_element = current_element


    return True


#---------_TEST_------------

continuous_list = [i for i in range(1, 100)]
test_list = [i for i in range(1, 50)]

print(check_missing_number(test_list))




