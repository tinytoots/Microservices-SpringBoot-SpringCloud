package com.chenwang.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {


}
