class Box extends PackageType {

    Box() {
        this(SizeEnum.SMALL);
    }

    Box(SizeEnum sizeEnum) {
        name = "box";
        description = "box-type package used for posting any kind of package";
        packageSizeFactory = new BoxSizeFactory();
        packageSize = packageSizeFactory.create(sizeEnum);
    }
}
