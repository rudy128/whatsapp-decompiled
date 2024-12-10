package X;

/* renamed from: X.1eB  reason: invalid class name and case insensitive filesystem */
public abstract class C30581eB {
    public static final Object A00(Object obj, C30391dr r4, AnonymousClass1OS r5) {
        Object r0;
        C18070vi.A0d(r5, 0);
        C18560wh context = r4.getContext();
        if (context == AnonymousClass1OR.A00) {
            r0 = new C71403Fd(r4);
        } else {
            r0 = new AnonymousClass3F8(r4, context);
        }
        C41681wt.A04(r5, 2);
        return r5.invoke(obj, r0);
    }

    public static final C30391dr A01(Object obj, C30391dr r3, AnonymousClass1OS r4) {
        C18070vi.A0d(r4, 0);
        if (r4 instanceof C30411dt) {
            return ((C30411dt) r4).create(obj, r3);
        }
        C18560wh context = r3.getContext();
        if (context == AnonymousClass1OR.A00) {
            return new C71413Fe(obj, r3, r4);
        }
        return new AnonymousClass3FE(obj, r3, context, r4);
    }

    public static final C30391dr A02(C30391dr r1) {
        C30421du r0;
        C18070vi.A0d(r1, 0);
        if (!(r1 instanceof C30421du) || (r0 = (C30421du) r1) == null) {
            return r1;
        }
        return r0.intercepted();
    }
}
