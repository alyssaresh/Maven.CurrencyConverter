package io.zipcoder.currencyconverterapplication;

import java.math.BigDecimal;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return Double.MAX_VALUE;
    }
}