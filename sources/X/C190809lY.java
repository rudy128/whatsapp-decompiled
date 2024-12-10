package X;

/* renamed from: X.9lY  reason: invalid class name and case insensitive filesystem */
public final class C190809lY {
    public final AnonymousClass190 A00;
    public final C182759Vp A01;
    public final C18140vp A02;

    public final AnonymousClass3M5 A00(C438721g r13) {
        Object obj;
        C438721g r11 = r13;
        C18070vi.A0d(r13, 0);
        C20268AEb aEb = r13.A00;
        if (aEb == null) {
            return null;
        }
        int i = aEb.A03;
        if (i != 0) {
            if (i == 1) {
                obj = this.A02.get();
            } else if (i != 2) {
                return null;
            } else {
                AnonymousClass10E r0 = this.A01.A00.A00;
                A79 ACU = AnonymousClass10E.ACU(r0);
                C18030ve A8r = AnonymousClass10E.A8r(r0);
                obj = new C1774598q(AnonymousClass3MZ.A0f(r0), AnonymousClass3MZ.A0l(r0), AnonymousClass10E.A6Q(r0), A8r, ACU, r11);
            }
            return (AnonymousClass3M5) obj;
        }
        if (aEb.A02 != null) {
            this.A00.A0G("InteractiveResponseMessageCustomizerFactory/createCustomizer/selectedRowId", "response type doesn't match with selectedRowId state", true);
        }
        if (aEb.A01 == null) {
            return null;
        }
        this.A00.A0G("InteractiveResponseMessageCustomizerFactory/createCustomizer/nativeFlowResponse", "response type doesn't match with nativeFlowResponse state", true);
        return null;
    }

    public C190809lY(AnonymousClass190 r1, C182759Vp r2, C18140vp r3) {
        C18070vi.A0o(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
