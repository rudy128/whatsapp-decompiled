package X;

import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {105, 106}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
/* renamed from: X.0bR  reason: invalid class name and case insensitive filesystem */
public final class C07590bR extends C30421du {
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NestedScrollNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07590bR(NestedScrollNode nestedScrollNode, C30391dr r2) {
        super(r2);
        this.this$0 = nestedScrollNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.C15(this, 0, 0);
    }
}
