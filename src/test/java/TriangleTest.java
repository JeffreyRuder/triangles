import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_setsSides1() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(3, testTriangle.getSide1());
  }

  @Test
  public void newTriangle_setsSides2() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(4, testTriangle.getSide2());
  }

  @Test
  public void newTriangle_setsSides3() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(5, testTriangle.getSide3());
  }

}
