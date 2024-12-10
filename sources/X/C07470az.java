package X;

import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {225}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
/* renamed from: X.0az  reason: invalid class name and case insensitive filesystem */
public final class C07470az extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public C07470az(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SelectionGesturesKt.A06((C17750vA) null, this);
    }
}
