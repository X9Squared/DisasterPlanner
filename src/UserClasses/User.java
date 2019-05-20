package UserClasses;

public interface User {
    public abstract int[] getLocation(int zip);
    public abstract int getAge();
    public abstract String getName();
    public abstract void setId(int newId);
}
