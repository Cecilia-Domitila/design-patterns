class PackageContent {

    private String description;
    private boolean fragile;
    private boolean liquid;
    private boolean dangerous;

    PackageContent(String description, boolean fragile, boolean liquid, boolean dangerous) {
        this.description = description;
        this.fragile = fragile;
        this.liquid = liquid;
        this.dangerous = dangerous;
    }

    String getDescription() {
        return description;
    }

    boolean isFragile() {
        return fragile;
    }

    boolean isLiquid() {
        return liquid;
    }

    boolean isDangerous() {
        return dangerous;
    }
}
