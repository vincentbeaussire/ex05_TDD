import org.example.NormalProductUpdate;
import org.example.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {


    @Test
    public void when_NormalProductDateIsZero_Then_QualityDegradesTwoFast() {
        Product product = new Product("Normal Product", 5, 10, new NormalProductUpdate());
        product.update();
        assertEquals(5, product.sellIn);
        assertEquals(10, product.quality);
    }

    @Test
    public void when_NormalProduct_Then_QualityNeverNegative() {
        Product product = new Product("Normal Product", 5, 10, new NormalProductUpdate());
        product.update();
        assertEquals(5, product.sellIn);
        assertEquals(10, product.quality);
    }

    @Test
    public void when_NormalProduct_Then_QualityNeverSup50() {
        Product product = new Product("Normal Product", 5, 10, new NormalProductUpdate());
        product.update();
        assertEquals(50, product.sellIn);
        assertEquals(10, product.quality);
    }
}
