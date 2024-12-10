package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {154}, m = "emit", n = {}, s = {})
/* renamed from: X.4ty  reason: invalid class name and case insensitive filesystem */
public final class C100104ty extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C99574t7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100104ty(C99574t7 r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this, 0);
    }
}
