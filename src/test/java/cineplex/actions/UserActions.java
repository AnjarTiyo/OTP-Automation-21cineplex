package cineplex.actions;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class UserActions {

    WebDriver driver = getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @Step("User wait element {} visible")
    public void waiting(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    @Step("User click button {}")
    public void clickOn(Actor actor, By element){
        waiting(element);
        driver.findElement(element).click();
    }

    @Step("User typed {} to element {}")
    public void typeTextTo(String text, By element){
        waiting(element);
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }
}
