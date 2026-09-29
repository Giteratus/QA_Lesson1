package test.java;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://github.com/search");
        $("[aria-label='Search GitHub']").setValue("qa.guru").pressEnter();
        $("[data-testid='results-list']").shouldHave(text("QA.GURU"));
    }
}