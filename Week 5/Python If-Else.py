#!/bin/python
# https://www.hackerrank.com/challenges/py-if-else/problem?isFullScreen=true


import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(raw_input().strip())
    if n % 2 != 0:
        print("Weird")
    elif (n>=2 and n<=5) and n % 2 == 0:
        print("Not Weird")
    elif (n>=6 and n<=20) and n % 2 == 0:
        print("Weird") 
    elif n>20 and n % 2 == 0:
        print("Not Weird")       
            
