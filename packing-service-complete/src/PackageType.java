abstract class PackageType {

    String name;
    String description;
    PackageSize packageSize;
    PackageSizeFactory packageSizeFactory;

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    PackageSize getPackageSize() {
        return packageSize;
    }

    void setSize(SizeEnum sizeEnum) {
        packageSize = packageSizeFactory.create(sizeEnum);
    }

    void setSize(PackageSize packageSize) {
        this.packageSize = packageSize;
    }
}
