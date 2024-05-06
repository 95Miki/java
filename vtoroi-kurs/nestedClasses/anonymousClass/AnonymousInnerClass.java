package nestedClasses.anonymousClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a/b^2;
            }
        };
        System.out.println(m.doOperation(45,2));
    }
}
interface Math{
    int doOperation(int a,int b);
}
