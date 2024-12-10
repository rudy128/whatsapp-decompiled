package X;

/* renamed from: X.4Dg  reason: invalid class name and case insensitive filesystem */
public enum C83074Dg {
    LEFT_CROP_TO_LEFT(0, 3, 3),
    LEFT_CROP_TO_RIGHT(1, 3, 1),
    TOP_CROP_TO_TOP(2, 0, 0),
    TOP_CROP_TO_BOTTOM(3, 0, 2),
    RIGHT_CROP_TO_RIGHT(4, 1, 1),
    RIGHT_CROP_TO_LEFT(5, 1, 3),
    BOTTOM_CROP_TO_TOP(6, 2, 0),
    BOTTOM_CROP_TO_BOTTOM(7, 2, 2);
    
    public final int direction;
    public final int origin;
    public final int value;

    /* access modifiers changed from: public */
    static {
        C83074Dg[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C83074Dg(int i, int i2, int i3) {
        this.value = i;
        this.origin = i2;
        this.direction = i3;
    }
}
