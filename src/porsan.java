public class porsan {
    private String name;

    public porsan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "porsan{" +
                "name='" + name + '\'' +
                '}';
    }
}
