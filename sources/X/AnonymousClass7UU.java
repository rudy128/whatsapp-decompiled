package X;

import com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository", f = "AvatarCoinFlipProfilePhotoPosesRepository.kt", i = {0, 0}, l = {45}, m = "fetchProfilePhotoPoses", n = {"this", "qplInstanceKey"}, s = {"L$0", "I$0"})
/* renamed from: X.7UU  reason: invalid class name */
public final class AnonymousClass7UU extends C30421du {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarCoinFlipProfilePhotoPosesRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UU(AvatarCoinFlipProfilePhotoPosesRepository avatarCoinFlipProfilePhotoPosesRepository, C30391dr r2) {
        super(r2);
        this.this$0 = avatarCoinFlipProfilePhotoPosesRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03(this, 0, false);
    }
}
