import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("html").shouldHave(text("Об этой странице"));
    }
    @Test
    void successfulSearchTest1() {
        open("https://www.duckduckgo.com/");
        $("[name=q]").setValue("Djokovic").pressEnter();
        $("html").shouldHave(text("Novak Djokovic - Wikipedia"));
    }
    @Test
    void successfulSearchTest2() {
        open("https://www.ya.ru/");
        $("[name=text]").setValue("Federer").pressEnter();
        $("html").shouldHave(text("Федерер, Роджер"));
    }
}
