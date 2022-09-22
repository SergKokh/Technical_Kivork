package TestKivork;

import java.util.Objects;

public class LocationData {
    private String ip;
    private String type;
    private String continent_code;
    private String continent_name;
    private String country_code;
    private String country_name;
    private String region_code;
    private String region_name;
    private String city;
    private String zip;
    private double latitude;
    private double longitude;

    public LocationData(){
        super();
    }

    public LocationData(String ip, String type, String continent_code, String continent_name,
                        String country_code, String country_name, String region_code, String region_name,
                        String city, String zip, double latitude, double longitude) {
        this.ip = ip;
        this.type = type;
        this.continent_code = continent_code;
        this.continent_name = continent_name;
        this.country_code = country_code;
        this.country_name = country_name;
        this.region_code = region_code;
        this.region_name = region_name;
        this.city = city;
        this.zip = zip;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getIp() {
        return ip;
    }

    public String getType() {
        return type;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getRegion_code() {
        return region_code;
    }

    public String getRegion_name() {
        return region_name;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationData that = (LocationData) o;
        return Double.compare(that.latitude, latitude) == 0 && Double.compare(that.longitude, longitude) == 0 && Objects.equals(ip, that.ip) && Objects.equals(type, that.type) && Objects.equals(continent_code, that.continent_code) && Objects.equals(continent_name, that.continent_name) && Objects.equals(country_code, that.country_code) && Objects.equals(country_name, that.country_name) && Objects.equals(region_code, that.region_code) && Objects.equals(region_name, that.region_name) && Objects.equals(city, that.city) && Objects.equals(zip, that.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, type, continent_code, continent_name, country_code, country_name, region_code, region_name, city, zip, latitude, longitude);
    }

    @Override
    public String toString() {
        return "LocationData{" +
                "ip='" + ip + '\'' +
                ", type='" + type + '\'' +
                ", continent_code='" + continent_code + '\'' +
                ", continent_name='" + continent_name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", country_name='" + country_name + '\'' +
                ", region_code='" + region_code + '\'' +
                ", region_name='" + region_name + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
