public class RectTest extends Rect{
    public static void main(String[] args){  
        Rect r = new Rect(1, 1, 4, 4);
        Rect r2 = new Rect(2, 3, 5, 6);
        System.out.println("<" + r2.x1 + "," + r2.y1 + "> is inside the union");
        System.out.println(r + " union " + r2 + " = " + r.union(r2));  
        System.out.println(r + " intersection " + r2 + " = " + r.intersection(r2));
    }
}

