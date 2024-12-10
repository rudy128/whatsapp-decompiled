package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3Dp  reason: invalid class name and case insensitive filesystem */
public final class C71053Dp implements C30391dr, C30401ds {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C71053Dp.class, Object.class, "result");
    public final C30391dr A00;
    public volatile Object result;

    public C71053Dp(C30391dr r2) {
        this(C31751g4.UNDECIDED, r2);
    }

    public final Object A00() {
        Object obj = this.result;
        C31751g4 r2 = C31751g4.UNDECIDED;
        if (obj == r2) {
            if (!C30561e9.A00(this, r2, C31751g4.COROUTINE_SUSPENDED, A01)) {
                obj = this.result;
            }
            return C31751g4.COROUTINE_SUSPENDED;
        }
        if (obj != C31751g4.RESUMED) {
            if (!(obj instanceof AnonymousClass1IU)) {
                return obj;
            }
            throw ((AnonymousClass1IU) obj).exception;
        }
        return C31751g4.COROUTINE_SUSPENDED;
    }

    public C30401ds getCallerFrame() {
        C30391dr r1 = this.A00;
        if (r1 instanceof C30401ds) {
            return (C30401ds) r1;
        }
        return null;
    }

    public C18560wh getContext() {
        return this.A00.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C31751g4 r1 = C31751g4.UNDECIDED;
            if (obj2 != r1) {
                C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
                if (obj2 == r2) {
                    if (C30561e9.A00(this, r2, C31751g4.RESUMED, A01)) {
                        this.A00.resumeWith(obj);
                        return;
                    }
                } else {
                    throw AnonymousClass000.A0n("Already resumed");
                }
            } else if (C30561e9.A00(this, r1, obj, A01)) {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SafeContinuation for ");
        return C17890vO.A0V(this.A00, A10);
    }

    public C71053Dp(Object obj, C30391dr r2) {
        this.A00 = r2;
        this.result = obj;
    }
}
