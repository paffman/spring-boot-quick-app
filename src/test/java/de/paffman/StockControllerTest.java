package de.paffman;

import de.paffman.controller.StockController;
import de.paffman.model.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockControllerTest {

    @Autowired
    StockController stockController;

    @Test
    public void testGetEntity() {
        Integer vertragId = 12345;
        ResponseEntity<Stock> result = stockController.getStockPrice(vertragId);
        assertThat(result.getBody().getPrice()).isPositive();
    }
}
