package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
/* renamed from: X.4uh  reason: invalid class name and case insensitive filesystem */
public final class C100554uh extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnonymousClass5WL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100554uh(C30391dr r1, AnonymousClass5WL r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this, (C108475bl) null);
    }
}
