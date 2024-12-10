package X;

public final class DCT implements E4R {
    public int BVX(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 6 ? 5 : 4;
        }
        return 3;
    }
}
