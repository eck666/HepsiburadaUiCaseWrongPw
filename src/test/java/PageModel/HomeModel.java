package PageModel;

public class HomeModel extends BaseModel {
    public void userVisitSite(String key){
        webDriver.get(key);
    }
}
