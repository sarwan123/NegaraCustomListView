package id.ac.poliban.mi.sarwan;

public class Country {
    private String flag;
    private String countryName;
    private String getCountryDetail;

    public Country(String flag, String countryName, String getCountryDetail) {
        this.flag = flag;
        this.countryName = countryName;
        this.getCountryDetail = getCountryDetail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getGetCountryDetail() {
        return getCountryDetail;
    }

    public void setGetCountryDetail(String getCountryDetail) {
        this.getCountryDetail = getCountryDetail;
    }

    @Override
    public String toString() {
        return String.format("%30s", getCountryName());
    }
}
