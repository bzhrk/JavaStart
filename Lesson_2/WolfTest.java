public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "One";
        wolfOne.age = 3;
        wolfOne.color = "grey";
        wolfOne.gender = "man";

        System.out.println("Name = " + wolfOne.name);
        System.out.println("Age = " + wolfOne.age);
        System.out.println("Color = " + wolfOne.color);
        System.out.println("Gender = " + wolfOne.gender);
        wolfOne.run();
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.hunt();
        wolfOne.move();
    }
}
