package X;

import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers", f = "AvatarOnDemandStickers.kt", i = {0, 0, 1, 1, 1, 1, 2, 2}, l = {328, 348, 388}, m = "fetchAndEmitRemoteStickers", n = {"this", "qplInstanceKey", "this", "$this$fetchAndEmitRemoteStickers", "searchType", "qplInstanceKey", "this", "qplInstanceKey"}, s = {"L$0", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "I$0"})
/* renamed from: X.7V4  reason: invalid class name */
public final class AnonymousClass7V4 extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V4(AvatarOnDemandStickers avatarOnDemandStickers, C30391dr r2) {
        super(r2);
        this.this$0 = avatarOnDemandStickers;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AvatarOnDemandStickers.A01((C123096Tc) null, this.this$0, (List) null, this, (AnonymousClass1G2) null, 0);
    }
}
