public class JaegerTest {

    public static void main(String[] args) {

        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModel("Mark-4");
        crimsonTyphoon.setStatus("Destroyed");
        crimsonTyphoon.setOrigin("China");

        crimsonTyphoon.setHeight(76.2);
        crimsonTyphoon.setWeight(1.722);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(6);

        Jaeger guardianBravo = new Jaeger("Mark-6", "Active", "Australian",
                73.21, 1.975, 7, 9, 8);

        guardianBravo.run();
        guardianBravo.scan();
        crimsonTyphoon.reloadGun();

    }
}
