package StepImp;

import Pom.Beymen.BeymenFirst;
import Pom.Url.GetUrl;
import Pom.base.Base;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.util.HashSet;


public class StepImplementation extends Base {

    GetUrl getUrl=new GetUrl();
    BeymenFirst beymenFirst=new BeymenFirst();

    @Step("Navigate to Browser")
    public void implementation1() {

        driverChromeMethod();
    }

    @Step("Navigate to Beymen")
    public void implementation2() {

        getUrl.url(getDriver());
    }

    @Step("Click the search button")
    public void implementation4() throws InterruptedException {
        beymenFirst.genderButton(getDriver());
        beymenFirst.searchButton(getDriver());
    }

    @Step("Type pantolon in the search button and search Click")
    public void implementation5() {
        beymenFirst.searchWrite(getDriver());
        beymenFirst.searchWrite(getDriver());
    }

    @Step("Click on the Filter button")
    public void implementation6() {

        beymenFirst.filterClick(getDriver());
    }

    @Step("Click on the product type")
    public void implementation7() {

        beymenFirst.productTypeClick(getDriver());
    }

    @Step("Pants are selected")
    public void implementation8() {
    beymenFirst.chechkboxPants(getDriver());
    beymenFirst.filterApplyClick(getDriver());
    }

    @Step("Product is selected")
    public void implementation10() {
    beymenFirst.productSelect(getDriver());
    }

}
