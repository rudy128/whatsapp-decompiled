package X;

import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository", f = "MyAvatarCoinFlipRepository.kt", i = {0, 0}, l = {81}, m = "getAvatarPoseFromNetwork", n = {"this", "$this$getAvatarPoseFromNetwork_u24lambda_u240"}, s = {"L$0", "L$1"})
/* renamed from: X.7US  reason: invalid class name */
public final class AnonymousClass7US extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MyAvatarCoinFlipRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7US(MyAvatarCoinFlipRepository myAvatarCoinFlipRepository, C30391dr r2) {
        super(r2);
        this.this$0 = myAvatarCoinFlipRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(this);
    }
}
