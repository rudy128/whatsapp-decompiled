package X;

public enum C0B {
    FULL_SHEET(0, false, false),
    HALF_SHEET(1, false, false),
    AUTO_SHEET(2, false, false),
    FULL_SCREEN(3, false, true),
    FULL_SCREEN_STYLE_SHEET(4, false, true),
    FLEXIBLE_SHEET(5, true, false),
    HALF_SHEET_WITH_UNDERLAY(6, false, false);
    
    public static final C0B[] A00 = null;
    public final boolean fullScreenStyle;
    public final String value;
    public final boolean wrapsContent;

    /* access modifiers changed from: public */
    static {
        C0B[] c0bArr;
        C19820z3 A002 = C19780yz.A00(c0bArr);
        A01 = A002;
        A00 = (C0B[]) A002.toArray(new C0B[0]);
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C0B(int i, boolean z, boolean z2) {
        this.value = r2;
        this.wrapsContent = z;
        this.fullScreenStyle = z2;
    }
}
