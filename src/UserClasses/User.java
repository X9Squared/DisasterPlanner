package UserClasses;

import ZipCore.ZipCode;

public interface User {
    public abstract ZipCode setLoc(int zip);

    public abstract int getAge();

    public abstract String getName();

    public abstract void setId(int newId);
}
