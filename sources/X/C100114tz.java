package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
/* renamed from: X.4tz  reason: invalid class name and case insensitive filesystem */
public final class C100114tz extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C99564t6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100114tz(C99564t6 r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
