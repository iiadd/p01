import java.lang.*;
public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("George", 2);
        Dog d2 = new Dog("Ken", 1000-7);
        Dog d3 = new Dog("Bobs");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
