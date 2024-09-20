import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;

public class GitHoverTest {

    @BeforeAll
    static void setup() {
        browserSize = "1920x1080";
        baseUrl = "https://github.com";
    }

    @Test
    void hoverSolutionsOnGit() {
        open(baseUrl);

    }

}
