package X;

/* renamed from: X.9AW  reason: invalid class name */
public final class AnonymousClass9AW extends C24741Lm {
    public AnonymousClass9Z4 A00;
    public final A4A A01;
    public final AnonymousClass11C A02;
    public final C18010vc A03;

    public void C9L(C122516Qr r3, boolean z) {
        AnonymousClass9Z4 r0 = this.A00;
        if (r0 != null) {
            r0.A00.A01.A07(-1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AW(A4A a4a, AnonymousClass11C r2, C18010vc r3, C24571Kv r4) {
        super(r4);
        C18070vi.A0o(r2, r3, r4);
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = a4a;
        A09();
    }

    public String BZc() {
        long j;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("bkch=");
        AiK A002 = A4A.A00(this.A01);
        if (A002 == null) {
            j = 0;
        } else {
            synchronized (A002) {
                j = A002.A01;
            }
        }
        return C17880vN.A0u(A10, j);
    }
}
