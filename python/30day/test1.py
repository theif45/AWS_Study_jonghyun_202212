#!/usr/bin/env python
# coding: utf-8

# 함수 my_sq_prod 의 요구사항
# 
# * 매개변수: python list
# 
# * 반환값: 입력된 리스트의 각 element 값을 제곱한 값의 곱을 반환
# 
#  
# 
# def my_sq_prod(number_list):
# 
#    return_value = 0
# 
#    for number in number_list:
# 
#         return_value = return_value * number**2
# 
#    return return_value
# 
#  
# 
# assert my_sq_prod([1,2,3]) == 36
# 
#  
# 
# * assertion error가 발생하지 않도록 수정하시오.

# In[5]:


def my_sq_prod(python_list):
    return_value = 0
    for i,number in enumerate(python_list):
        if(i==0):
            return_value = number**2 
        else:
            return_value = return_value * number**2
    return return_value

assert my_sq_prod([1,2,3]) == 36


# 함수 my_sq_prod 의 요구사항
# 
# * 매개변수: python list
# 
# * 반환값: 입력된 리스트의 각 element 값을 제곱한 값의 곱을 반환
# 
# * 로직:
# 
# - 매개변수로 입력된 python 리스트의 제곱 값을 변수명 return_list 의 빈 python리스트에 추가.
# 
# - return_list의 각 element의 곱을 math.prod() 함수를 이용하여 반환.
# 
#  
# 
# * 필요한 모듈은 적절히 import 할 것.

# In[10]:


import math

def my_sq_prod(python_list):
    return_list=[]
    for number in python_list:
        return_list.append(number**2)
    return math.prod(return_list)

assert my_sq_prod([1,2,3]) == 36


# 함수 my_sq_prod3 의 요구사항
# 
# * 매개변수: numpy ndarray
# 
# * 반환값: 입력된 ndarray의 각 element 값을 제곱한 값의 곱을 반환
# 
# * 로직: ndarray의 broadcasting 기능을 활용할것.
# 
# * 필요한 모듈은 적절히 import 할것.
# 
# * assert 구문을 활용하여 np.array([4,5,6])의 값이 14400 임을 확인.

# In[33]:


import numpy as np

def my_sq_prod3(python_list):
    return np.broadcast(python_list,python_list)

assert my_sq_prod(np.array([4,5,6])) == 14400


# * 제출 파일명: 성명.py
# 
# * 요구사항:
# 
# - python 성명.py 명령어로 스크립트를 실행하였을 때, 아래 함수가 실행되도록 하시오.
# 
#  
# 
# def score_check():
# 
#    score = 0
# 
#    if my_sq_prod([1,2,3])==36:
# 
#        score += 30
# 
#    print(score)

# In[40]:


def score_check():
    score = 0
    if my_sq_prod([1,2,3])==36:
        score += 30
    print(score)

if __name__ =='__main__':
    score_check()

