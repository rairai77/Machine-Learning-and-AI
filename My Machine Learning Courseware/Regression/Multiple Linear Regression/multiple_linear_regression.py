# Importing the libraries
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.preprocessing import StandardScaler, OneHotEncoder, LabelEncoder
from sklearn.model_selection import train_test_split
import statsmodels.formula.api as sm
# Importing the data-set
dataset = pd.read_csv('Regression/Multiple Linear Regression/50_startups.csv')
x = dataset.iloc[:, :-1].values
y = dataset.iloc[:, 4].values

# Dealing with Categorical Data
labelencoder_x = LabelEncoder()
x[:, 3] = labelencoder_x.fit_transform(x[:, 3])
onehotencoder = OneHotEncoder(categorical_features=[3])
x = onehotencoder.fit_transform(x).toarray()

# Dealing with the DUMMY VARIABLE TARP
x = x[:, 1:]

# Building the optimal model Backward Elimination
x = np.append(arr=np.ones((50, 1)).astype(int), values=x, axis=1)
x_opt = x[:, [0,3]]
regressor = sm.OLS(endog=y, exog=x_opt).fit()
x_train, x_test, y_train, y_test = train_test_split(x_opt, y, test_size=0.2, random_state=0)

# Fitting Multiple Linear Regression to the Training Set
from sklearn.linear_model import LinearRegression
regressor = LinearRegression()
regressor.fit(x_train, y_train)

# Predicting the Test set Results
y_pred = regressor.predict(x_test)

