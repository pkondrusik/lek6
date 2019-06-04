public class Main {

    public static void main(String[] args) {

        Benzynka jakiMotor = new Benzynka();
        Osobowy auto = new Osobowy("audi", "a4", "B0 BEK", "kosc sloniowa", 10000, 10, jakiMotor.getJaki(), 50, 180000, 2000, 5);
        System.out.println(auto.info());
        auto.jedz(100);
        System.out.println(auto.info());
        auto.tankuj(15);
        System.out.println(auto.info());

        Dizelek jakiMotor1 = new Dizelek();
        Dostawczy bus = new Dostawczy("merol", "sprinter", "PO COTO", "czern typu kongo", 19000, 20, jakiMotor1.getJaki(), 50, 990000, 3000, 3);
        System.out.println(bus.info());
        bus.jedz(150);
        bus.tankuj(20);
        System.out.println(bus.info());


    }
}
