def longest_substring(input_string):
    '''
    Takes as input a string and returns length of longest substring
    :param input_string: input string
    :return: length of longest substring
    '''

    length = len(input_string)
    i = 0
    j = 0
    elements = set()
    total_length = 0

    while i < length and j < length:
        if input_string[j] not in elements:
            elements.add(input_string[j])
            j += 1
            total_length = max(total_length, j - i)

        else:
            elements.discard(input_string[i])
            i += 1

    return total_length





#----------------_TEST_----------------
input_string = 'abcabcbb'

print(longest_substring(input_string))