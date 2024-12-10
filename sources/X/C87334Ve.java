package X;

import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3;

/* renamed from: X.4Ve  reason: invalid class name and case insensitive filesystem */
public abstract class C87334Ve {
    public static final Object A00(C23401Fx r2, C23381Fv r3, C30391dr r4, AnonymousClass1OS r5) {
        Object A00;
        if (r2 == C23401Fx.INITIALIZED) {
            throw AnonymousClass000.A0k("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        } else if (((C23391Fw) r3).A02 == C23401Fx.DESTROYED || (A00 = AnonymousClass1OW.A00(r4, new RepeatOnLifecycleKt$repeatOnLifecycle$3(r2, r3, (C30391dr) null, r5))) != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        } else {
            return A00;
        }
    }

    public static final Object A01(C23401Fx r1, AnonymousClass1F9 r2, C30391dr r3, AnonymousClass1OS r4) {
        return AnonymousClass3MX.A13(A00(r1, r2.getLifecycle(), r3, r4));
    }
}
