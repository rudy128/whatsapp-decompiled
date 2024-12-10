package X;

import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper", f = "GetGroupInfoProtocolHelper.kt", i = {}, l = {174}, m = "sendGetGroupInfoRequest-yxL6bBk", n = {}, s = {})
/* renamed from: X.3FA  reason: invalid class name */
public final class AnonymousClass3FA extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FA(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = getGroupInfoProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A02 = GetGroupInfoProtocolHelper.A02(this.this$0, (AnonymousClass1EC) null, (String) null, (String) null, this, 0);
        if (A02 != C31751g4.COROUTINE_SUSPENDED) {
            return new C30671eK(A02);
        }
        return A02;
    }
}
