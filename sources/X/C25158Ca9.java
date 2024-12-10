package X;

/* renamed from: X.Ca9  reason: case insensitive filesystem */
public class C25158Ca9 {
    public boolean A00;
    public final C25850CnB A01;

    public final void A01(String str) {
        if (!this.A01.A09()) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" Current thread: ");
            throw BE9.A0n(Thread.currentThread().getName(), A11);
        }
    }

    public C25158Ca9(C25850CnB cnB) {
        this.A01 = cnB;
    }

    public final void A00(String str) {
        A01(AnonymousClass001.A1H("Can only check if prepared on the Optic thread. ", str, AnonymousClass000.A10()));
        if (!this.A00) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Not prepared: ");
            A10.append(str);
            A10.append(" Current thread: ");
            throw AnonymousClass000.A0o(Thread.currentThread().getName(), A10);
        }
    }

    public final void A02(boolean z, String str) {
        A01(AnonymousClass001.A1H("Can only set the prepared state on the Optic thread. ", str, AnonymousClass000.A10()));
        this.A00 = z;
    }
}
