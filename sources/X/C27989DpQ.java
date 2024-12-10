package X;

/* renamed from: X.DpQ  reason: case insensitive filesystem */
public final class C27989DpQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C25982Cpv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27989DpQ(C25982Cpv cpv) {
        super(1);
        this.this$0 = cpv;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass205 r5 = (AnonymousClass205) obj;
        C18070vi.A0d(r5, 0);
        AnonymousClass206 A00 = this.this$0.A01.A01.A00(r5);
        if (A00 != null) {
            AnonymousClass20X r2 = this.this$0.A02;
            AnonymousClass20F A15 = AnonymousClass3MW.A15(A00.getClass());
            r2.A01();
            AnonymousClass24T r0 = r2.A00;
            if (r0 == null) {
                C18070vi.A11("metadata");
                throw null;
            }
            Number number = (Number) AnonymousClass8BV.A0n(A15, r0.A02);
            if (number != null) {
                int intValue = number.intValue();
                if (intValue != 0) {
                    return C25982Cpv.A01(intValue);
                }
                String A0P = A00.A0P();
                if (A0P != null) {
                    if (this.this$0.A03.A02(A0P) != null) {
                        return C24298Byv.TYPE_LINK;
                    }
                    return C24298Byv.TYPE_TEXT;
                }
            }
        }
        return C24298Byv.TYPE_UNKNOWN;
    }
}
