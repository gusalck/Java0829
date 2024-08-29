package cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        cat c = new cat();
        c.setName("AiCat");
        c.setBreeds("Persian");
        c.setWeight(3);

        System.out.printf("이름 : %s\n", c.getName());
        System.out.printf("품종 : %s\n", c.getBreeds());
        System.out.printf("몸무게 : %.1f kg\n", c.getWeight());

        System.out.printf(c.getName()+"이 ");
        c.claw();

        System.out.printf(c.getName()+"이 ");
        c.meow();
    }
}