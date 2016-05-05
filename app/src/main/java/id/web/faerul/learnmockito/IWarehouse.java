package id.web.faerul.learnmockito;

/**
 * Created by faerulsalamun on 3/23/16.
 */
public interface IWarehouse {
    boolean hasInventory(String product, int quantity);
    void remove(String product, int quantity);
}
