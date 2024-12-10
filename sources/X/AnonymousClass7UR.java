package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository", f = "ContactAvatarCoinFlipRepository.kt", i = {0, 0}, l = {81}, m = "getContactAvatarPicFromNetwork", n = {"this", "jid"}, s = {"L$0", "L$1"})
/* renamed from: X.7UR  reason: invalid class name */
public final class AnonymousClass7UR extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ContactAvatarCoinFlipRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UR(ContactAvatarCoinFlipRepository contactAvatarCoinFlipRepository, C30391dr r2) {
        super(r2);
        this.this$0 = contactAvatarCoinFlipRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ContactAvatarCoinFlipRepository.A01((UserJid) null, this.this$0, this);
    }
}
