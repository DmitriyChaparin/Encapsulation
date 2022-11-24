package encapsulation.transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final String color;
    private final String bodyType;
    private boolean isSummerRubber;
    private String transmission;
    private String number;
    private final int seatCount;
    private double enginePower;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int year, String color, String country, String bodyType, boolean isSummerRubber, String transmission, String number, int seatCount, double enginePower) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = validateYear(year);
        this.country = validateCountry(country);
        this.color = validateColor(color);
        this.bodyType = validateCarParameters(bodyType);
        this.isSummerRubber = isSummerRubber;
        this.transmission = validateTransmission(transmission);
        this.number = validateNumber(number);
        this.seatCount = validateSeatCount(seatCount);
        this.enginePower = validateEnginePower(enginePower);
    }

    public static int validateYear(int value) {
        return value < 1900 ? 2000 : value;
    }

    public static String validateCountry(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "Россия" : value;
    }

    public static String validateColor(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "белый" : value;
    }

    public static String validateTransmission(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "не указан" : value;

    }

    public static String validateNumber(String number) {
        if (Pattern.matches("[a-z][0-9]{3}[a-z]{2}[1-9]{3}", number)) {
            return number;
        }
        return "неверный номер";
    }

    public static double validateEnginePower(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static int validateSeatCount(int value) {
        return value <= 0 ? 4 : value;
    }

    public static String validateCarParameters(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "не указан " : value;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getNumber() {
        return number;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public void setNumber(String number) {
        this.number = validateNumber(number);
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = validateEnginePower(enginePower);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void switchRubber() {
        setSummerRubber(!this.isSummerRubber);
    }


    public class Key {
        private final Boolean remoteStart;
        private final Boolean keylessAccess;

        public Key(Boolean remoteStart, Boolean keylessAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keylessAccess = validateBoolean(keylessAccess);
        }

        public Boolean validateBoolean(Boolean value) {
            return value != null && value;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public class Insurance {
        private LocalDate duration;
        private double cost;
        private String number;


        public Insurance(LocalDate duration, double cost, String number) {
            this.duration = checkDuration(duration);
            this.cost = validateCost(cost);
            this.number = isValidateNumber(number) ? number : "Некорректный номер";
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "duration=" + duration +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }

        private boolean isValidateNumber(String number) {
            if (Pattern.matches("[a-zA-Zа-яА-Я0-9]{9}", number)) {
                return true;
            } else {
                System.out.println("Некорректный номер страховки");
                return false;
            }

        }

        public LocalDate checkDuration(LocalDate duration) {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("Страховка закончилась!!!");
                return LocalDate.now();
            } else {
                return duration;
            }

        }

        public double validateCost(double value) {
            return value <= 0 ? 1000 : value;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", isSummerRubber=" + isSummerRubber +
                ", transmission='" + transmission + '\'' +
                ", number='" + number + '\'' +
                ", seatCount=" + seatCount +
                ", enginePower=" + enginePower +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }
}

