package Lab1;


/////question 2

public class Overloading {
    int area;

    public Overloading() {
    }

    public int show(int a, int b) {
        return area = a * b;
    }

    public int show(int a, int b, int c) {
        return area = a * b * c;
    }

    public static void main(String[] args) {
        Overloading n1 = new Overloading();
        n1.show(2, 4);
        int no1 = n1.area;
        System.out.println(no1);

        n1.show(1, 2, 3);

        int no2 = n1.area;
        System.out.println(no2);
    }
}
