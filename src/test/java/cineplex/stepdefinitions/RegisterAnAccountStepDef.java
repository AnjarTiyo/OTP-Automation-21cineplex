package cineplex.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;

public class RegisterAnAccountStepDef {
    @Given("{actor} registering an account on 21cineplex.com")
    public void registeringAnAccountOnCineplexCom(Actor actor) {
        actor.wasAbleTo();
    }
}
