package X;

import androidx.compose.material.ripple.RippleAnimation;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {80, 82, 83}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.0bD  reason: invalid class name */
public final class AnonymousClass0bD extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RippleAnimation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0bD(RippleAnimation rippleAnimation, C30391dr r2) {
        super(r2);
        this.this$0 = rippleAnimation;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03(this);
    }
}
