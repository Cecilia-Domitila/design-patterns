import java.util.Random;

class Package {

    private int folio;
    private MailingInformation mailingInformation;
    private ShippingType shippingType;
    private PackageType packageType;
    private PackageContent packageContent;

    void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    void setMailingInformation(MailingInformation mailingInformation) {
        this.mailingInformation = mailingInformation;
    }

    void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }

    void setPackageContent(PackageContent packageContent) {
        this.packageContent = packageContent;
    }

    void send() {
        System.out.println("Sending package...!!");
        System.out.println("\n");
        folio = new Random().nextInt(1000000);
        print();
    }

    private void print() {
        printFolio();
        printMailingInformation();
        printShippingType();
        printPackageDescription();
    }

    private void printFolio() {
        System.out.println("FOLIO");
        System.out.println("--------------");
        System.out.println("Number: " + folio);
        System.out.println("\n");
    }

    private void printMailingInformation() {
        System.out.println("MAILING INFORMATION");
        System.out.println("--------------");
        System.out.println("- Sender's name: " + mailingInformation.getSenderName());
        System.out.println("- Sender's address: " + mailingInformation.getSenderAddress());
        System.out.println("- Receiver's name: " + mailingInformation.getReceiverName());
        System.out.println("- Receiver's description: " + mailingInformation.getReceiverAddress());
        System.out.println("\n");
    }

    private void printShippingType() {
        System.out.println("SHIPPING INFORMATION");
        System.out.println("--------------");
        System.out.println("- Type: " + shippingType.get());
        System.out.println("\n");
    }

    private void printPackageDescription() {
        System.out.println("PACKAGE INFORMATION");
        System.out.println("--------------");
        System.out.println("- Type: " + packageType.getName() + " (" + packageType.getDescription() + ")");
        System.out.println("- Size: " + packageType.getPackageSize().getDescription() +
                           " (" + packageType.getPackageSize().getSize() + ")");

        System.out.println("- Content: " + packageContent.getDescription());

        if (packageContent.isFragile()) {
            System.out.println("- (F) Fragile");
        }

        if (packageContent.isLiquid()) {
            System.out.println("- (L) Liquid");
        }

        if (packageContent.isDangerous()) {
            System.out.println("- (D) Dangerous");
        }

        System.out.println("\n");
    }
}
