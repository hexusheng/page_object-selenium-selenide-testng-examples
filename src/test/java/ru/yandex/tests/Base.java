package ru.yandex.tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeClass;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Listeners;
import ru.yandex.pages.MailPage;
import ru.yandex.pages.MainPage;
import ru.yandex.pages.domain.User;
import com.automation.remarks.testng.VideoListener;


@Listeners({VideoListener.class})
public class Base {

    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://yandex.ru";


    }

    protected MailPage login(User user) {
        return new MainPage()
                .open()
                .loginAs(user);
    }
}
