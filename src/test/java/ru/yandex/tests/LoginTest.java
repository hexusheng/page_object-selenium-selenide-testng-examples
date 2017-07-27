package ru.yandex.tests;

import com.automation.remarks.video.annotations.Video;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.pages.MainPage;
import ru.yandex.pages.domain.User;

import static com.codeborne.selenide.Condition.text;

public class LoginTest extends Base {

    @Test
    @Video
    public void testCanLoginAsValidUser() {
        User roma = new User("utopia.cosmica@yandex.ru",
                "testfortest");
        login(roma).newMassageButton.shouldHave(text("Написать"));
    }
}
