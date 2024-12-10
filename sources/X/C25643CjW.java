package X;

/* renamed from: X.CjW  reason: case insensitive filesystem */
public final class C25643CjW {
    public static final C25643CjW A01 = new C25643CjW(0);
    public static final C25643CjW A02 = new C25643CjW(2);
    public static final C25643CjW A03 = new C25643CjW(1);
    public final int A00;

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "SplitSupportStatus: AVAILABLE";
        }
        if (i != 1) {
            return "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED";
        }
        return "SplitSupportStatus: UNAVAILABLE";
    }

    public C25643CjW(int i) {
        this.A00 = i;
    }
}
