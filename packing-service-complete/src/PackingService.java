public class PackingService {

    public static void main(String[] args) {

        sendPackageOne();
        sendPackageTwo();
    }

    private static void sendPackageOne() {
        MailingInformation mailingInformation = new MailingInformation();
        mailingInformation.setSenderName("Rafa Manrique").setSenderAddress("Chihuahua, Chih.")
                          .setReceiverName("Doris Gonzalez").setReceiverAddress("Casas grandes, Chih");

        ShippingType shippingType = ShippingTypeFactory.create(ShippingTypeEnum.LAND);

        PackageType packageType = PackageTypeFactory.create(PackageTypeEnum.BOX);

        PackageContent packageContent = new PackageContent("glass trophy to the java dev of the year", true, false, false);

        Package pack = new Package();
        pack.setMailingInformation(mailingInformation);
        pack.setShippingType(shippingType);
        pack.setPackageType(packageType);
        pack.setPackageContent(packageContent);

        pack.send();
    }

    private static void sendPackageTwo() {
        MailingInformation mailingInformation = new MailingInformation();
        mailingInformation.setSenderName("Pau Quezada").setSenderAddress("Casas grandes, Chih.")
                .setReceiverName("Rafa Manrique").setReceiverAddress("Chihuahua, Chih");

        ShippingType shippingType = ShippingTypeFactory.create(ShippingTypeEnum.LAND);

        PackageType packageType = PackageTypeFactory.create(PackageTypeEnum.ENVELOPE);
        packageType.setSize(SizeEnum.MEDIUM);

        PackageContent packageContent = new PackageContent("anthrax", false, false, true);

        Package pack = new Package();
        pack.setMailingInformation(mailingInformation);
        pack.setShippingType(shippingType);
        pack.setPackageType(packageType);
        pack.setPackageContent(packageContent);

        pack.send();
    }
}
