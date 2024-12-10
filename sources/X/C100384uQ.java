package X;

import com.whatsapp.extensions.FlowExtKt$debounceSelectively$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.FlowExtKt$debounceSelectively$1$1", f = "FlowExt.kt", i = {0}, l = {44}, m = "emit", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uQ  reason: invalid class name and case insensitive filesystem */
public final class C100384uQ extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowExtKt$debounceSelectively$1.AnonymousClass1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100384uQ(FlowExtKt$debounceSelectively$1.AnonymousClass1 r1, C30391dr r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BJt((Object) null, this);
    }
}
