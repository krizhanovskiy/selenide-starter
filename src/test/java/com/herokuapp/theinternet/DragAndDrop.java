package com.herokuapp.theinternet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.headless;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeAll
    static void setup() {
        startMaximized = true;
        headless = false;
    }

    @Test
    void CheckDragAndDrop() {
//        открыть страницу https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
//        drag and drop блока "b" на блок "a"
        $("[id=column-b]").dragAndDropTo("[id=column-a]");
//        проверяем что элементы поменялись местами
        $("[id=column-a]").shouldHave(text("B"));

    }
}