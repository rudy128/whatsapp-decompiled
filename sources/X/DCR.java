package X;

public final class DCR implements E4R {
    public int BVX(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i >= 3) {
            if (i > 6) {
                return i > 10 ? 5 : 4;
            }
            return 3;
        }
    }
}
