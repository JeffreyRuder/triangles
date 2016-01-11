import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle Checker");
  }

  @Test
  public void triangleTestIsATriangle() {
    goTo("http://localhost:4567/");
    fill("#side1").with("3");
    fill("#side2").with("4");
    fill("#side3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is a valid triangle!");
  }

  @Test
  public void triangleTestIsATriangle_false() {
    goTo("http://localhost:4567/");
    fill("#side1").with("2");
    fill("#side2").with("2");
    fill("#side3").with("8");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is not a valid triangle");
  }

  @Test
  public void triangleTestIsEquilateral_true() {
    goTo("http://localhost:4567/");
    fill("#side1").with("4");
    fill("#side2").with("4");
    fill("#side3").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is equilateral");
  }

  @Test
  public void triangleTestIsIsosceles_true() {
    goTo("http://localhost:4567/");
    fill("#side1").with("2");
    fill("#side2").with("2");
    fill("#side3").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is isosceles");
  }

  @Test
  public void triangleTestIsScalene_true() {
    goTo("http://localhost:4567/");
    fill("#side1").with("3");
    fill("#side2").with("4");
    fill("#side3").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is scalene");
  }

  @Test
  public void triangleTestIsEquilateral_false() {
    goTo("http://localhost:4567/");
    fill("#side1").with("3");
    fill("#side2").with("4");
    fill("#side3").with("5");
    submit(".btn");
    String equilateral = "Your triangle is equilateral";
    assertThat(!(pageSource()).contains(equilateral));
  }

  @Test
  public void triangleTestIsIsosceles_false() {
    goTo("http://localhost:4567/");
    fill("#side1").with("3");
    fill("#side2").with("4");
    fill("#side3").with("5");
    submit(".btn");
    String isosceles = "Your triangle is isosceles";
    assertThat(!(pageSource()).contains(isosceles));
  }

  @Test
  public void triangleTestIsScalene_false() {
    goTo("http://localhost:4567/");
    fill("#side1").with("4");
    fill("#side2").with("4");
    fill("#side3").with("4");
    submit(".btn");
    String scalene = "Your triangle is scalene";
    assertThat(!(pageSource()).contains(scalene));
  }


}
