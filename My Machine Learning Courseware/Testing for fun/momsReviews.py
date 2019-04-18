# Natural Language Processing

# Importing the Libraries
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.model_selection import train_test_split

# Importing the dataset
dataset = pd.read_csv('Testing for fun/dataMR.csv', delimiter='\t', quoting=3)

# Cleaning the texts
import re
import nltk
nltk.download('stopwords')
from nltk.corpus import stopwords
from nltk.stem.porter import PorterStemmer
corpus = []
for i in range(0, 1010):
    review = re.sub('[^a-zA-Z]', ' ', dataset['Review'][i])  # removal of unwanted chars
    review = review.lower()  # Lowercase
    review = review.split()  # Separating words
    ps = PorterStemmer()
    review = [ps.stem(word) for word in review if not word in set(stopwords.words('english'))]  # Removal of irrelevant words, and stemming
    review = ' '.join(review)
    corpus.append(review)

# Creating the Bag of Words model
from sklearn.feature_extraction.text import CountVectorizer
cv = CountVectorizer()
x = cv.fit_transform(corpus).toarray()
y = dataset.iloc[:, 1].values



# Fitting Classifier to the Training Set
from sklearn.naive_bayes import GaussianNB
classifier = GaussianNB()
classifier.fit(x, y)

# Predicting the Test set results
x_test = x[1000:1009, :]
y_test = y[1001:1013]
y_pred = classifier.predict(x_test)

# Making the Confusion Matrix
from sklearn.metrics import confusion_matrix
cm = confusion_matrix(y_test, y_pred)