package practiki.prac_11_12;

public class Person {
    private String name="Name", fam="Fam", ot="Ot";

    public Person(String fam, String name, String ot) {
        this.fam = fam;
        this.name = name;
        this.ot = ot;
    }

    public String getFIO() {
        return String.format("%s %s %s", fam, name, ot);
    }
}
