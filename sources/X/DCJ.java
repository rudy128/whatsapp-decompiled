package X;

public final class DCJ implements E4R {
    public int BVX(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if ((i < 0 || i > 10) && i % 10 == 0) {
            return 4;
        }
        return 5;
    }
}
