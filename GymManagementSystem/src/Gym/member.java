public class member {
    private int id;
    private String name;
    private int age;
    private String membershipType;

    public member(int id, String name, int age, String membershipType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMembershipType() {
        return membershipType;
    }

    @Override
    public String toString() {
        return "Member ID: " + id + ", Name: " + name + ", Age: " + age + ", Membership: " + membershipType;
    }
}
