public class Computer {
    private Integer id;
    private String brand;
    private String model;
    private String graphicCard;
    private String processor;
    private Integer numberOfCores;
    private Integer numberOfGigabytesOfRAM;

    public static class Builder {
        private Integer id = null;
        private String brand = null;
        private String model = null;
        private String graphicCard = null;
        private String processor = null;
        private Integer numberOfCores = null;
        private Integer numberOfGigabytesOfRAM = null;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder graphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder numberOfCores(Integer numberOfCores) {
            this.numberOfCores = numberOfCores;
            return this;
        }

        public Builder numberOfGigabytesOfRAM(Integer numberOfGigabytesOfRAM) {
            this.numberOfGigabytesOfRAM = numberOfGigabytesOfRAM;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    private Computer(Builder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.model = builder.model;
        this.graphicCard = builder.graphicCard;
        this.processor = builder.processor;
        this.numberOfCores=builder.numberOfCores;
        this.numberOfGigabytesOfRAM = builder.numberOfGigabytesOfRAM;
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getProcessor() {
        return processor;
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public Integer getNumberOfGigabytesOfRAM() {
        return numberOfGigabytesOfRAM;
    }


}
