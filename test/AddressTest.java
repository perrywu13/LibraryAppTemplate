import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    private Address address;

    @BeforeEach
    public void setUp() {
        address = new Address();
    }
    @Test
    public void shouldHaveStreetField() {
        address.street = "123 Homer Way";
        assertEquals("123 Homer Way", address.street);
    }

    @Test
    public void shouldHaveCityField() {
        address.city = "Toronto";
        assertEquals("Toronto", address.city);
    }

    @Test
    public void shouldHaveProvinceField() {
        address.province = "Ontario";
        assertEquals("Ontario", address.province);
    }

    @Test
    public void shouldHavePostalCodeField() {
        address.postalCode = "L4G";
        assertEquals("L4G", address.postalCode);
    }

    @Test
    public void shouldHaveToStringMethod() {
        initializeFixture1();
        assertFalse(address.toString().contains("Address"), "Default toString() should be replaced.");
    }

    @Test
    public void toStringShouldContainStreet() {
        initializeFixture1();
        assertFieldInResult("street");
    }

    @Test
    public void toStringShouldContainCity() {
        initializeFixture1();
        assertFieldInResult("city");
    }

    @Test
    public void toStringShouldContainProvince() {
        initializeFixture1();
        assertFieldInResult("province");
    }

    @Test
    public void toStringShouldContainPostalCode() {
        initializeFixture1();
        assertFieldInResult("postalCode");
    }

    private void initializeFixture1() {
        address.street = "street";
        address.city = "city";
        address.province = "province";
        address.postalCode = "postalCode";
    }

    private void assertFieldInResult(String fieldName) {
        assertTrue(address.toString().contains(fieldName), "toString() should contain the " + fieldName);
    }
}
