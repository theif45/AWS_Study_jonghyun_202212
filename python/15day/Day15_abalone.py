#!/usr/bin/env python
# coding: utf-8

# #### 전복
# data url : https://archive.ics.uci.edu/ml/machine-learning-databases/abalone/abalone.data
# 
# 1. [함수]requests 패키지를 이용해 데이터 가져와서 ndarray로 변환
# 
# 2. [함수]성별이 'M'인 데이터를 필터, Length 와 Diameter 간 상관도를 반환
# 
# 3. __name__ 값이 __main__이면, 1,2 함수를 실행, 2번 함수의 반환값을 프린트

# In[32]:


import requests
import numpy as np
import matplotlib.pyplot as plt


# In[46]:


def read_data_np():
    r=requests.get('https://archive.ics.uci.edu/ml/machine-learning-databases/abalone/abalone.data')
    raw_data=r.text.split('\n')
    abl_data=[]
    for e in raw_data:
        abl_data.append(e.split(','))
    np_data = np.array(abl_data[:-1])
    return np_data


# In[62]:


def l_w_corr(np_data):
    filter1 = np_data[:,0] == 'M'
    np_data_M = np_data[filter1][:,0:3]
    np_data_l_w = np_data_M[:,1:3].astype(np.float64)
    return np.corrcoef(np_data_l_w[:,0],np_data_l_w[:,1])


# In[63]:


if __name__ == '__main__':
	d = read_data_np()
	out = l_w_corr(d)
	print(out)

