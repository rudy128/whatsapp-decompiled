package X;

/* renamed from: X.DCb  reason: case insensitive filesystem */
public final class C26748DCb implements E4R {
    public int BVX(int i) {
        if (i == 1) {
            return 1;
        }
        int i2 = i % 10;
        if (i2 < 2 || i2 > 4) {
            return 4;
        }
        int i3 = i % 100;
        if (i3 < 12 || i3 > 14) {
            return 3;
        }
        return 4;
    }
}
