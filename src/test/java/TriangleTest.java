import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_setsSide1_3() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(3, testTriangle.getSide1());
  }

  @Test
  public void newTriangle_setsSide2_4() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(4, testTriangle.getSide2());
  }

  @Test
  public void newTriangle_setsSide3_5() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(5, testTriangle.getSide3());
  }

  @Test
  public void isATriangle_knowsIfTriangleNotValid_false() {
    Triangle testTriangle = new Triangle (2, 2, 8);
    assertEquals(false, testTriangle.isATriangle());
  }

  @Test
  public void isATriangle_knowsIfTriangleIsValid_true() {
    Triangle testTriangle = new Triangle (3, 4, 5);
    assertEquals(true, testTriangle.isATriangle());
  }

}