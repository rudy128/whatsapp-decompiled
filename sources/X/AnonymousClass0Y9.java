package X;

/* renamed from: X.0Y9  reason: invalid class name */
public class AnonymousClass0Y9 implements AnonymousClass1GC, C218317o {
    public final int A00;
    public final Object A01;

    public AnonymousClass0Y9(AnonymousClass01C r1, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = r1;
                return;
            default:
                this.A01 = r1;
                return;
        }
    }

    public final void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        switch (this.A00) {
            case 0:
                AnonymousClass01C.A0D((AnonymousClass01C) this.A01, r3);
                return;
            case 1:
                AnonymousClass01C.A0E((AnonymousClass01C) this.A01, r3);
                return;
            case 2:
                AnonymousClass01C r0 = (AnonymousClass01C) this.A01;
                r0.A03();
                r0.getLifecycle().A06(this);
                return;
            default:
                if (r3 == C27581Wq.ON_DESTROY) {
                    C008603v r1 = (C008603v) this.A01;
                    r1.A02 = null;
                    r1.A00 = null;
                    r1.A01 = null;
                    return;
                }
                return;
        }
    }

    public AnonymousClass0Y9(C008603v r2) {
        this.A00 = 3;
        this.A01 = r2;
    }
}
