package X;

import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers", f = "AvatarOnDemandStickers.kt", i = {0, 0}, l = {416}, m = "initializeSearchIfRequired", n = {"this", "searchType"}, s = {"L$0", "L$1"})
/* renamed from: X.7UV  reason: invalid class name */
public final class AnonymousClass7UV extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UV(AvatarOnDemandStickers avatarOnDemandStickers, C30391dr r2) {
        super(r2);
        this.this$0 = avatarOnDemandStickers;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AvatarOnDemandStickers.A02((C123096Tc) null, this.this$0, this, 0);
    }
}
