package X;

/* renamed from: X.0Nm  reason: invalid class name and case insensitive filesystem */
public abstract class C04460Nm {
    public static final C17860vL A00(C18560wh r1) {
        C17860vL r0 = (C17860vL) r1.get(C17860vL.A00);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object A01(C30391dr r2, C22821Di r3) {
        return A00(r2.getContext()).CSE(r2, new C10750iq(r3));
    }

    public static final Object A02(C30391dr r1, C22821Di r2) {
        return A00(r1.getContext()).CSE(r1, r2);
    }
}
