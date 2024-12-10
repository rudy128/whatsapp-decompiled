package X;

public final class A24 {
    public final C170598qH A00;
    public final AnonymousClass1BI A01;
    public final AnonymousClass1BI A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A24) {
                A24 a24 = (A24) obj;
                if (!C18070vi.A18(this.A00, a24.A00) || !C18070vi.A18(this.A02, a24.A02) || !C18070vi.A18(this.A01, a24.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass205 A00(A24 a24, Object obj) {
        C170498px r3 = (C170498px) obj;
        C18070vi.A0z(r3.A0H(a24.A02), "null cannot be cast to non-null type T of com.whatsapp.companiondevice.sync.handlers.MessageKeyMutationWrapper");
        C170498px A0H = r3.A0H(a24.A01);
        C18070vi.A0z(A0H, "null cannot be cast to non-null type T of com.whatsapp.companiondevice.sync.handlers.MessageKeyMutationWrapper");
        return A0H.A01;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    public A24(C170598qH r2, AnonymousClass1BI r3, AnonymousClass1BI r4) {
        C18070vi.A0k(r3, r4);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A04 = r2.A0G(r3).A0A();
        this.A03 = r2.A0G(r4).A0A();
        this.A05 = r3.equals(r4);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JidMutationWrapper(mutation=");
        A10.append(this.A00);
        A10.append(", originalThreadJid=");
        A10.append(this.A02);
        A10.append(", currentThreadJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
