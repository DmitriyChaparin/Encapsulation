package encapsulation.flower;

public class testFlower {
    public static void main(String[] args) {
        Flower[] bouquet = new Flower[]{
                new Flower("Роза", "", "Голандия", 35.5900, 0),
                new Flower("Пион", "красный", "Англия", 69.9, 1),
                new Flower("Гипсофила", "", "Турция", 19.5, 10),
                new Flower("Хризантема", "синий", "", 15, 5)
        };
        getBouquetInformation(bouquet);


    }

    private static double calculateCost(Flower[] flowers) {
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getCost();
        }
        int pay = 10; //upper
        sum = sum + (sum * pay / 100);
        return sum;
    }

    private static int getMinLifeSpan(Flower[] flowers) {
        int min = flowers[0].getLifeSpan();
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }            return min;

    }

    private static void getBouquetInformation(Flower[] flowers) {
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
        System.out.println(calculateCost(flowers));
        System.out.println(getMinLifeSpan(flowers));
    }
}
