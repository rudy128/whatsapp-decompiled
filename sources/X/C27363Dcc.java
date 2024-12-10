package X;

import com.whatsapp.calling.dialer.DialerHelper;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerHelper", f = "DialerHelper.kt", i = {}, l = {161}, m = "getOrCreateContactByJid", n = {}, s = {})
/* renamed from: X.Dcc  reason: case insensitive filesystem */
public final class C27363Dcc extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27363Dcc(DialerHelper dialerHelper, C30391dr r2) {
        super(r2);
        this.this$0 = dialerHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A05((UserJid) null, this);
    }
}
