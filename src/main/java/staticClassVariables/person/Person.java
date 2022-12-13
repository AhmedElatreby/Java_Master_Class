package staticClassVariables.person;

public class Person {
    private String name;
    private String eyeColour;

    public static int numberOfPeople;

    public Person(String name, String colour) {
        this.name = name;
        this.eyeColour = colour;
        numberOfPeople++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public static void setNumberOfPeople(int numberOfPeople) {
        Person.numberOfPeople = numberOfPeople;
    }
}
