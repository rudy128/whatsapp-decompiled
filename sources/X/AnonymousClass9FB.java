package X;

/* renamed from: X.9FB  reason: invalid class name */
public final class AnonymousClass9FB extends AnonymousClass9CP {
    public final long A00;
    public final AnonymousClass9DB A01;

    public AnonymousClass9FB(C29621ca r13, AnonymousClass9F7 r14) {
        C108945cZ.A1N(r13);
        C29621ca r2 = (C29621ca) r14.A00;
        C62672rm A0s = AnonymousClass8BR.A0s();
        Number number = (Number) A0s.A05(r13, Long.TYPE, 30L, 600L, (Object) null, new String[]{"live_updates", "duration"}, false);
        if (number != null) {
            this.A00 = number.longValue();
            C18070vi.A0d(A96.A00, 0);
            C18070vi.A0d(r2, 1);
            AnonymousClass9DB A08 = A96.A08(r13, r2, A0s);
            if (A08 != null) {
                this.A01 = A08;
                this.A00 = r13;
                return;
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
