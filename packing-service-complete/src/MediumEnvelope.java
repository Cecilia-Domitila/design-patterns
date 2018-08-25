class MediumEnvelope extends PackageSize {

    MediumEnvelope() {
        description = "medium size envelope";
    }

    @Override
    String getSize() {
        return "30cm x 40cm";
    }
}
