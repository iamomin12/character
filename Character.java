
public class Character {
    private String name;
    private String hairColor;
    private String eyeColor;
    private boolean isMan;
    private double height; //this is in inches
    private double weight; //this is in pounds

    public Character() {
        //default constructor;
    }

    public Character(String name, String hairColor, String eyeColor, boolean isMan, double height, double weight) {
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.isMan = isMan;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        double bmi = (703.0d) * (weight/(Math.pow(height, 2)));
        String heShe = isMan ? "He" : "She";
        String characterBio = name + " has " + hairColor + " hair color and " + eyeColor + " eye color. " + heShe +
                " has a BMI of " + bmi + ".";
        return characterBio;
    }
}
