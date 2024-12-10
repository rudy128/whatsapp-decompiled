package X;

import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper", f = "GetGroupInfoProtocolHelper.kt", i = {0, 0}, l = {99}, m = "sendGetGroupInfoRequestXml", n = {"this", "callback"}, s = {"L$0", "L$1"})
/* renamed from: X.3FP  reason: invalid class name */
public final class AnonymousClass3FP extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FP(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = getGroupInfoProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GetGroupInfoProtocolHelper.A00(this.this$0, (AnonymousClass3L7) null, (AnonymousClass1EC) null, (String) null, this, 0);
    }
}
