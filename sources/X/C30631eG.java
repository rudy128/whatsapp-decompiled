package X;

/* renamed from: X.1eG  reason: invalid class name and case insensitive filesystem */
public abstract class C30631eG {
    public static final AnonymousClass1I8 A00 = new AnonymousClass1I8("NO_THREAD_ELEMENTS");
    public static final AnonymousClass1OS A01 = C30641eH.A00;
    public static final AnonymousClass1OS A02 = C30651eI.A00;
    public static final AnonymousClass1OS A03 = C30661eJ.A00;

    public static final Object A01(C18560wh r2) {
        Object fold = r2.fold(0, A01);
        C18070vi.A0b(fold);
        return fold;
    }

    public static final Object A00(Object obj, C18560wh r2) {
        if (obj == null) {
            obj = A01(r2);
        }
        if (obj == 0) {
            return A00;
        }
        if (obj instanceof Integer) {
            return r2.fold(new C53992dQ(r2, ((Number) obj).intValue()), A03);
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        throw new NullPointerException("updateThreadContext");
    }

    public static final void A02(Object obj, C18560wh r2) {
        if (obj == A00) {
            return;
        }
        if (obj instanceof C53992dQ) {
            AnonymousClass3MR[] r1 = ((C53992dQ) obj).A01;
            int length = r1.length - 1;
            if (length >= 0) {
                C18070vi.A0b(r1[length]);
                throw new NullPointerException("restoreThreadContext");
            }
            return;
        }
        C18070vi.A0z(r2.fold((Object) null, A02), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        throw new NullPointerException("restoreThreadContext");
    }
}
