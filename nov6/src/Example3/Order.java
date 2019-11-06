package Example3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {
    public enum OrderType {
        ONLINE, STORE, WAREHOUSE;
    }

    private long id;
    private long storeId;
    private Employee storeRep;
    private long warehouseId;
    private LocalDate createdOn;
    private BigDecimal amount;
    private OrderType type;

    public void validate() {
        if (type == OrderType.STORE) {
            // code for store order validation
        } else if (type == OrderType.WAREHOUSE) {
            // code for warehouse order validation
        } else if (type == OrderType.ONLINE) {
            // code for online order validation
        }
    }

    public void process() {
        if (type == OrderType.STORE) {
            // code for store order validation
        } else if (type == OrderType.WAREHOUSE) {
            // code for warehouse order validation
        } else if (type == OrderType.ONLINE) {
            // code for online order validation
        }
    }

    public void cancel() {
        // universal code for order cancellations
    }
}
