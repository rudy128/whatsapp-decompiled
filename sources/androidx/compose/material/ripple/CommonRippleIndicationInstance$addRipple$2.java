package androidx.compose.material.ripple;

import X.AnonymousClass000;
import X.AnonymousClass07Q;
import X.AnonymousClass0Uk;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class CommonRippleIndicationInstance$addRipple$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0Uk $interaction;
    public final /* synthetic */ RippleAnimation $rippleAnimation;
    public int label;
    public final /* synthetic */ AnonymousClass07Q this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(AnonymousClass0Uk r2, AnonymousClass07Q r3, RippleAnimation rippleAnimation, C30391dr r5) {
        super(2, r5);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = r3;
        this.$interaction = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((CommonRippleIndicationInstance$addRipple$2) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        RippleAnimation rippleAnimation = this.$rippleAnimation;
        return new CommonRippleIndicationInstance$addRipple$2(this.$interaction, this.this$0, rippleAnimation, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            RippleAnimation rippleAnimation = this.$rippleAnimation;
            this.label = 1;
            if (rippleAnimation.A03(this) == A03) {
                return A03;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                this.this$0.A01.remove(this.$interaction);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A01.remove(this.$interaction);
        return C27621Wu.A00;
    }
}
