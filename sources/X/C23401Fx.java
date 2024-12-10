package X;

/* renamed from: X.1Fx  reason: invalid class name and case insensitive filesystem */
public enum C23401Fx {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean A00(C23401Fx r3) {
        if (compareTo(r3) >= 0) {
            return true;
        }
        return false;
    }
}
