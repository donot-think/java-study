package inheritance2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setLength(12);
        c1.setRadius(10);
        double  result = c1.findVolume();
        System.out.println("半径为:"+c1.getRadius()+",高度为:"+c1.getLength()+"," +
                "的圆柱的体积为:"+result+"并且它的底面面积为:"+c1.findArea());
    }
}
