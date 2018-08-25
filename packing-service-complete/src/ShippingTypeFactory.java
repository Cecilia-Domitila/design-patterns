class ShippingTypeFactory {

    static ShippingType create(ShippingTypeEnum shippingTypeEnum) {
        ShippingType shippingType = null;

        switch (shippingTypeEnum) {
            case LAND:
                shippingType = new LandShipping();
                break;
            case AIR:
                shippingType = new AirShipping();
                break;
        }

        return shippingType;
    }
}
