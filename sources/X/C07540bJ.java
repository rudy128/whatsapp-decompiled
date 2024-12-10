package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {279}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
/* renamed from: X.0bJ  reason: invalid class name and case insensitive filesystem */
public final class C07540bJ extends C30421du {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public C07540bJ(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.A01((C17750vA) null, (AnonymousClass0CQ) null, this, false);
    }
}
