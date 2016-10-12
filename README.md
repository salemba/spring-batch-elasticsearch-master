# spring-batch-elasticsearch
This project is a fork from the flofly<a href="https://github.com/theflofly/spring-batch-elasticsearch">Spring Batch ES project</a>.
In this project, data are inserted into MySQL, then pulled from database and sent to Elastic Search.

<h2>Prerequisites</h2>
This project was tested using :
<ul>
<li>Running MySQL Server v5.6</li>
<li>ElasticSearch Server v1.5.2</li>
<li>JDK 8</li>
<li>Maven 3</li>
</ul>

<h2>Testing</h2>
To build the project :
```shell
mvn clean install
```

To run the project :
```shell
java -jar target\Issue1-0.0.1-SNAPSHOT.jar
```

You can simply run this project in spring boot style:

```shell
mvn spring-boot:run
```

