package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2s9  reason: invalid class name and case insensitive filesystem */
public abstract class C62882s9 {
    public static final Object A00(C30391dr r3, long j) {
        if (j > 0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
            C31781g7 r32 = new C31781g7(1, C30581eB.A02(r3));
            r32.A0F();
            if (j < Long.MAX_VALUE) {
                A02(r32.A01).CGy(r32, j);
            }
            Object A0C = r32.A0C();
            if (A0C == C31751g4.COROUTINE_SUSPENDED) {
                return A0C;
            }
        }
        return C27621Wu.A00;
    }

    public static final Object A01(C30391dr r3, long j) {
        long j2;
        if (j > 0) {
            j2 = C21348Aid.A03(C21348Aid.A04(j, C196999vz.A01(C179589Io.NANOSECONDS, 999999)));
        } else {
            j2 = 0;
        }
        Object A00 = A00(r3, j2);
        if (A00 != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A00;
    }

    public static final C23781Hp A02(C18560wh r1) {
        C23781Hp r12;
        C18570wi r13 = r1.get(C18590wk.A00);
        if (!(r13 instanceof C23781Hp) || (r12 = (C23781Hp) r13) == null) {
            return AnonymousClass1II.A00;
        }
        return r12;
    }
}
