package X;

/* renamed from: X.1OD  reason: invalid class name */
public class AnonymousClass1OD extends AnonymousClass1OC implements AnonymousClass1OB {
    public final boolean A00 = A00();

    public AnonymousClass1OD(AnonymousClass1OB r2) {
        super(true);
        A0q(r2);
    }

    public boolean A0u() {
        return true;
    }

    public void A10() {
        A0x(C27621Wu.A00);
    }

    public void A11(Throwable th) {
        A0x(new C30681eL(th));
    }

    private final boolean A00() {
        AnonymousClass1ON r3;
        AnonymousClass1OJ A0h = A0h();
        if (A0h instanceof AnonymousClass1OP) {
            r3 = (AnonymousClass1ON) A0h;
        } else {
            r3 = null;
        }
        while (r3 != null) {
            AnonymousClass1OC A03 = r3.A03();
            if (!A03.A0t()) {
                AnonymousClass1OJ A0h2 = A03.A0h();
                if (!(A0h2 instanceof AnonymousClass1OP)) {
                    break;
                }
                r3 = (AnonymousClass1ON) A0h2;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean A0t() {
        return this.A00;
    }
}
