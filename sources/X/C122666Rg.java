package X;

/* renamed from: X.6Rg  reason: invalid class name and case insensitive filesystem */
public enum C122666Rg {
    STAR(0, 2131232317, 2131897222),
    FORWARD(1, 2131231930, 2131897212),
    PIN(2, 2131233408, 2131897220),
    INTERESTED(3, 2131231801, 2131897215),
    NOT_INTERESTED(4, 2131231777, 2131897219),
    ARCHIVE(5, 2131231671, 2131897210),
    REPORT_AND_BLOCK(6, 2131232094, 2131897221),
    GET_MORE(7, 2131232413, 2131897214),
    GET_LESS(8, 2131232416, 2131897213),
    ADD_FAV_PREFS(9, 2131231657, 2131897211),
    MUTE_PREFS(10, 2131232143, 2131897218),
    MANAGE_PREFS(11, 2131232084, 2131897216),
    STOP(12, 2131231711, 2131897224),
    BLOCK(13, 2131231719, 2131887170);
    
    public final int iconRes;
    public final int titleRes;
    public final String ucActionType;

    /* access modifiers changed from: public */
    static {
        C122666Rg[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C122666Rg(int i, int i2, int i3) {
        this.ucActionType = r2;
        this.iconRes = i2;
        this.titleRes = i3;
    }
}
