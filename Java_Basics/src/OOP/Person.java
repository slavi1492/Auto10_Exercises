package OOP;

public class Person {

    private String name;
    private String sex;
    private String language;
    private String job;
    private String nationality;
    private String country;
    private String EGN;
    private String dateOfBirth;
    private int age;

    public Person(String name, String sex, String language, String job, String nationality, String country, String EGN) {
        checkEGN(EGN);


        this.name = name;
        this.sex = sex;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.country = country;
        this.EGN = EGN;
    }

    public void checkEGN(String EGN) {
        int egnLenght = EGN.length();
        if (egnLenght != 10 || !EGN.matches("\\d+")) {
            throw new RuntimeException("Not a valid EGN");
        }
    }
    }