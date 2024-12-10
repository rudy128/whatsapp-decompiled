package X;

/* renamed from: X.6nS  reason: invalid class name and case insensitive filesystem */
public final class C132726nS {
    public final AnonymousClass18K A00;
    public final C18010vc A01;
    public final AnonymousClass19K A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass7SG(this));

    public final void A00(String str) {
        synchronized (this) {
            C18100vl r1 = this.A03;
            C17880vN.A1C(C108995ce.A0E(r1), str, C18070vi.A03(r1).getInt(str, 0) + 1);
        }
    }

    public C132726nS(AnonymousClass18K r2, C18010vc r3, AnonymousClass19K r4) {
        C18070vi.A0o(r4, r2, r3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }
}
