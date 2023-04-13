package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.actions;

public class DragNDropSelenideTest {
  @Test
  public void dragAndDropTest() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo($("#column-b"));
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
  }

  @Test
  public void DragAndDropActions() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
    // у меня тест не стабилен, приклеивается к курсору мыши.
  }
}
