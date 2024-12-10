package X;

public final class DCF implements E4R {
    public int BVX(int i) {
        int i2;
        if (i == 1) {
            return 1;
        }
        if (i == 0 || ((i2 = i % 100) >= 1 && i2 <= 19)) {
            return 3;
        }
        return 5;
    }
}
