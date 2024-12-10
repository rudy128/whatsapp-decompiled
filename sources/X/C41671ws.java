package X;

/* renamed from: X.1ws  reason: invalid class name and case insensitive filesystem */
public abstract class C41671ws {
    public static final Object A00(Object obj, AnonymousClass1OS r3, C41581wh r4) {
        Object obj2;
        Object A0a;
        try {
            if (!(r3 instanceof C30411dt)) {
                obj2 = C30581eB.A00(obj, r4, r3);
            } else {
                C41681wt.A04(r3, 2);
                obj2 = r3.invoke(obj, r4);
            }
        } catch (Throwable th) {
            obj2 = new C30681eL(th);
        }
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        if (obj2 == r2 || (A0a = r4.A0a(obj2)) == AnonymousClass1OF.A00) {
            return r2;
        }
        if (!(A0a instanceof C30681eL)) {
            return AnonymousClass1OF.A01(A0a);
        }
        throw ((C30681eL) A0a).A00;
    }
}
