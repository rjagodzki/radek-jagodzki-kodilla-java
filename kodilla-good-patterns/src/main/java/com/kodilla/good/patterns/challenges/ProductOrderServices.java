package com.kodilla.good.patterns.challenges;

public class ProductOrderServices {
    private UserInformation userInformation;
    private ProductInformation productInformation;
    private DeliveryInformation deliveryInformation;

    public ProductOrderServices(final UserInformation userInformation, final ProductInformation productInformation, final DeliveryInformation deliveryInformation) {
        this.userInformation = userInformation;
        this.productInformation = productInformation;
        this.deliveryInformation = deliveryInformation;
    }


//    public OrderDto process(final OrderRequest orderRequest){
////        boolean isAvailable = orderRequest.
//
//
//    }
}
