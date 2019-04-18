#SVR

# Importing the libraries
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.model_selection import train_test_split

# # # DATA PRE-PROCESSING # # #

# Importing the data-set
dataset = pd.read_csv('Regression/Support Vector Regression/Position_Salaries.csv')
x = dataset.iloc[:, 1:2].values
y = dataset.iloc[:, 2].values


# Feature Scaling
sc_x = StandardScaler()
x = sc_x.fit_transform(x)
sc_y = StandardScaler()
y = np.squeeze(sc_y.fit_transform(y.reshape(-1, 1)))

# FITTING SVR TO DATA-SET
from sklearn.svm import SVR
regressor = SVR(kernel='rbf')
regressor.fit(x, y)

# Predict Result (OPTIONAL)
y_pred = sc_y.inverse_transform(regressor.predict(sc_x.fit_transform(np.array([[6.5]]))))

# VISUALISING THE SVR RESULTS
plt.scatter(x, y, color='red')
plt.plot(x, regressor.predict(x), color='blue')
plt.title('TITLE')
plt.xlabel('X')
plt.ylabel('Y')
plt.show()
