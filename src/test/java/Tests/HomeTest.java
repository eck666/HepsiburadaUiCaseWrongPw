package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;

public class HomeTest {
    HomeModel homeModel = new HomeModel();

    @Step("Kullanıcı <key> sitesini ziyaret eder")
    public void userVisitSite(String key){
        homeModel.userVisitSite(key);
    }
}
