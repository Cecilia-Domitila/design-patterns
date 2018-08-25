class Envelope extends PackageType {

    Envelope() {
        this(SizeEnum.SMALL);
    }

    Envelope(SizeEnum sizeEnum) {
        name = "envelope";
        description = "envelope-type package used for posting documents, photos and stuff like that";
        packageSizeFactory = new EnvelopeSizeFactory();
        packageSize = packageSizeFactory.create(sizeEnum);
    }
}
