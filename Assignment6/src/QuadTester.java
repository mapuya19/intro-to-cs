public class QuadTester {
    public static void main(String[] args) {
        QuadraticEquation eQuad = new QuadraticEquation();
        // QuadraticEquation quad = new QuadraticEquation(1,2,3);

        eQuad.setA(1);
        eQuad.setB(-1);
        eQuad.setC(-6);

        int a = eQuad.getA();
        int b = eQuad.getB();
        int c = eQuad.getC();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double discriminant = eQuad.getDiscriminant(a,b,c);
        System.out.println(discriminant);

        System.out.println(eQuad.hasRealSolution(discriminant));
        System.out.println(eQuad.isQuadratic(a));
        System.out.println(eQuad.hasDuplicatedSolution(discriminant));

        int solution1 = (int) eQuad.getSolution1(discriminant,a,b);
        int solution2 = (int) eQuad.getSolution2(discriminant,a,b);

        System.out.println("Solution 1: " + solution1 + ", Solution 2: " + solution2);

    }
}
