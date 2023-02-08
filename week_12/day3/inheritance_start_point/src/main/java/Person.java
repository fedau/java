public class Person {

    private String name;
    private String cohort;
    private String talk;

    public Person(String name, String cohort){
        this.name = name;
        this.cohort = cohort;
    }

    public String getName() {
        return this.name;
    }

    public String getCohort() {
        return this.cohort;
    }

    public void setName(String tony) {
        this.name = tony;
    }

    public void setCohort(String e19) {
        this.cohort = e19;
    }

    public String talk(String java) {
        this.talk = java;
        return "I love " + this.talk ;
    }
}
