# -*- coding: cp1252 -*-
#Auto-MPG data from the UCI Machine Learning repository:
#http://archive.ics.uci.edu/ml/datasets/Auto+MPG
#Have variables collected from n = 398 cars from years 1970–1982.

import numpy as np
import matplotlib.pyplot as plt
import sklearn
from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import PolynomialFeatures
from sklearn.cross_validation import train_test_split

#Import data from csv, group into columns for ease of use
import csv
import pandas as pd
from pandas import DataFrame as df

#f = open('auto-mpg.data.csv', 'rb')
df = pd.read_csv('auto-mpg.data.csv')
#print df.head
df = df.convert_objects(convert_numeric=True)
#df.info()

y = df.mpg.astype(float)
x = df.horsepower.astype(float)
np.nan_to_num(x, copy=True)
np.nan_to_num(y, copy=True)
x=x.values.reshape(-1,1)

x_train,x_test,y_train,y_test = train_test_split(x,y,test_size=0.2)
#print (y_train.shape)
#print (x_train.shape)


# Train the Linear Regression model and plot a prediction
lr = LinearRegression()
lr.fit(x_train, y_train)
xx = np.linspace(0, 200, 100)
yy = lr.predict(xx.reshape(-1,1))
plt.plot(xx, yy,label="Best Fit OLS")
plt.scatter(x_train, y_train,s=1, label="Training data")

# Set the degree of the Polynomial Regression model
quadratic_featurizer = PolynomialFeatures(degree=2)

# This preprocessor transforms an input data matrix into a new data matrix of a given degree
x_train_quadratic = quadratic_featurizer.fit_transform(x_train)
x_test_quadratic = quadratic_featurizer.transform(x_test)

# Train and test the regressor_quadratic model
regressor_quadratic = LinearRegression()
regressor_quadratic.fit(x_train_quadratic, y_train)
xx_quadratic = quadratic_featurizer.transform(xx.reshape(xx.shape[0], 1))

# Plot the graph
plt.plot(xx, regressor_quadratic.predict(xx_quadratic), c='r', linestyle='--',label="Best fit Quadratic")
plt.title('Predicting miles per gallon from horsepower')
plt.xlabel('Horsepower')
plt.ylabel('MPG')
plt.scatter(x_test,y_test, s=1, label="Test data")
plt.axis([0, 200, 0, 50])
plt.grid(True)
plt.legend()
plt.show()
