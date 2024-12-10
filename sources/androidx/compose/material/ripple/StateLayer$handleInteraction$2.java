package androidx.compose.material.ripple;

import X.AnonymousClass000;
import X.AnonymousClass0Q3;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C03570Iu;
import X.C16000rY;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
public final class StateLayer$handleInteraction$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C16000rY $outgoingAnimationSpec;
    public int label;
    public final /* synthetic */ C03570Iu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$2(C16000rY r2, C03570Iu r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$outgoingAnimationSpec = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((StateLayer$handleInteraction$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StateLayer$handleInteraction$2(this.$outgoingAnimationSpec, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass0Q3 r2 = this.this$0.A01;
            Float f = new Float(0.0f);
            C16000rY r0 = this.$outgoingAnimationSpec;
            this.label = 1;
            if (r2.A06(r0, f, r2.A05(), this) == A03) {
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
