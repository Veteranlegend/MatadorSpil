public abstract class field {
    private String name;
    private String description;
    private int number;

    public field(String name, String description, int number) {
        this.name = name;
        this.description = description;
        this.number = number;
    }

    public String Getname() {
        return name;
    }

    public String Getdescription() {
        return description;
    }

    public int Getnumber() {
        return number;
}
}
