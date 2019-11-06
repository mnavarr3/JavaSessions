package Example3;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class AbstractOrder {

    private long id;
    private LocalDate createdOn;
    private BigDecimal amount;

    public abstract void validate();
    public abstract void process();

    public final void cancel() {
        // universal code for order cancellations
    }
}
