package encapsulation.flower;

public class Flower {
    private String name;

    private String flowerColor;
    private String country;
    private double cost;

    private int lifeSpan;
//    ...String formattedDouble = new DecimalFormat("#0.00").format(getCost());

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = validateCountry(country);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = validateCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }


    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {

        this.name = name;
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        this.country = validateCountry(country);
        this.cost = validateCost(cost);
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    public static String validateCountry(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "Россия" : value;
    }

    public static double validateCost(double value) {
        return value <= 0 ? 1 : value;
    }

    public   void printFlowerInfo() {
        String info;
        info = "Цветок - %s, Цвет - %s, Страна -  %s, Цена - %.2f Время стояния - %d";
        System.out.println(String.format(info, name, flowerColor, country, cost, lifeSpan));

    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost= " + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}



