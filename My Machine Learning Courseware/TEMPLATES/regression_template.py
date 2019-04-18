# REGRESSION TEMPLATE
# Importing the libraries
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.preprocessing import StandardScaler
from sklearn.model_selection import train_test_split

# # # DATA PRE-PROCESSING # # #

# FITTING REG-RES-SOR TO DATA-SET

# Predict Result (OPTIONAL)

# VISUALISING THE RESULTS
x_grid = np.arange(min(x), max(x), 0.1)
x_grid = x_grid.reshape((len(x_grid)), 1)
plt.scatter(x, y, color='red')
plt.plot(x_grid, regressor.predict(x_grid), color='blue')
plt.title('TITLE')
plt.xlabel('X')
plt.ylabel('Y')
plt.show()
