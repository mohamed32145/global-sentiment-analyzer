Global Sentiment Analyzer
The Global Sentiment Analyzer is a microservice-based application designed to collect, analyze, and visualize multilingual customer feedback. Built using modern technologies like Spring Boot, FastAPI, Kafka, and Docker, the project demonstrates robust data streaming, sentiment analysis, and cloud-native deployment on AWS.

Features
Feedback Collection: Gathers raw feedback from multiple sources such as Twitter and email.
Real-Time Sentiment Analysis: Leverages NLP tools to analyze feedback in multiple languages.
Data Streaming: Uses Kafka for scalable and efficient data processing.
Visualization: Displays trends and insights through a simple web application.
Tech Stack
Backend Services
Java (Spring Boot): For feedback collection.
Python (FastAPI): For sentiment analysis.
Data Streaming
Apache Kafka: For message queueing and inter-service communication.
Databases
PostgreSQL: For structured data storage (e.g., user profiles).
MongoDB: For storing unstructured feedback data.
Cloud & Containerization
AWS (EKS, MSK): For Kubernetes and managed Kafka services.
Docker: For containerizing microservices.
System Architecture
Feedback Collection Service:

Gathers feedback from sources (e.g., Twitter, email).
Publishes raw data to Kafka's feedback topic.
Sentiment Analysis Service:

Consumes data from Kafka's feedback topic.
Analyzes sentiments using multilingual NLP models.
Publishes results to Kafka's sentiments topic.
Storage and Visualization:

Stores analyzed results in PostgreSQL and MongoDB.
Visualizes trends through a web application.
