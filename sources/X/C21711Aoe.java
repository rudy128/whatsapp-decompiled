package X;

import com.whatsapp.messaging.xmpp.XmppLifecycleWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLifecycleWorker", f = "XmppLifecycleWorker.kt", i = {0, 0, 0, 0, 0}, l = {139}, m = "waitUntilProcessingIsDone", n = {"this", "wasProcessingAtTheStart", "checkProgressSeconds", "startTime", "counter"}, s = {"L$0", "Z$0", "J$0", "J$1", "I$0"})
/* renamed from: X.Aoe  reason: case insensitive filesystem */
public final class C21711Aoe extends C30421du {
    public int I$0;
    public long J$0;
    public long J$1;
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppLifecycleWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21711Aoe(XmppLifecycleWorker xmppLifecycleWorker, C30391dr r2) {
        super(r2);
        this.this$0 = xmppLifecycleWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return XmppLifecycleWorker.A01(this.this$0, this);
    }
}
