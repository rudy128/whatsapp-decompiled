package X;

public final class DCM implements E4R {
    public int BVX(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            if (i % 100 != 11) {
                return 1;
            }
            return 4;
        } else if (i2 < 2 || i2 > 4) {
            return 4;
        } else {
            int i3 = i % 100;
            if (i3 < 12 || i3 > 14) {
                return 3;
            }
            return 4;
        }
    }
}
