package X;

import com.whatsapp.messaging.xmpp.XmppLifecycleWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLifecycleWorker", f = "XmppLifecycleWorker.kt", i = {0}, l = {66}, m = "doWork", n = {"this"}, s = {"L$0"})
/* renamed from: X.And  reason: case insensitive filesystem */
public final class C21648And extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppLifecycleWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21648And(XmppLifecycleWorker xmppLifecycleWorker, C30391dr r2) {
        super(r2);
        this.this$0 = xmppLifecycleWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0A(this);
    }
}
