package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.actions;

public class FindJUnitPageOrSelenidePageGithub {

  @Test
  void JUnitPageShouldBeSelenideGitPage() {
    // Откройте страницу Selenide в Github
    open("https://github.com/selenide/selenide");
    // Перейдите в раздел Wiki проекта
    $("a[href*='wiki']").click();
    //Раскрыть список скрытых пунктов
    $("[class='Box-row wiki-more-pages-link']").$("button").click();
    // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
    $("a[href*='SoftAssertions']").should(text("SoftAssertions"));
    // Откройте страницу SoftAssertions
    $("a[href*='SoftAssertions']").click();
    // Проверьте что внутри есть пример кода для JUnit5
    $("#wiki-body").should(text("@ExtendWith"));
  }
}
