package androidx.compose.animation.core;

import X.AnonymousClass000;
import X.AnonymousClass0Q5;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C04460Nm;
import X.C10150hs;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", i = {0}, l = {649}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
public final class Transition$animateTo$1$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass0Q5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(AnonymousClass0Q5 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((Transition$animateTo$1$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, r4);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1OX r3;
        C10150hs r0;
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r3 = (AnonymousClass1OX) this.L$0;
        } else if (i == 1) {
            r3 = (AnonymousClass1OX) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        do {
            r0 = new C10150hs(this.this$0, SuspendAnimationKt.A00(r3.getCoroutineContext()));
            this.L$0 = r3;
            this.label = 1;
        } while (C04460Nm.A02(this, r0) != A03);
        return A03;
    }
}
