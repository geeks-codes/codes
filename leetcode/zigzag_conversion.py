def zigzag_conversion(input_string, n):
    '''
    Returns zig zag format of a string
    :param input_string: string
    :param n: int
    :return: string
    '''
    i = 0
    j = -2
    flag = 1

    temp_lists = [[] for _ in range(n)]

    for letter in word:
        if flag == 1:
            temp_lists[i].append(letter)
            i += 1

            if i == n:
                i = 0
                flag = 0

        else:
            temp_lists[j].append(letter)
            j -= 1

            if j == -n:
                j = -2
                flag = 1

    output_list = []

    for l in temp_lists:
        output_list.extend(l)

    return ''.join(output_list)

#-----------_TEST_--------------
word = 'PAYPALISHIRING'
n = 10

print(zigzag_conversion(word, n))



