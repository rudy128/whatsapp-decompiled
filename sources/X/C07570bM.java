package X;

import androidx.compose.runtime.PausableMonotonicFrameClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {62, 63}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
/* renamed from: X.0bM  reason: invalid class name and case insensitive filesystem */
public final class C07570bM extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07570bM(PausableMonotonicFrameClock pausableMonotonicFrameClock, C30391dr r2) {
        super(r2);
        this.this$0 = pausableMonotonicFrameClock;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.CSE(this, (C22821Di) null);
    }
}
