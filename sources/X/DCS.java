package X;

public final class DCS implements E4R {
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
        int i2 = i % 100;
        if (i2 >= 3) {
            if (i2 <= 10) {
                return 3;
            }
            if (i2 > 99) {
                return 5;
            }
            return 4;
        }
        return 5;
    }
}
