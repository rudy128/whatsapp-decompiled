package X;

import com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper", f = "GetGroupProfilePicturesProtocolHelper.kt", i = {}, l = {132}, m = "sendGetGroupProfilePicturesRequest-BWLJW6A", n = {}, s = {})
/* renamed from: X.An9  reason: case insensitive filesystem */
public final class C21618An9 extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetGroupProfilePicturesProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21618An9(GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = getGroupProfilePicturesProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A01((AnonymousClass1EC) null, (AnonymousClass1EC) null, (Map) null, this));
    }
}
