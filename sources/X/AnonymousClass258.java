package X;

/* renamed from: X.258  reason: invalid class name */
public final class AnonymousClass258 implements C447624r {
    public final AnonymousClass00H A00;

    public AnonymousClass258(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r6, C49702Rn r7) {
        String str;
        String A01;
        C18070vi.A0d(r6, 0);
        if ((r6.A11 & 4) == 4 || !((A01 = AnonymousClass25B.A01(r6)) == null || A01.length() == 0)) {
            AnonymousClass25B.A02(((AnonymousClass1QR) this.A00.get()).A0N(r6.A0v.A01, AnonymousClass25B.A01(r6), r6.A0x), r6);
            AW0 A002 = AnonymousClass25B.A00(r6);
            if (A002 == null || (str = A002.A0K) == null) {
                str = "UNSET";
            }
            AnonymousClass25B.A04(r6, str);
            if (r7 != null) {
                new AnonymousClass20F(AnonymousClass258.class);
                throw new NullPointerException("onProcessorExecuted");
            }
        }
    }
}
