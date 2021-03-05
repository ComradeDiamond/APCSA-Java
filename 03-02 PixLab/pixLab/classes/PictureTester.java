/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.zeroRed();
    beach.zeroGreen();
    beach.explore();
  }

  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.grayScale();
    beach.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture bug = new Picture("caterpillar.jpg");
    bug.mirrorHorizontal();
    bug.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture bug = new Picture("caterpillar.jpg");
    bug.mirrorHorizontalBotToTop();
    bug.explore();
  }

  public static void testMirrorDiagonal()
  {
    Picture bug = new Picture("beach.jpg");
    bug.mirrorDiagonal();
    bug.explore();
  }

  public static void testFixUnderwater()
  {
    Picture fish = new Picture("water.jpg");
    fish.fixUnderwater();
    fish.explore();
  }

  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.mirrorGull();
    gull.explore();
  }

  public static void testLimitCopy()
  {
    Picture beach = new Picture("beach.jpg");
    beach.copy(beach, 0, 200, 0, 200, 0, 382);
    beach.explore();
  }

  public static void testMyCollage()
  {
    Picture beach = new Picture("beach.jpg");
    beach.myCollage();
    beach.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testLimitCopy();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    testMyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}