class RectangularRoom {
  private static final double FEET_TO_METERS = 0.09290304;
  
  public static void main(String[] args) { 
    var line = System.console().readLine("What is the length of the room in feet? ");
    var length = Integer.parseInt(line);

    line = System.console().readLine("What is the width of the room in feet? ");
    var width = Integer.parseInt(line);

    var area = length * width;
    var areaInMeters = area * FEET_TO_METERS;
    
    System.out.printf("The area is%n%d square feet%n%.3f square meters%n", area, areaInMeters);
  }  
}
