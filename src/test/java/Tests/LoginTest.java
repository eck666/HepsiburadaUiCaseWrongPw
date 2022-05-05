package Tests;

import PageModel.LoginModel;
import com.github.javaparser.utils.Log;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class LoginTest {
    LoginModel loginModel = new LoginModel();


    @Step("Kullanıcı <key> tabına gider.")
    public void clickLogin(String xxx){
        loginModel.clickLogin(xxx);
    }
    @Step("Kullanıcı Giriş Yap'a tıklar.")
    public void clickLogin2(){
        loginModel.clickLogin2();
    }
    @Step("Email alanına <key> yazılır.")
    public void setEmail(String email) {
        loginModel.setTextEmail(email);
    }
    @Step("Kullanıcı E-Mail yazdıktan sonra Giriş Yap'a tıklar.")
    public void clickSubmit() {
        loginModel.clickSubmitBtn();
    }
    @Step("Kullanıcı şifre alanına <key> yazılır.")
    public void setPassword(String password) {
        loginModel.setTextPassword(password);
    }
    @Step("Kullanıcı şifre yazdıktan sonra Giriş Yap'a tıklar.")
    public void clickSubmitPw() {
        loginModel.clickSubmitBtn();
    }
    @Step("Kullanıcı <key> yazısı aldığını görür.")
    public void checkErrorMessage(String type) {
        Assert.assertTrue("Login fail case failed", loginModel.checkErrorMessage(type));
    }

}
