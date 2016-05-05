package id.web.faerul.learnmockito;

import java.util.HashMap;

/**
 * Created by faerulsalamun on 3/23/16.
 */
public class RealWarehouse implements IWarehouse {

    public RealWarehouse() {
        products = new HashMap();
        products.put("Talisker", 5);
        products.put("Lagavulin", 2);
    }

    public boolean hasInventory(String product, int quantity) {
        return inStock(product) == quantity;
    }

    public void remove(String product, int quantity) {
        products.put(product, inStock(product) - quantity);
    }

    private int inStock(String product) {
        Integer quantity = (Integer) products.get(product);
        return quantity == null ? 0 : quantity;
    }

    private HashMap products;
}
