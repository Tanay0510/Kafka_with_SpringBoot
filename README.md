# Kafka with Spring Boot

Basic Spring Boot example with Kafka


#### Start Zookeper server with default configuration file

```
bin/zookeeper-server-start.sh config/zookeeper.properties
```
#### Start Kafka Server with default configuration file as single-broker cluster

```
/bin/kafka-server-start.sh ./config/server.properties
```

#### First Create a test topic to use with the example

```
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_2
```

#### Publish to the Kafka Topic via Console

```
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Kafka_Example_2 --from-beginning
```

