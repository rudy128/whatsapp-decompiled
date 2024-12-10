package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1wi  reason: invalid class name and case insensitive filesystem */
public final class C41591wi extends C41581wh {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(C41591wi.class, "_decision$volatile");
    public volatile /* synthetic */ int _decision$volatile;

    private final boolean A01() {
        AtomicIntegerFieldUpdater A002 = A00;
        do {
            int i = A002.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!A00.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean A02() {
        AtomicIntegerFieldUpdater A002 = A00;
        do {
            int i = A002.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!A00.compareAndSet(this, 0, 1));
        return true;
    }

    public void A0k(Object obj) {
        A12(obj);
    }

    public void A12(Object obj) {
        if (!A01()) {
            C30391dr A02 = C30581eB.A02(this.A00);
            if (obj instanceof C30681eL) {
                obj = C30691eM.A00(((C30681eL) obj).A00);
            }
            C30621eF.A00(obj, A02);
        }
    }

    public final Object A14() {
        if (A02()) {
            return C31751g4.COROUTINE_SUSPENDED;
        }
        Object A01 = AnonymousClass1OF.A01(A0Z());
        if (!(A01 instanceof C30681eL)) {
            return A01;
        }
        throw ((C30681eL) A01).A00;
    }

    public C41591wi(C30391dr r1, C18560wh r2) {
        super(r1, r2);
    }
}
