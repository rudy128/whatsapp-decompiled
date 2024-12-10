package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {195}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
/* renamed from: X.0ay  reason: invalid class name and case insensitive filesystem */
public final class C07460ay extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public C07460ay(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.A04((C17750vA) null, this);
    }
}
