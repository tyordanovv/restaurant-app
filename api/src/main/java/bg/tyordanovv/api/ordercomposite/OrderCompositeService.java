package bg.tyordanovv.api.ordercomposite;

import org.springframework.web.bind.annotation.RequestBody;

public interface OrderCompositeService {
    void createOrder(@RequestBody CreateOrderComposite body);
}
