package X;

import com.whatsapp.messaging.xmpp.XmppLogoutWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLogoutWorker", f = "XmppLogoutWorker.kt", i = {0}, l = {39}, m = "doWork", n = {"this"}, s = {"L$0"})
/* renamed from: X.Anf  reason: case insensitive filesystem */
public final class C21650Anf extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21650Anf(XmppLogoutWorker xmppLogoutWorker, C30391dr r2) {
        super(r2);
        this.this$0 = xmppLogoutWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0A(this);
    }
}
