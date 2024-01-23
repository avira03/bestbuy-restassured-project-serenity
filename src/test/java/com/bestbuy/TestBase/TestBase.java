package com.bestbuy.TestBase;


import com.bestbuy.constants.Path;
import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay
 */
public class TestBase {



    @BeforeClass
    public static void init() {
        RestAssured.baseURI = PropertyReader.getInstance().getProperty("baseURI");
        RestAssured.port = Integer.parseInt(PropertyReader.getInstance().getProperty("port"));
//        RestAssured.basePath = Path.PRODUCTS;

    }

}
