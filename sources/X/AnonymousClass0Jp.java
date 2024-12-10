package X;

/* renamed from: X.0Jp  reason: invalid class name */
public final class AnonymousClass0Jp {
    public AnonymousClass0PT A00;
    public C16350s7 A01;
    public final C16750sx A02;

    public final void A02(int i) {
        C16350s7 A012;
        int i2;
        if (i == 7) {
            C22821Di A002 = A00().A00();
            if (A002 != null) {
                A002.invoke(this);
                return;
            }
            C16750sx r0 = this.A02;
            if (r0 != null) {
                r0.Bcv();
            }
        } else if (i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            A00();
            if (i == 6) {
                A012 = A01();
                i2 = 1;
            } else if (i == 5) {
                A012 = A01();
                i2 = 2;
            } else {
                return;
            }
            A012.Bk5(i2);
        } else if (i != 1 && i != 0) {
            throw AnonymousClass000.A0n("invalid ImeAction");
        }
    }

    public final AnonymousClass0PT A00() {
        AnonymousClass0PT r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("keyboardActions");
        throw null;
    }

    public final C16350s7 A01() {
        C16350s7 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("focusManager");
        throw null;
    }

    public AnonymousClass0Jp(C16750sx r1) {
        this.A02 = r1;
    }
}
