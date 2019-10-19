package de.paffman.service;

import de.paffman.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public Stock getStockPrice(Integer wkn) {
        String sql = "SELECT price FROM STOCK_PRICES WHERE wkn = " + wkn;
        double result = jdbcTemplate.queryForObject(sql, Double.class);
        return new Stock(wkn, result);
    }

    public Stock updateStockPrice(Integer wkn, Double price) {
        String sql = "Update STOCK_PRICES set price = " + price + " WHERE wkn = " + wkn;
        jdbcTemplate.update(sql);
        return getStockPrice(wkn);
    }

}
