#!/usr/bin/env python

# factorial.py
# Python script to find factorial of given number.
# AUTHOR: PETROS FRANGATZIS

""" Takes an integer as parameter and recursively computes it's factorial.

>>> factorial(5)
120
>>> factorial(0)
1  
"""
def factorial(x):

    if x < 0:
        return('Factorial undefined for non-positive integers.')
    elif x == 0:
        return(1) # 0! == 1 --> TRUE
    else:
        return(x * factorial(x-1)) # x! == x * (x-1)! --> TRUE


if __name__ == "__main__":
    x = int(input("Find factorial of: "))
    print('Factorial of', x, '=', factorial(x))
