package X;

public final class DCB implements E4R {
    public int BVX(int i) {
        if (i % 10 != 1 || i % 100 == 11) {
            return 5;
        }
        return 1;
    }
}
