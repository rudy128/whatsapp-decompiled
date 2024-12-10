package androidx.compose.animation;

import X.AnonymousClass000;
import X.AnonymousClass0Q5;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C04950Pq;
import X.C07160aT;
import X.C07720dw;
import X.C16300s2;
import X.C17300uR;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", i = {}, l = {803}, m = "invokeSuspend", n = {}, s = {})
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Q5 $childTransition;
    public final /* synthetic */ C16300s2 $shouldDisposeBlockUpdated$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(AnonymousClass0Q5 r2, C16300s2 r3, C30391dr r4) {
        super(2, r4);
        this.$childTransition = r2;
        this.$shouldDisposeBlockUpdated$delegate = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C17300uR r3, C30391dr r4) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, r5);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz A05 = C04950Pq.A05(new C07720dw(this.$childTransition));
            C07160aT r0 = new C07160aT(this.$childTransition, (C17300uR) this.L$0, this.$shouldDisposeBlockUpdated$delegate);
            this.label = 1;
            if (A05.BFC(this, r0) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
