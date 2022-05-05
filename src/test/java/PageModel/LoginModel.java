package PageModel;

import org.openqa.selenium.By;

public class LoginModel extends BaseModel {
    public static By loginClick = By.xpath("//*[@id='myAccount']");
    public static By clickLogin2 = By.xpath("//*[@id='login']");
    public static By email = By.id("txtUserName");
    public static By submitButton = By.cssSelector("[type='submit']");
    public static By password = By.className("hb-AxiLy");
    public static By errorBoxMail = By.className("hb-fznKot");
    public static By errorBoxPw = By.className("hb-fzokND");
    public void clickLogin(String xxx){
        clickElement(loginClick);
    }
    public void clickLogin2(){
        clickElement(clickLogin2);
    }
    public void setTextEmail(String emailText) {
        waitSeconds(1);
        sendKeys(email, emailText);
    }
    public void clickSubmitBtn() {
        waitSeconds(1);
        clickElement(submitButton);
    }
    public void setTextPassword(String passwordText) {
        waitSeconds(3);
        sendKeys(password, passwordText);
    }
    public boolean checkErrorMessage(String type) {
        switch (type) {
            case "E-Mail Hatalı":
                return getText(errorBoxMail).equals("E-posta adresi eksik veya hatalı.");
            case "Şifre Hatalı":
                return getText(errorBoxPw).equals("Girdiğiniz şifre eksik veya hatalı.");
        }
        return false;
    }
}
