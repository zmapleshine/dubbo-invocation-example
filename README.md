# dubbo-invocation-example

Please run Consul server for testing in local host,

```shell
docker run -d --name dubbo-test-consul -p 8500:8500 consul
```

Jaeger

```shell
docker run -d  --name dubbo-test-jaeger -e COLLECTOR_ZIPKIN_HTTP_PORT=9411 -p 5775:5775/udp -p 6831:6831/udp -p 6832:6832/udp -p 5778:5778  -p 16686:16686 -p 14250:14250 -p 14268:14268  -p 14269:14269   -p 9411:9411 jaegertracing/all-in-one:latest
```

OpenTelemetry Java Agent:

```shell
wget https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v1.3.1/opentelemetry-javaagent-all.jar
```

In general, it is recommended to start services in the following order:

provider -> service2 -> service1 -> consumer

```shell
mvn clean compile
```

- VM Option for provider service

```shell
-javaagent:./opentelemetry-javaagent-all.jar
-Dotel.javaagent.configuration-file=./javaagent-config.properties
-Dotel.resource.attributes=service.name=dubbo-invocation-example-provider
```

- VM Option for service2 service

```shell
-javaagent:./opentelemetry-javaagent-all.jar
-Dotel.javaagent.configuration-file=./javaagent-config.properties
-Dotel.resource.attributes=service.name=dubbo-invocation-example-service2
```

- VM Option for service1 service

```shell
-javaagent:./opentelemetry-javaagent-all.jar
-Dotel.javaagent.configuration-file=./javaagent-config.properties
-Dotel.resource.attributes=service.name=dubbo-invocation-example-service1
```

- VM Option for consumer service

```shell
-javaagent:./opentelemetry-javaagent-all.jar
-Dotel.javaagent.configuration-file=./javaagent-config.properties
-Dotel.resource.attributes=service.name=dubbo-invocation-example-consumer
```

Jaeger portal :
http://localhost:16686

Test API:
http://localhost:8080/consumer
