public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Bentuk b = new Bentuk("Pink");
        b.printInfo();

        BujurSangkar bs = new BujurSangkar(5, "Jingga");
        bs.printInfo();
       
        // Exercise 2
        Lingkaran l = new Lingkaran(7, "Kuning");
        l.printInfo();
       
        // Exercise 3
        Silinder s = new Silinder(10, 7, "Hitam");
        s.printInfo();
    }
}