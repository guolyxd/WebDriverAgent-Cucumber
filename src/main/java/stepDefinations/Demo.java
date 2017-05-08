package stepDefinations;

import com.google.gson.JsonObject;
import common.JWda;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.After;

/**
 * Created by lyguo on 07/05/2017.
 */
public class Demo {

    public static JWda Instance;

    @Before
    public void stepInit(){
            Instance = new JWda();
            Instance.cleanKeychain("com.apple.mobilesafari");
            Instance.openApp("7p","com.apple.mobilesafari");
    }

    @After
    public void closeBrowser(){
    //    Instance.CloseBrowser();
    }

    @Given("Open baidu from safari")
    public void Open_baidu_from_safari() throws Exception{
        JsonObject objAddress1 = Instance.findElementsByXpath("//XCUIElementTypeOther[@label='Address']");
        Instance.input(objAddress1.get("ELEMENT").getAsString(),"https://www.baidu.com");
        JsonObject objAddress2 = Instance.findElementsByClass("XCUIElementTypeButton","Go");
        Instance.tap(objAddress2.get("ELEMENT").getAsString());
    }
    @Then("Verify BAIDU_image")
    public void Verify_BAIDU_image() throws Exception{
        Instance.findElementsByClass("XCUIElementTypeImage","百度一下,你就知道");
    }



}
