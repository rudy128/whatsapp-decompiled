package X;

/* renamed from: X.Ag5  reason: case insensitive filesystem */
public final class C21196Ag5 implements C22470B9c {
    public static final C21196Ag5 A00 = new C21196Ag5();

    public final Object BCF(C29621ca r13, C62672rm r14) {
        C29621ca r5 = r13;
        C62672rm r4 = r14;
        boolean A17 = C18070vi.A17(r13, r14);
        if (!AnonymousClass8BR.A1R(r13, r14)) {
            return null;
        }
        String str = (String) r4.A05(r5, String.class, C108975cc.A0X(), 40L, (Object) null, AnonymousClass8BS.A1U(A17 ? 1 : 0), false);
        if (str == null) {
            return null;
        }
        Number number = (Number) r4.A05(r5, Long.TYPE, AnonymousClass8BV.A0i(), 599L, (Object) null, AnonymousClass8BS.A1S(A17), false);
        if (number != null) {
            return new C178309Cp(r13, str, number.longValue());
        }
        return null;
    }
}
