package X;

/* renamed from: X.4g2  reason: invalid class name and case insensitive filesystem */
public final class C91654g2 implements C24051Ir {
    public final AnonymousClass4M7[] A00;

    public C91654g2(AnonymousClass4M7... r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ AnonymousClass1J2 BG9(Class cls) {
        C60282nh.A01();
        throw null;
    }

    public AnonymousClass1J2 BGl(C24091Iv r8, Class cls) {
        C18070vi.A0h(cls, r8);
        AnonymousClass1J2 r1 = null;
        for (AnonymousClass4M7 r2 : this.A00) {
            if (C18070vi.A18(r2.A00, cls)) {
                Object invoke = r2.A01.invoke(r8);
                if (invoke instanceof AnonymousClass1J2) {
                    r1 = (AnonymousClass1J2) invoke;
                } else {
                    r1 = null;
                }
            }
        }
        if (r1 != null) {
            return r1;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("No initializer set for given class ");
        throw AnonymousClass001.A12(cls.getName(), A10);
    }
}
