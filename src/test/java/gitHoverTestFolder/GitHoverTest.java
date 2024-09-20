package gitHoverTestFolder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHoverTest {

    @BeforeAll
    static void setup() {
        browserSize = "1920x1080";
        baseUrl = "https://github.com";
    }

    @Test
    void hoverSolutionsOnGitTest() {
        open(baseUrl);
        $(".HeaderMenu-nav").$$("ul li button").findBy(text("Solutions")).hover();
        $("#solutions-by-size-heading").parent().$("a").shouldHave(text("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }

}
