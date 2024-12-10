package X;

import com.whatsapp.calling.dialer.DialerHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerHelper", f = "DialerHelper.kt", i = {}, l = {89}, m = "getSanitizedPhoneNumber", n = {}, s = {})
/* renamed from: X.Dcs  reason: case insensitive filesystem */
public final class C27379Dcs extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27379Dcs(DialerHelper dialerHelper, C30391dr r2) {
        super(r2);
        this.this$0 = dialerHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DialerHelper.A00(this.this$0, (String) null, this);
    }
}
