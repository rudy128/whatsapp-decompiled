package X;

import android.content.Context;
import com.whatsapp.calling.dialer.DialerHelper;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerHelper", f = "DialerHelper.kt", i = {0, 0}, l = {149}, m = "startOutgoingVoiceCall", n = {"this", "context"}, s = {"L$0", "L$1"})
/* renamed from: X.DdJ  reason: case insensitive filesystem */
public final class C27402DdJ extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27402DdJ(DialerHelper dialerHelper, C30391dr r2) {
        super(r2);
        this.this$0 = dialerHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04((Context) null, (UserJid) null, this);
    }
}
