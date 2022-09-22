package TestKivork;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static io.restassured.RestAssured.given;

public class CheckLocation {
    private final static String URL = "http://api.ipstack.com/";
    private final static String IP = "195.20.4.12?";
    private final static String KEY = "access_key=7d458b8eae649b186239164406aa452c&fields";
    private final static String FIELD = "=main";

    @Test
    public void checkLatitudeAndLongitude() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        double realLatitude = 50.51;
        double realLongitude = 30.79;
        LocationData locationData =
                given()
                        .when()
                        .get(IP + KEY + FIELD)
                        .then()
                        .extract().as(LocationData.class);

        double latitude = BigDecimal.valueOf(locationData.getLatitude()).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        double longitude = BigDecimal.valueOf(locationData.getLongitude()).setScale(2, RoundingMode.HALF_EVEN).doubleValue();

        Assert.assertEquals(latitude, realLatitude);
        Assert.assertEquals(longitude, realLongitude);
    }
}
