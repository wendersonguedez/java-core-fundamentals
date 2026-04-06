package step01_syntax_and_types;

public class Main {
    public static void main(String[] args) {
        String name = "Wenderson G.";
        int age = 24;
        double salary = 4500.00;
        double height = 1.90;
        boolean isTall = true;

        String personIsTall = isTall ? "is tall" : "not is tall";

        System.out.println("person name is " + name + " and he is " + age + " years old" + " and your salary is R$" + salary);
    }
}
