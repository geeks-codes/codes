def palindrome_checker(input_string):
    '''
    Verifies if string is palindrome or not
    :param input_string:
    :return:
    '''
    j = len(input_string) - 1

    for letter in input_string:
        if letter != input_string[j]:
            return False

        j -= 1

    return True

#-----BRUTE FORCE------
input_string = 'babad'
i = 0
length = len(input_string)
palindrome_length = 0

while i < length:
    j = i
    while j < length:
        if palindrome_checker(input_string[i:j+1]):
            if len(input_string[i:j+1]) > palindrome_length:
                palindrome_length = len(input_string[i:j+1])
                palindrome = input_string[i:j+1]
        j += 1
    i += 1

print(palindrome)