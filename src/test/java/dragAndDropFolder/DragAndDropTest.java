package dragAndDropFolder;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {

    @BeforeAll
    static void setup() {
        browserSize = "1920x1080";
        baseUrl = "https://the-internet.herokuapp.com/";
    }

    @Test
    void dragAndDropTest() {
        open("/drag_and_drop");
        Actions actions = new Actions(Selenide.webdriver().object());
        actions.dragAndDrop($("#column-a"), $("#column-b")).perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

}