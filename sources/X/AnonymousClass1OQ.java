package X;

/* renamed from: X.1OQ  reason: invalid class name */
public abstract class AnonymousClass1OQ {
    public static Object A00(Object obj, C18570wi r2, AnonymousClass1OS r3) {
        C18070vi.A0d(r3, 2);
        return r3.invoke(obj, r2);
    }

    public static C18570wi A01(C18570wi r1, C23801Hr r2) {
        C18070vi.A0d(r2, 1);
        if (!C18070vi.A18(r1.getKey(), r2)) {
            return null;
        }
        return r1;
    }

    public static C18560wh A02(C18570wi r1, C23801Hr r2) {
        C18070vi.A0d(r2, 1);
        boolean A18 = C18070vi.A18(r1.getKey(), r2);
        C18560wh r12 = r1;
        if (A18) {
            r12 = AnonymousClass1OR.A00;
        }
        return r12;
    }

    public static C18560wh A03(C18570wi r1, C18560wh r2) {
        C18070vi.A0d(r2, 1);
        if (r2 != AnonymousClass1OR.A00) {
            return (C18560wh) r2.fold(r1, AnonymousClass1OT.A00);
        }
        return r1;
    }
}
