package X;

import androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1pk  reason: invalid class name and case insensitive filesystem */
public abstract class C37561pk {
    public static final C37581pm A00(C23381Fv r6) {
        C37581pm r4;
        C18070vi.A0d(r6, 0);
        while (true) {
            AtomicReference atomicReference = r6.A00;
            r4 = (C37581pm) atomicReference.get();
            if (r4 != null) {
                break;
            }
            AnonymousClass1OE r1 = new AnonymousClass1OE((AnonymousClass1OB) null);
            C18600wl r0 = C23871Hy.A00;
            AnonymousClass1IT r2 = ((AnonymousClass1IT) AnonymousClass1IN.A00).A01;
            r4 = new C37581pm(r6, r1.plus(r2));
            if (AnonymousClass00N.A00((Object) null, r4, atomicReference)) {
                C30451dy.A02(AnonymousClass00R.A00, r2, new LifecycleCoroutineScopeImpl$register$1(r4, (C30391dr) null), r4);
                break;
            }
        }
        return r4;
    }
}
