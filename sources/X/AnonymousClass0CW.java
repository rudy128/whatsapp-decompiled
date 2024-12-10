package X;

/* renamed from: X.0CW  reason: invalid class name */
public enum AnonymousClass0CW implements C16360s8 {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    public boolean A00() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 0 || ordinal == 1) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new AnonymousClass3EW();
    }

    public boolean Ber() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 0) {
            return true;
        }
        if (ordinal == 1 || ordinal == 3) {
            return false;
        }
        throw new AnonymousClass3EW();
    }
}
