package X;

import com.whatsapp.calling.areffects.CallSessionEffectsStateSaver;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.CallSessionEffectsStateSaver", f = "CallSessionEffectsStateSaver.kt", i = {0, 0, 0}, l = {98}, m = "getStateToRestore", n = {"this", "productSessionId", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.4v2  reason: invalid class name and case insensitive filesystem */
public final class C100764v2 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallSessionEffectsStateSaver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100764v2(CallSessionEffectsStateSaver callSessionEffectsStateSaver, C30391dr r2) {
        super(r2);
        this.this$0 = callSessionEffectsStateSaver;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BZe((String) null, this);
    }
}
