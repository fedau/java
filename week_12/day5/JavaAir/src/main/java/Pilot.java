public class Pilot {

    private String name;

    Rank rank;

    private String licenseNum;

    public Pilot(String name, Rank rank, String licenseNum) {
        this.name = name;
        this.rank = rank;
        this.licenseNum = licenseNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String fly() {
        return "I am flying";
    }
}
