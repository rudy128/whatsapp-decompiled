package X;

public final class DCD implements E4R {
    public int BVX(int i) {
        int i2 = i % 10;
        if (i2 == 0) {
            return 0;
        }
        int i3 = i % 100;
        if (i3 >= 11 && i3 <= 19) {
            return 0;
        }
        if (i2 != 1 || i3 == 11) {
            return 5;
        }
        return 1;
    }
}
