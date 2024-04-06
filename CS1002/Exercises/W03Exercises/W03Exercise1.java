public class W03Exercise1 {
    public static void main(String[] args) {
        Mug standard = new Mug("Standard", 90, 80);
        Mug small = new Mug("Small", 80, 70);
        Mug big = new Mug("Large", 10000, 10000);
        standard.setHeight(10000);
        small.setWidth(2);
        big.setHeight(304825837);
        standard.print();
        small.print();
        big.print();
    }
}