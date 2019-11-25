package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    DeliveryService deliveryService;
    ReceivingOrderService receivingOrderService;
    OrdersRepository ordersRepository;

    public ProductOrderService(final DeliveryService deliveryService,
                               final ReceivingOrderService receivingOrderService,
                               final OrdersRepository ordersRepository) {
        this.deliveryService = deliveryService;
        this.receivingOrderService = receivingOrderService;
        this.ordersRepository = ordersRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isAvailable = orderRequest.product.isAvailable();
        if(isAvailable){
            return new OrderDto(orderRequest.getProduct(), true);
        }else{
            return new OrderDto(orderRequest.getProduct(),false);
        }
    }
}
