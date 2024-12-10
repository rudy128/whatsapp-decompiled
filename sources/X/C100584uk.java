package X;

import com.whatsapp.calling.areffects.StickyEffectsStateSaver;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.StickyEffectsStateSaver", f = "StickyEffectsStateSaver.kt", i = {0, 0}, l = {85}, m = "getStateToRestore", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* renamed from: X.4uk  reason: invalid class name and case insensitive filesystem */
public final class C100584uk extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StickyEffectsStateSaver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100584uk(StickyEffectsStateSaver stickyEffectsStateSaver, C30391dr r2) {
        super(r2);
        this.this$0 = stickyEffectsStateSaver;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BZe((String) null, this);
    }
}
