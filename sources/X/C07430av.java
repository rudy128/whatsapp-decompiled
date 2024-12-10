package X;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {86}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
/* renamed from: X.0av  reason: invalid class name and case insensitive filesystem */
public final class C07430av extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public C07430av(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGestureKt.A00((C17750vA) null, this);
    }
}
