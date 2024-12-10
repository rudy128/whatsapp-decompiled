package X;

import com.whatsapp.calling.dialer.DialerHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerHelper", f = "DialerHelper.kt", i = {}, l = {65}, m = "getDefaultRegionCodeOrUnknown", n = {}, s = {})
/* renamed from: X.Dcb  reason: case insensitive filesystem */
public final class C27362Dcb extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27362Dcb(DialerHelper dialerHelper, C30391dr r2) {
        super(r2);
        this.this$0 = dialerHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DialerHelper.A03(this.this$0, this);
    }
}
