package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {438, 441}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
/* renamed from: X.Dd8  reason: case insensitive filesystem */
public final class C27395Dd8 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27175DXk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27395Dd8(C30391dr r1, C27175DXk dXk) {
        super(r1);
        this.this$0 = dXk;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C27175DXk.A02(this, this.this$0);
    }
}
