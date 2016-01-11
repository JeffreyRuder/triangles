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
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(false, testTriangle.isAValidTriangle());
  }

  @Test
  public void isATriangle_knowsIfTriangleIsValid_true() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(true, testTriangle.isAValidTriangle());
  }

  @Test
  public void isEquilateral_knowsIfTriangleEquilateral_true() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isEquilateral_knowsIfTriangleEquilateral_false() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(false, testTriangle.isEquilateral());
  }

  @Test
  public void isScalene_knowsIfTriangleScalene_true() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isScalene_knowsIfTriangleScalene_false() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals(false, testTriangle.isScalene());
  }

  @Test
  public void isIsosceles_knowsIfTriangleIsosceles_true() {
    Triangle testTriangle = new Triangle(2, 2, 4);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isIsosceles_knowsIfTriangleIsosceles_false() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals(false, testTriangle.isIsosceles());
  }

  @Test
  public void isIsosceles_knowsIfScaleneTriangleIsosceles_false() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(false, testTriangle.isIsosceles());
  }


}
