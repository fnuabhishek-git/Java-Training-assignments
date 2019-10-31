package ObjectCount;

public class Driver {
    public static void main(String args[]) {
        ObjCount t1 = new ObjCount();
        ObjCount t2 = new ObjCount(5);
        ObjCount t3 = new ObjCount("GFG");
        System.out.println(ObjCount.noOfObjects);
    }
}
