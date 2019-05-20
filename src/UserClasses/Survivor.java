package UserClasses;

public class Survivor implements User{
    private int zip;
    private String name;
    private int id;
    private int[] location;
    private int age;
    private boolean satisfied;
    private String need;
    private String medical;

    public Survivor() {
        zip = 92130;
        name = "Tim";
        id = 0000;
        location = new int[]{500,500};
        age = 25;
        satisfied = false;
        need = "Just a hug";
        medical = "Requires hug treatment";
    }

    public Survivor(int z, String n, int i, int[] loc, int age, boolean s, String req, String med) {
        zip = z;
        name = n;
        id = i;
        location = loc;
        this.age = age;
        satisfied = s;
        need = req;
        medical = med;
    }


    @Override
    public int[] getLocation(int zip) {

    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setId(int newId) {
        this.id = newId;
    }
}
