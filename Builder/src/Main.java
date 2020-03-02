public class Main {

    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                .id(1)
                .brand("Lenovo")
                .model("y50-70")
                .graphicCard("GeForce 1080Ti")
                .processor("Intel Core i7-4720HQ")
                .numberOfCores(4)
                .numberOfGigabytesOfRAM(8)
                .build();
        System.out.println(c.getId());
        System.out.println(c.getBrand());
        System.out.println(c.getModel());
        System.out.println(c.getGraphicCard());
        System.out.println(c.getProcessor());
        System.out.println(c.getNumberOfCores());
        System.out.println(c.getNumberOfGigabytesOfRAM());

    }
}
