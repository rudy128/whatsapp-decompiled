package X;

/* renamed from: X.25B  reason: invalid class name */
public abstract class AnonymousClass25B {
    public static final AW0 A00(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        AnonymousClass25E r0 = (AnonymousClass25E) r1.A0M(AnonymousClass25E.class).A02;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public static final void A02(AW0 aw0, AnonymousClass206 r4) {
        String str;
        C18070vi.A0d(r4, 0);
        Class<AnonymousClass25E> cls = AnonymousClass25E.class;
        AnonymousClass25F A0M = r4.A0M(cls);
        C18070vi.A0X(A0M);
        AnonymousClass25E r0 = (AnonymousClass25E) r4.A0M(cls).A02;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        A0M.A02(new AnonymousClass25E(aw0, str));
    }

    public static final void A03(AnonymousClass206 r1, AnonymousClass25E r2) {
        C18070vi.A0d(r1, 0);
        r1.A0M(AnonymousClass25E.class).A02(r2);
    }

    public static final String A01(AnonymousClass206 r1) {
        AnonymousClass25E r0 = (AnonymousClass25E) r1.A0M(AnonymousClass25E.class).A02;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public static final void A04(AnonymousClass206 r3, String str) {
        AW0 aw0;
        Class<AnonymousClass25E> cls = AnonymousClass25E.class;
        AnonymousClass25F A0M = r3.A0M(cls);
        C18070vi.A0X(A0M);
        AnonymousClass25E r0 = (AnonymousClass25E) r3.A0M(cls).A02;
        if (r0 != null) {
            aw0 = r0.A00;
        } else {
            aw0 = null;
        }
        A0M.A02(new AnonymousClass25E(aw0, str));
    }
}
