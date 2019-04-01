# Electoral Challenge

The goal of this project is to implement a Proof of Concept (PoC)
for an analytics project to predict the Spanish 2019 Local Elections
results for the City Council of Madrid. 

https://en.wikipedia.org/wiki/2019_Madrid_City_Council_election

This is a work in progress and it will be updated until the elections.
A lot of "will be" yet in the project. Stay tuned!

All the software developed will be Open Source.

## Data Sources #1

* Twitter
* Opinion polls
* Past elections
* News
* Other social networks


## Data Processing

The data will be collected using specific extractors and they will
added to Spark Streaming in order to process them.

## Data Analysis

The data will be loaded in Elastic Search and they will be visualized 
using Kibana. During this phase the data quality will be evaluated.

## Results prediction

The data collected will be used to train models in order to predict
the result of the elections.


