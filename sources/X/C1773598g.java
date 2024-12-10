package X;

/* renamed from: X.98g  reason: invalid class name and case insensitive filesystem */
public final class C1773598g extends C20083A6j {
    public String A0B() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20083A6j.A03(super.A0B(), "\n", A10);
        for (AE4 ae4 : this.A02.A0F) {
            String str = ae4.A01;
            A10.append(str);
            C20083A6j.A03(str, "\n", A10);
            for (AEF aef : ae4.A02) {
                C20083A6j.A03(aef.A03, " ", A10);
                C20083A6j.A03(aef.A00, "\n", A10);
            }
        }
        return C18070vi.A0H(A10);
    }

    public void A0H(C19998A2m a2m, AnonymousClass206 r3) {
        C18070vi.A0h(a2m, r3);
        C20120A8f.A05(this.A01, a2m, r3);
    }
}
