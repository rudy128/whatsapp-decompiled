package X;

public final class DCI implements E4R {
    public int BVX(int i) {
        int i2 = i % 100;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 < 3 || i2 > 4) {
                    return 5;
                }
            }
        }
        return i3;
    }
}
