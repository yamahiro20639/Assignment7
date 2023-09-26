package restapi.Assignment7;

public class PersonNameRequest {
    private String givenName;
    private String familyName;

    public PersonNameRequest(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }
}
