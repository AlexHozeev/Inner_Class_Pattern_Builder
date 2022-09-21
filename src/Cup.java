public class Cup {

    private int size;
    private String color;
    private String brand;
    private int price;
    private String madeIn;

    public Cup(int size, String color, String brand, int price, String madeIn) {
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }

    public static CupBuilder builder() {
        return new CupBuilder();
    }

    public static class CupBuilder {
        private int size;
        private String color;
        private String brand;
        private int price;
        private String madeIn;

        public CupBuilder size(int size) {
            this.size = size;
            return this;
        }

        public CupBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CupBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CupBuilder price(int price) {
            this.price = price;
            return this;
        }

        public CupBuilder madeIn(String madeIn) {
            this.madeIn = madeIn;
            return this;
        }

        public Cup build() {
            return new Cup(size, color, brand, price, madeIn);
        }
    }
}
