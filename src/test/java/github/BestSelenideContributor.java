package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class BestSelenideContributor {

  @Test
  void andreiSoltsevShouldBeFirstContributor() {
    open("https://github.com/selenide/selenide");
    $(".BorderGrid").$(byText("Contributors"))
            .closest("div").$("ul li").hover();
    $$(".Popover-message").findBy(visible).shouldBe(text("Andrei Solntsev"));
  }


}
