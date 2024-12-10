package X;

import com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository", f = "AvatarAREffectRepository.kt", i = {}, l = {40}, m = "fetchAvatarArEffectAwait", n = {}, s = {})
/* renamed from: X.AnG  reason: case insensitive filesystem */
public final class C21625AnG extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarAREffectRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21625AnG(AvatarAREffectRepository avatarAREffectRepository, C30391dr r2) {
        super(r2);
        this.this$0 = avatarAREffectRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AvatarAREffectRepository.A00(this.this$0, (String) null, this);
    }
}
