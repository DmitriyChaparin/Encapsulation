package encapsulation.transport;

import java.time.LocalDate;

public class testCar {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 2015, "желтый", "Россия", "Michlen",false,"механическая","a123aaa123",5,1.7);
        Car audiA8 = new Car("Audi", "A8", 2020, "черный", "Германия", "Nokian",true,"автоматическая","o234o132",5,3.0);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "черный", "Германия", "Pireli",false,"автоматическая","z666zz166",5,3.0);
        Car kiaSportage = new Car("KIA", "Sportage 4-го поколения", 2018, "красный", "Южная Корея", "Ykohama",true,"автоматическая","k444kk444",5,1.8);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "оранжевый", "Южная Корея", "Кама",false, "механическая","m777mm777",5,1.6);
    Car.Insurance ladaGrantaIncurance = ladaGranta.new Insurance(LocalDate.of(2022,12,25), -300,"9876543213" );
    Car.Key ladaGrantaKey = ladaGranta.new Key(true,true);
    ladaGranta.setKey(ladaGrantaKey);
    ladaGranta.setInsurance(ladaGrantaIncurance);
        System.out.println(ladaGranta);
    }
}
