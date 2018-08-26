class EnvelopeSizeFactory implements PackageSizeFactory {

    @Override
    public PackageSize create(SizeEnum size) {
        PackageSize packageSize = null;

        switch (size) {
            case SMALL:
                packageSize = new SmallEnvelope();
                break;
            case MEDIUM:
                packageSize = new MediumEnvelope();
                break;
            case LARGE:
                packageSize = new LargeEnvelope();
                break;
        }

        return packageSize;
    }
}
