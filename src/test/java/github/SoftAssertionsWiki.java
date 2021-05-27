package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsWiki {

    @BeforeAll
    static void setup() {
        startMaximized = true;
        headless = false;
    }

    @Test
    void CheckOnSoftAssertionsWiki() {
//        открыть страницу selenide
        open("https://github.com/selenide/selenide");
//        открыть таб wiki
        $("[data-tab-item=i4wiki-tab]").click();
//        проверить что есть SoftAssertions
        $("[class=markdown-body]").shouldHave(text("Soft assertions"));
//        открываем страницу Soft assertions
        $("[class=markdown-body]").$(byText("Soft assertions")).click();
//        проверка наличия примера кода для JUnit5
        $("ol[start='3']").shouldHave(text("Using JUnit5 extend test class:"));


    }

}
