package encapsulation;

public class Main {
    public static void main(String[] args) {
        Man maksim = new Man("   ", "Минск", -1998, " ");
        Man anna = new Man("Аня", "Москва", 1993, "методист образовательных программ");
        Man katia = new Man("Катя", "Калининград", 1992, "продакт-менеджер");
        Man artem = new Man("Артём", "Москва", 1995, "директор по развитию бизнеса");
        Man vladimir = new Man("Владимир", "Казань", 21, "сейчас нигде не работает");
        Man denis = new Man();
        denis.printInfo();
        maksim.printInfo();
        katia.printInfo();
        artem.printInfo();
        anna.printInfo();
        vladimir.printInfo();
    }
}



