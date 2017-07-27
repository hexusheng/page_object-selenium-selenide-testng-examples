package ru.yandex.pages.component;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.SelenideElementListIterator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Mail {

    public ElementsCollection findAllMailBySender = $$(".mail-MessageSnippet-Item_sender > span");


}
