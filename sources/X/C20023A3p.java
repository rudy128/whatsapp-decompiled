package X;

/* renamed from: X.A3p  reason: case insensitive filesystem */
public final class C20023A3p {
    public static final C20023A3p A00 = new Object();

    public static final C178229Ch A00(C29621ca r12, C62672rm r13) {
        C29621ca r3 = r12;
        C62672rm r2 = r13;
        if (!r13.A09(r12, "notice")) {
            return null;
        }
        String[] A1W = AnonymousClass8BS.A1W(1, 0);
        Class cls = Long.TYPE;
        Long A0L = C17890vO.A0L();
        Number number = (Number) r2.A05(r3, cls, A0L, AnonymousClass8BU.A0j(), (Object) null, A1W, false);
        if (number == null) {
            return null;
        }
        long longValue = number.longValue();
        Number number2 = (Number) r2.A05(r3, cls, A0L, AnonymousClass8BV.A0j(), (Object) null, new String[]{"stage"}, false);
        if (number2 == null) {
            return null;
        }
        return new C178229Ch(r3, 2, longValue, number2.longValue());
    }
}
