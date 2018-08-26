class BoxSizeFactory implements PackageSizeFactory {

    @Override
    public PackageSize create(SizeEnum size) {
        PackageSize packageSize = null;

        switch (size) {
            case SMALL:
                packageSize = new SmallBox();
                break;
            case MEDIUM:
                packageSize = new MediumBox();
                break;
            case LARGE:
                packageSize = new LargeBox();
                break;
        }

        return packageSize;
    }
}
