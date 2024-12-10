package X;

import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration", f = "AvatarSquidConfiguration.kt", i = {0, 0, 0}, l = {107}, m = "shouldShowSquidUpsell", n = {"this", "entryPoint", "phase"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.7Uo  reason: invalid class name and case insensitive filesystem */
public final class C147807Uo extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarSquidConfiguration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147807Uo(AvatarSquidConfiguration avatarSquidConfiguration, C30391dr r2) {
        super(r2);
        this.this$0 = avatarSquidConfiguration;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((AnonymousClass6RS) null, this);
    }
}
