public class trainer {
    private int id;
    private String name;
    private String specialty;

    public trainer(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Trainer ID: " + id + ", Name: " + name + ", Specialty: " + specialty;
    }
}
