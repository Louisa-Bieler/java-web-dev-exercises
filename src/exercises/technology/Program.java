package exercises.technology;

public class Program {

    public static void main(String[] args){
        Computer dellTower = new Computer("Windows11", "12th Gen Intel® Core™ i5-12400", "Intel® UHD-Grafikkarte 730", 512000);

        Laptop macBookPro = new Laptop("OSX", "M1", "Whatever", 124, 134, 124, 16, 15);

        Mobile googlePixel5a = new Mobile("android", "inteldings", "öaglkj", 23, 315, 132, 12, 5, false);

        System.out.println(googlePixel5a.getOs() == dellTower.getOs());
    }

}
