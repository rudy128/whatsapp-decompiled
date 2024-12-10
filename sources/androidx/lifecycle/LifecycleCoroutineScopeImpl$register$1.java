package androidx.lifecycle;

import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C23391Fw;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30551e8;
import X.C30691eM;
import X.C37581pm;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScopeImpl$register$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C37581pm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(C37581pm r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, r4);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(obj, (C30391dr) obj2)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r2 = (AnonymousClass1OX) this.L$0;
            if (((C23391Fw) this.this$0.A00).A02.compareTo(C23401Fx.INITIALIZED) >= 0) {
                C37581pm r1 = this.this$0;
                r1.A00.A05(r1);
            } else {
                C30551e8.A03((CancellationException) null, r2.getCoroutineContext());
            }
            return C27621Wu.A00;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
