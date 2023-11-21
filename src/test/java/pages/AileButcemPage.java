package pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage() {
        // AppiumFieldDecorator ile PageFactory'nin başlatılması
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text=\"E-mail Adresi\"]")
    public MobileElement emailField;

    @FindBy(xpath = "//*[@text=\"Şifre\"]")
    public MobileElement passwordField;

    @FindBy (xpath = "//android.widget.TextView[@resource-id='text1' and @text='Başarılı']")
    public MobileElement toastMessage;




}
