# Spring Boot, MySQL, JPA, Hibernate Rest API 和使用javascript 来读入外部IOT协议

Build Restful CRUD API for a simple application using Spring Boot, Mysql, JPA and Hibernate.

协议放在外部的js函数中，根据协议解析，并且建表，目的是动态建表，而不是hibernate 的自动建表。
建表还没有做，这点没有node js 来得方便，nodejs的方便之处在于json对象可以直接当成对象使用。


**4. Build and run the app using maven**

```bash
mvn package
java -jar target/easy-notes-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/user
    
    POST /api/user
    
    GET /api/user/{Id}
    
    PUT /api/user/{Id}
    
    DELETE /api/user/{Id}

You can test them using postman or any other rest client.


