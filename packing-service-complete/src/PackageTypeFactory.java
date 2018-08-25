class PackageTypeFactory {

    static PackageType create(PackageTypeEnum packageTypeEnum) {
        PackageType packageType = null;

        switch (packageTypeEnum) {
            case BOX:
                packageType = new Box();
                break;
            case ENVELOPE:
                packageType = new Envelope();
                break;
        }

        return packageType;
    }
}
