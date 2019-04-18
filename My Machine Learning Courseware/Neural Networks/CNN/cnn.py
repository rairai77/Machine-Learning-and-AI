# Convolutional Neural Network
from keras.models import Sequential
from keras.layers import Convolution2D
from keras.layers import MaxPooling2D
from keras.layers import Flatten
from keras.layers import Dense

# Initializing the CNN
classifier = Sequential()

# Step 1: Convolution
classifier.add(Convolution2D(filters=32, kernel_size=3, input_shape=(64, 64, 3), activation='relu', data_format='channels_last'))

# Step 2: Pooling
classifier.add(MaxPooling2D(pool_size=2))
# Step 1: Convolution

classifier.add(Convolution2D(filters=32, kernel_size=3, activation='relu', data_format='channels_last'))

# Step 2: Pooling
classifier.add(MaxPooling2D(pool_size=2))

# Step 1: Convolution
classifier.add(Convolution2D(filters=64, kernel_size=3, activation='relu', data_format='channels_last'))

# Step 2: Pooling
classifier.add(MaxPooling2D(pool_size=2))
# Step 3: Flattening
classifier.add(Flatten())

# Step 4: Full Connection
classifier.add(Dense(units=128, activation='relu'))
classifier.add(Dense(units=1, activation='sigmoid'))

# Compiling the CNN!!!
classifier.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

# Fitting CNN to the images

import tensorflow as tf
from keras.backend.tensorflow_backend import set_session

config = tf.ConfigProto()
config.gpu_options.per_process_gpu_memory_fraction = 0.7
set_session(tf.Session(config=config))

from keras.preprocessing.image import ImageDataGenerator
from PIL import Image
train_datagen = ImageDataGenerator(
        rescale=1./255,
        shear_range=0.2,
        zoom_range=0.2,
        horizontal_flip=True)

test_datagen = ImageDataGenerator(rescale=1./255)

training_set = train_datagen.flow_from_directory(
        'Neural Networks/CNN/dataset/training_set',
        target_size=(64, 64),
        batch_size=32,
        class_mode='binary')

test_set = test_datagen.flow_from_directory(
        'Neural Networks/CNN/dataset/test_set',
        target_size=(64, 64),
        batch_size=32,
        class_mode='binary')

classifier.fit_generator(
        training_set,
        steps_per_epoch=8000,
        epochs=25,
        validation_data=test_set,
        validation_steps=2000)

classifier.save('Neural Networks/CNN/model.txt')