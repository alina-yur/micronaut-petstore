## Micronaut 4.9.1 Documentation

- [User Guide](https://docs.micronaut.io/4.9.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.9.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.9.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Micronaut Maven Plugin documentation](https://micronaut-projects.github.io/micronaut-maven-plugin/latest/)
## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)


## Feature test-resources documentation

- [Micronaut Test Resources documentation](https://micronaut-projects.github.io/micronaut-test-resources/latest/guide/)


## Feature validation documentation

- [Micronaut Validation documentation](https://micronaut-projects.github.io/micronaut-validation/latest/guide/)


## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature annotation-api documentation

- [https://jakarta.ee/specifications/annotations/](https://jakarta.ee/specifications/annotations/)


## Feature data-jdbc documentation

- [Micronaut Data JDBC documentation](https://micronaut-projects.github.io/micronaut-data/latest/guide/index.html#jdbc)


## Feature flyway documentation

- [Micronaut Flyway Database Migration documentation](https://micronaut-projects.github.io/micronaut-flyway/latest/guide/index.html)

- [https://flywaydb.org/](https://flywaydb.org/)


## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)


## Feature views-thymeleaf documentation

- [Micronaut Thymeleaf Views documentation](https://micronaut-projects.github.io/micronaut-views/latest/guide/index.html#thymeleaf)

- [https://www.thymeleaf.org/](https://www.thymeleaf.org/)


## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)





Manual config

# Application Configuration
micronaut.application.name=micronaut-petstore

# Thymeleaf configuration
micronaut.views.thymeleaf.enabled=true
micronaut.views.thymeleaf.cache=false

# Disable Test Resources
micronaut.test.resources.enabled=false

# Database configuration
datasources.default.dialect=MYSQL
datasources.default.db-type=mysql
datasources.default.driver-class-name=com.mysql.cj.jdbc.Driver
datasources.default.url=jdbc:mysql://localhost:3306/petstore_db
datasources.default.username=petstore_user
datasources.default.password=password

# Flyway migration
flyway.datasources.default.enabled=true





