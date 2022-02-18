#!/usr/bin/env python

"""
Python script to find factorial of given number
"""

def factorial(x):

    if x < 0:
        return('Factorial undefined for non-positive integers.')
    elif x == 0:
        return(1) # 0! == 1 --> TRUE
    else:
        return(x * factorial(x-1)) # x! == x * (x-1)! --> TRUE


x = int(input("Find factorial of: "))
print('Factorial of', x, '=', factorial(x))
