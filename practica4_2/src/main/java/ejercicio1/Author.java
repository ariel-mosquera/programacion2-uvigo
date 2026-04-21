package ejercicio1;

public class Author {
    private final String orcid;
    private final String name;
    private final String secondNames;
    private final String institution;

    public Author(String orcid, String name, String secondNames, String institution) {
        this.orcid = orcid;
        this.name = name;
        this.secondNames = secondNames;
        this.institution = institution;
    }

    public String getOrcid() {
        return orcid;
    }

    public String getName() {
        return name;
    }

    public String getSecondNames() {
        return secondNames;
    }

    public String getInstitution() {
        return institution;
    }

}
