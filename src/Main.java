public class Main {
    public static void main(String[] args) {

        int amount = 13_676;
        int bonusMilePrice = 20;

        int bonus = amount / bonusMilePrice;

        System.out.println("количество начисленных миль: " + bonus);

    }
}