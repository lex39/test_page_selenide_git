package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideSearch {
  @Test
  void shouldFindSelenideRepositoryPage() {
     open("https://github.com/");
     $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
     $(".repo-list li").$("a").click();
     $("[class='url fn']").should(text("selenide"));
     $("[itemprop='name']").should(text("selenide"));
  }

}
