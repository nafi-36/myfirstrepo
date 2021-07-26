public class DemoRelation {
    public static void main (String[] args){
        Line r = new Line(1.2,2.0,3.4,4.0);
        System.out.println("Length : " + r.getLength());
        System.out.println("aLen>bLen : " + r.isGreater(r, r));
        System.out.println("aLen<bLen : " + r.isLess(r, r));
    }
}




