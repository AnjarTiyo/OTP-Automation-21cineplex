package cineplex.actions;

import cineplex.pages.CineplexRegisterPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable m21CineplexComRegisterPage(){
        return Task.where("{0} opens the 21cineplex.com Register Page",
                Open.browserOn().the(CineplexRegisterPage.class));
    }
}
