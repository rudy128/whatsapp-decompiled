package X;

import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper", f = "GetGroupInfoProtocolHelper.kt", i = {0, 0, 0}, l = {143}, m = "sendGetGroupInfoRequestMex-BWLJW6A", n = {"this", "callback", "syncDeviceType"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: X.3FS  reason: invalid class name */
public final class AnonymousClass3FS extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FS(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = getGroupInfoProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A01 = GetGroupInfoProtocolHelper.A01(this.this$0, (AnonymousClass3L7) null, (AnonymousClass1EC) null, this, 0);
        if (A01 != C31751g4.COROUTINE_SUSPENDED) {
            return new C30671eK(A01);
        }
        return A01;
    }
}
