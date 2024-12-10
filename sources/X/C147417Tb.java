package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {79}, m = "emit", n = {}, s = {})
/* renamed from: X.7Tb  reason: invalid class name and case insensitive filesystem */
public final class C147417Tb extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C147277Sn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147417Tb(C147277Sn r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(this, (C23421Fz) null);
    }
}
