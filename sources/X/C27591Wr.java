package X;

/* renamed from: X.1Wr  reason: invalid class name and case insensitive filesystem */
public final class C27591Wr {
    public static final C27581Wq A00(C23401Fx r1) {
        C18070vi.A0d(r1, 0);
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            return C27581Wq.ON_DESTROY;
        }
        if (ordinal == 3) {
            return C27581Wq.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return C27581Wq.ON_PAUSE;
    }
}
