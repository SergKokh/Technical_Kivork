package TestKivork.API_Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static io.restassured.RestAssured.given;

public class CheckLocation {
    private final static String URL = "http://api.ipstack.com/";
    private final static String IP = "195.20.4.12?";
    private String KEY;
    private final static String FIELD = "=main";

    @BeforeMethod
    public void getUserKay() throws IOException {
        try (FileReader reader = new FileReader("UserKay.txt")) {
            String read = "";
            int readKey;
            while ((readKey = reader.read()) != -1) {
                read += (char) readKey;
            }
            KEY = "access_key=" + read + "&fields";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void checkLatitudeAndLongitude() throws IOException {
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
