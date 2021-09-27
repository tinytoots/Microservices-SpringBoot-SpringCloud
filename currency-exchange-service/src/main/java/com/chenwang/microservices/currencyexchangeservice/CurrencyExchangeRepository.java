package com.chenwang.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    // When you create a method like this, the implementation would be provided by Spring Data JPA,
    // Spring Data JPA would convert this into a SQL query where we would actually query the table by FromAndTo
    // Since we are using Spring Data JPA, we don't need to write query for search a set of criteria. We can define a method findBy<property0>And<property1> and a query will be automatically generated behind the scene.
    // Here are all the details: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
    CurrencyExchange findByFromAndTo(String from, String to);
}
