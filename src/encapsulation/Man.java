package encapsulation;

public class Man {
    private int yearOfBirth;
    String name;
    private String town;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.trim().isEmpty()) {
            this.town = "'Информация не указана'";
        } else {
            this.town = town;
        }

    }

    String jobTitle;

    Man() {
        this.name = "'Информация не указана'";
        this.town = "'Информация не указана'";
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
            this.jobTitle = "'Информация не указана'";
        }
    }

    Man(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "'Информация не указана'";
        } else {
            this.name = name;
        }
        if (town == null || town.trim().isEmpty()) {
            this.town = "'Информация не указана'";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null || jobTitle.trim().equals("")) {
            this.jobTitle = "'Информация не указана'";
        } else {
            this.jobTitle = jobTitle;
        }
    }


    void printInfo() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ", родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }


}
