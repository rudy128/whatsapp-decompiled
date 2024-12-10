package X;

import com.whatsapp.messaging.MessageClientSmaxWrapper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.MessageClientSmaxWrapper", f = "MessageClientSmaxWrapper.kt", i = {}, l = {18}, m = "sendIq", n = {}, s = {})
/* renamed from: X.AnC  reason: case insensitive filesystem */
public final class C21621AnC extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MessageClientSmaxWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21621AnC(MessageClientSmaxWrapper messageClientSmaxWrapper, C30391dr r2) {
        super(r2);
        this.this$0 = messageClientSmaxWrapper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C29621ca) null, (String) null, this, 0);
    }
}
