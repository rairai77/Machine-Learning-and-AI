# REGRESSION TEMPLATE
# Importing the libraries
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.model_selection import train_test_split

# # # DATA PRE-PROCESSING # # #

# Importing the data-set
dataset = pd.read_csv('Regression/Random Forest Regression/Position_Salaries.csv')
x = dataset.iloc[:, 1:2].values
y = dataset.iloc[:, 2].values

# FITTING REG-RES-SOR TO DATA-SET

from sklearn.ensemble import RandomForestRegressor
regressor = RandomForestRegressor(n_estimators=3000000000, random_state=0)
regressor.fit(x, y)

# Predict Result (OPTIONAL)
y_pred = regressor.predict(6.5)

# VISUALISING THE RESULTS
x_grid = np.arange(min(x), max(x), 0.01)
x_grid = x_grid.reshape((len(x_grid)), 1)
plt.scatter(x, y, color='red')
plt.plot(x_grid, regressor.predict(x_grid), color='blue')
plt.title('Random Furriest Regresion')
plt.xlabel('POS')
plt.ylabel('MUNEYS')
plt.show()
