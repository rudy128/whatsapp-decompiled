package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
/* renamed from: X.0bV  reason: invalid class name and case insensitive filesystem */
public final class C07630bV extends C30421du {
    public float F$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07630bV(UpdatableAnimationState updatableAnimationState, C30391dr r2) {
        super(r2);
        this.this$0 = updatableAnimationState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this, (C18090vk) null, (C22821Di) null);
    }
}
