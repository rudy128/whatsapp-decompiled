package X;

import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0, 0}, l = {934}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
/* renamed from: X.0bI  reason: invalid class name and case insensitive filesystem */
public final class C07530bI extends C30421du {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07530bI(ScrollableNestedScrollConnection scrollableNestedScrollConnection, C30391dr r2) {
        super(r2);
        this.this$0 = scrollableNestedScrollConnection;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.C15(this, 0, 0);
    }
}
