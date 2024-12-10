package X;

/* renamed from: X.1e3  reason: invalid class name and case insensitive filesystem */
public abstract class C30501e3 extends AnonymousClass1OC implements C30391dr, AnonymousClass1OB, AnonymousClass1OX {
    public final C18560wh A00;

    public void A10() {
    }

    public void A13(Throwable th, boolean z) {
    }

    public String A0d() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" was cancelled");
        return sb.toString();
    }

    public final void A0l(Object obj) {
        if (obj instanceof C30681eL) {
            C30681eL r3 = (C30681eL) obj;
            A13(r3.A00, r3.A01());
            return;
        }
        A10();
    }

    public final void A0n(Throwable th) {
        C181879Se.A00(this.A00, th);
    }

    public C30501e3(C18560wh r2, boolean z) {
        super(z);
        A0q((AnonymousClass1OB) r2.get(AnonymousClass1OB.A00));
        this.A00 = r2.plus(this);
    }

    public String A0c() {
        return super.A0c();
    }

    public final void A11(Integer num, Object obj, AnonymousClass1OS r7) {
        C18560wh context;
        Object A002;
        Object obj2;
        int intValue = num.intValue();
        if (intValue == 0) {
            C30571eA.A00(obj, this, r7);
        } else if (intValue == 2) {
            C18070vi.A0d(r7, 0);
            C30581eB.A02(C30581eB.A01(obj, this, r7)).resumeWith(C27621Wu.A00);
        } else if (intValue == 3) {
            try {
                context = getContext();
                A002 = C30631eG.A00((Object) null, context);
                if (!(r7 instanceof C30411dt)) {
                    obj2 = C30581eB.A00(obj, this, r7);
                } else {
                    C41681wt.A04(r7, 2);
                    obj2 = r7.invoke(obj, this);
                }
                C30631eG.A02(A002, context);
                if (obj2 != C31751g4.COROUTINE_SUSPENDED) {
                    resumeWith(obj2);
                }
            } catch (Throwable th) {
                resumeWith(new AnonymousClass1IU(th));
            }
        } else if (intValue != 1) {
            throw new AnonymousClass3EW();
        }
    }

    public void A12(Object obj) {
        A0k(obj);
    }

    public final C18560wh getContext() {
        return this.A00;
    }

    public C18560wh getCoroutineContext() {
        return this.A00;
    }

    public final void resumeWith(Object obj) {
        Throwable A002 = C30671eK.A00(obj);
        if (A002 != null) {
            obj = new C30681eL(A002);
        }
        Object A0a = A0a(obj);
        if (A0a != AnonymousClass1OF.A00) {
            A12(A0a);
        }
    }
}
