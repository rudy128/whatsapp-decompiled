package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {405}, m = "collect", n = {}, s = {})
/* renamed from: X.7Tc  reason: invalid class name and case insensitive filesystem */
public final class C147427Tc extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C147287So this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147427Tc(C30391dr r1, C147287So r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BFC(this, (AnonymousClass1G2) null);
    }
}
