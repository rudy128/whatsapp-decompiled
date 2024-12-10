package X;

/* renamed from: X.1q6  reason: invalid class name and case insensitive filesystem */
public final class C37771q6 implements AnonymousClass1GC {
    public final AnonymousClass1GE A00;
    public final AnonymousClass1GC A01;

    public C37771q6(AnonymousClass1GE r2, AnonymousClass1GC r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0d(r3, 1);
        switch (r3.ordinal()) {
            case 0:
                this.A00.BqQ(r4);
                break;
            case 1:
                this.A00.C6E();
                break;
            case 2:
                this.A00.C3z(r4);
                break;
            case 3:
                this.A00.C0B(r4);
                break;
            case 4:
                this.A00.C71(r4);
                break;
            case 5:
                this.A00.BrH(r4);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        AnonymousClass1GC r0 = this.A01;
        if (r0 != null) {
            r0.C6U(r3, r4);
        }
    }
}
