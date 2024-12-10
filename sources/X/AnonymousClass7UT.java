package X;

import com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository", f = "AvatarCoinFlipProfilePhotoPosesRepository.kt", i = {0, 0}, l = {91}, m = "fetchPosesFromGraphQL", n = {"this", "qplInstanceKey"}, s = {"L$0", "I$0"})
/* renamed from: X.7UT  reason: invalid class name */
public final class AnonymousClass7UT extends C30421du {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarCoinFlipProfilePhotoPosesRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UT(AvatarCoinFlipProfilePhotoPosesRepository avatarCoinFlipProfilePhotoPosesRepository, C30391dr r2) {
        super(r2);
        this.this$0 = avatarCoinFlipProfilePhotoPosesRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AvatarCoinFlipProfilePhotoPosesRepository.A01(this.this$0, this, 0);
    }
}
