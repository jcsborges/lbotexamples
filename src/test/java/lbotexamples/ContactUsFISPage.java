
package lbotexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactUsFISPage extends BasePage {

    public void navigateTo() {
        getDriver().navigate().to(getURL());  
    }

    @Override
    public String getURL() { 
        return "https://www.fisglobal.com/contact-us";
    }
    
    

    private WebElement _navsearchtextboxInput;

    public WebElement getNavsearchtextboxInput() {
        if(_navsearchtextboxInput == null)
            _navsearchtextboxInput = getDriver().findElement(By.id("nav-searchtextbox"));
            
        return _navsearchtextboxInput;
    }



    private WebElement _FirstNameInput;

    public WebElement getFirstnameInput() {
        if(_FirstNameInput == null)
            _FirstNameInput = getDriver().findElement(By.id("FirstName"));
            
        return _FirstNameInput;
    }



    private WebElement _LastNameInput;

    public WebElement getLastnameInput() {
        if(_LastNameInput == null)
            _LastNameInput = getDriver().findElement(By.id("LastName"));
            
        return _LastNameInput;
    }



    private WebElement _EmailInput;

    public WebElement getEmailInput() {
        if(_EmailInput == null)
            _EmailInput = getDriver().findElement(By.id("Email"));
            
        return _EmailInput;
    }



    private WebElement _CompanyInput;

    public WebElement getCompanyInput() {
        if(_CompanyInput == null)
            _CompanyInput = getDriver().findElement(By.id("Company"));
            
        return _CompanyInput;
    }



    private WebElement _TitleInput;

    public WebElement getTitleInput() {
        if(_TitleInput == null)
            _TitleInput = getDriver().findElement(By.id("Title"));
            
        return _TitleInput;
    }



    private WebElement _PhoneInput;

    public WebElement getPhoneInput() {
        if(_PhoneInput == null)
            _PhoneInput = getDriver().findElement(By.id("Phone"));
            
        return _PhoneInput;
    }



    private WebElement _AddressInput;

    public WebElement getAddressInput() {
        if(_AddressInput == null)
            _AddressInput = getDriver().findElement(By.id("Address"));
            
        return _AddressInput;
    }



    private WebElement _MicrosoftAddress2Input;

    public WebElement getMicrosoftaddress2Input() {
        if(_MicrosoftAddress2Input == null)
            _MicrosoftAddress2Input = getDriver().findElement(By.id("MicrosoftAddress2"));
            
        return _MicrosoftAddress2Input;
    }



    private WebElement _CityInput;

    public WebElement getCityInput() {
        if(_CityInput == null)
            _CityInput = getDriver().findElement(By.id("City"));
            
        return _CityInput;
    }



    private WebElement _PostalCodeInput;

    public WebElement getPostalcodeInput() {
        if(_PostalCodeInput == null)
            _PostalCodeInput = getDriver().findElement(By.id("PostalCode"));
            
        return _PostalCodeInput;
    }



    private WebElement _UnsubscribedInput;

    public WebElement getUnsubscribedInput() {
        if(_UnsubscribedInput == null)
            _UnsubscribedInput = getDriver().findElement(By.id("Unsubscribed"));
            
        return _UnsubscribedInput;
    }



    private WebElement _formGeneralCommentsInput;

    public WebElement getFormgeneralcommentsInput() {
        if(_formGeneralCommentsInput == null)
            _formGeneralCommentsInput = getDriver().findElement(By.id("formGeneralComments"));
            
        return _formGeneralCommentsInput;
    }



    private WebElement _formInquiryTypeInput;

    public WebElement getForminquirytypeInput() {
        if(_formInquiryTypeInput == null)
            _formInquiryTypeInput = getDriver().findElement(By.id("formInquiryType"));
            
        return _formInquiryTypeInput;
    }



    private WebElement _howtheuserheardaboutusInput;

    public WebElement getHowtheuserheardaboutusInput() {
        if(_howtheuserheardaboutusInput == null)
            _howtheuserheardaboutusInput = getDriver().findElement(By.id("howtheuserheardaboutus"));
            
        return _howtheuserheardaboutusInput;
    }



    private WebElement _CountryInput;

    public WebElement getCountryInput() {
        if(_CountryInput == null)
            _CountryInput = getDriver().findElement(By.id("Country"));
            
        return _CountryInput;
    }


    
    
}

                  