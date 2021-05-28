import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {
//    @BeforeAll
//   static void setup(){
//   Configuration.startMaximized=true;
//    }


    @Test
    public void githubTest() {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $(withText("Show 1 more page")).click();
        $(byText("SoftAssertions")).click();
        //       sleep(4000);
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
    @Test
    public  void theInternet() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        //just smile
//        sleep(4000);
    }
}