package de.paffman.controller;

import de.paffman.model.Stock;
import de.paffman.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/stocks")
public class StockController {

    @Autowired
    StockService stockService;


    @GetMapping(path = "/price/{wkn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Stock> getStockPrice(@PathVariable("wkn") Integer wkn) {
        Stock result = stockService.getStockPrice(wkn);
        return ResponseEntity.accepted().body(result);
    }

    @PostMapping(path = "/price/{wkn}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Stock> setStockPrice(@PathVariable("wkn") Integer wkn, @RequestBody Double price) {
        Stock updatedStock = stockService.updateStockPrice(wkn, price);
        return ResponseEntity.accepted().body(updatedStock);
    }
}
