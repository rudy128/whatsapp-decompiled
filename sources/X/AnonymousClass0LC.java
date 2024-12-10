package X;

/* renamed from: X.0LC  reason: invalid class name */
public abstract class AnonymousClass0LC {
    public static final AnonymousClass04D A00(C17130tn r3, Object obj, int i) {
        AnonymousClass04D r1;
        Object A0u = AnonymousClass000.A0u(r3, Integer.rotateLeft(i, 1));
        if (A0u == AnonymousClass0MH.A00) {
            r1 = new AnonymousClass04D(i, obj, true);
            r3.CRH(r1);
        } else {
            C18070vi.A0z(A0u, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            r1 = (AnonymousClass04D) A0u;
            r1.A08(obj);
        }
        AnonymousClass0VR.A0T(r3);
        return r1;
    }

    public static final AnonymousClass04D A01(Object obj, int i, boolean z) {
        return new AnonymousClass04D(i, obj, z);
    }
}
