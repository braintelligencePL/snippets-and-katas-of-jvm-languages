import lombok.extern.slf4j.Slf4j;
import lombok.val;

import java.util.function.Supplier;

@Slf4j
public class HigherOrderFunctions {
    public static void main(String[] args) {

        val higherOrderFunctions = new HigherOrderFunctions();

        log.info(higherOrderFunctions.availableCustomers(Customer::isAvailable));
    }

    private String availableCustomers(Supplier<Boolean> customerFunction) {
        return String.valueOf(customerFunction.get());
    }
}

class Customer {
    static boolean isAvailable() {
        return true;
    }
}
