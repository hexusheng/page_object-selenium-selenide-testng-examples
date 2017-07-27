package ru.yandex.pages;

import com.codeborne.selenide.Selenide;
import ru.yandex.pages.domain.User;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;


public class MainPage {

    public MainPage open() {
        Selenide.open("https://www.yandex.ru");
        return this;
    }

    public MailPage loginAs(User user) {
        $(byName("login")).val(user.getName());
        $(byName("passwd")).val(user.getPassword());
        $(".button.auth__button.domik2__auth-button.button_theme_bordergray.button_size_m").click();
        return new MailPage();
    }


}
