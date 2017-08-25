'''Corner cases
- negative numbers
- in Java numbers that overflow
'''

def palindrome_number(number):
    '''
    Returns true if number is a palindrome
    :param number: int
    :return: bool
    '''

    if number < 0:
        return 0

    original = number
    reverse = 0

    while number != 0:
        reverse = reverse * 10
        reverse = reverse + number % 10
        number = number // 10



    if reverse == original:
        return True

    else:
        return False


def palindrome_number_string_variant(number):
    '''
    Return True if number is a palindrome
    :param number: int
    :return: bool
    '''

    if number < 0:
        return 0

    b = str(number)
    c = b[::-1]

    if b == c:
        return True

    else:
        return False


#------------_TRUE_-----------------
print(palindrome_number(131))
print(palindrome_number_string_variant(121))