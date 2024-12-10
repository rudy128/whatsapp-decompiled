package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {204}, m = "emit", n = {}, s = {})
/* renamed from: X.4tv  reason: invalid class name and case insensitive filesystem */
public final class C100074tv extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C99614tB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100074tv(C99614tB r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
