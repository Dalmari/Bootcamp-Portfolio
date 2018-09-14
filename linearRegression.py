import matplotlib.pyplot as plt
import numpy as np
from sklearn import datasets, linear_model
from sklearn.metrics import mean_squared_error, r2_score

print("===Not using LinearRegression function:===")
# Load the dataset
diabetes = datasets.load_diabetes()

#Select the data
x = diabetes.data [:, np . newaxis , 2] #Only using 1 feature for simple linear regression
y = diabetes.target

#Check dimensions
#print (diabetes.data.shape)    

mean_x = np.mean(x)
#print (mean_x)
mean_y = np.mean(y)
#print (mean_y)

m = len(x)
#print(len(x))
numer = 0
denom = 0
for i in range(m):
    numer += (x[i] - mean_x) * (y[i] - mean_y)
    denom += (x[i] - mean_x) ** 2
b1 = numer / denom
b0 = mean_y - (b1 * mean_x)

# Print coefficients
print "The slope and intercept values, respectively, are: "
print(b1 , b0)


    # plotting the actual points as scatter plot
#plt.scatter(x, y, color = "r",
#               marker = "o", s = 30)
 
    # predicted response vector
y_pred = b0 + b1*x
 
    # plotting the regression line
plt.plot(x, y_pred, color = "blue",label="Best Fit Line")
 
    # putting labels on graph
plt.xlabel('x')
plt.ylabel('y')
 
    # function to show plot
#plt.show()

#===Check using LinearRegression
#from sklearn import linear_model
#regr = linear_model.LinearRegression()
#regr.fit(x,y)
#LinearRegression(copy_X=True, fit_intercept=True, n_jobs=1, normalize=False)
#print(regr.coef_)

print ("===Using last 20 samples as test data:===")

dx_train = x [:- 20]
n = len(dx_train)
mean_train_x = np.mean(dx_train)
#print (mean_train_x)
dy_train = diabetes. target [:- 20]
mean_train_y = np.mean(dy_train)
dx_test = x [- 20 :]
dy_test = diabetes.target [- 20 :]
numer_train = 0
denom_train= 0
for i in range(n):
    numer_train += (dx_train[i] - mean_train_x) * (dy_train[i] - mean_train_y)
    denom_train += (dx_train[i] - mean_train_x) ** 2
b1_train = numer_train / denom_train
b0_train = mean_train_y - (b1_train * mean_train_x)

# Print coefficients
print "The slope and intercept values, respectively, are: "
print(b1_train, b0_train)

diabetes_y_pred = b0_train + b1_train*dx_test

diabetes_y_pred2 = diabetes_y_pred.reshape(20)
#print diabetes_y_pred2
#print (diabetes_y_pred2.shape) 
#print (diabetes_y_pred.shape) 
mse = np.mean ((diabetes_y_pred2  - dy_test ) ** 2)
print ("The MSE is")
print (mse)

# Plot outputs
plt.scatter(dx_test, dy_test,  color='green',s=10, label="Test data")
plt.scatter(dx_train, dy_train, color='red',s=10, label="Training data")
plt.plot(dx_test, diabetes_y_pred, color='black',label="Fitted line from test/train")
plt.xticks(())
plt.yticks(())
plt.legend()

plt.show()





####==Check using LinearRegression
#lr = linear_model . LinearRegression ()
#lr . fit ( dx_train , dy_train)
#print (lr.predict(dx_test))
#mse = np . mean (( lr . predict ( dx_test ) - dy_test ) ** 2)
#lr_score = lr . score ( dx_test , dy_test)
#print ( lr . coef_)
#print ( mse)



