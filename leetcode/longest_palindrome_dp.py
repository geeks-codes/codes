def expand_around_center(input_string, c1, c2):
    '''
    Takes input string and center, returns a palindrome
    :param input_string: string
    :param c1: left index
    :param c2: right index
    :return: longest palindrome around c1 and c2
    '''
    r = c2
    l = c1
    n = len(input_string)

    while l >= 0 and r <= n-1 and input_string[l] == input_string[r]:
        l -= 1
        r += 1


    return input_string[l+1 : r]


def longest_palindrome(input_string):
    '''
    Returns the longest palindrome i input string
    :param input_string: input string
    :return: longest palindrome string
    '''
    i = 0
    length = len(input_string)

    #Return None if length of string is 0
    if length == 0:
        return None

    #Single character is a palindrome
    longest = input_string[:1]


    while i < length:
        string1 = expand_around_center(input_string, i, i)

        if len(string1) > len(longest):
            longest = string1


        string2 = expand_around_center(input_string, i, i+1)
        if len(string2) > len(longest):
            longest = string2


        i += 1

    return longest






#-------------_TEST_---------------
input_string = 'acccccccad'
print('Longest Palindrome = '+longest_palindrome(input_string))


