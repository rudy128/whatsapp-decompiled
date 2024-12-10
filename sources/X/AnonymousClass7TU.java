package X;

import com.whatsapp.productinfra.avatar.data.AvatarStickersRepository;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository", f = "AvatarStickersRepository.kt", i = {}, l = {131}, m = "fetchAvatarStickerPackAwait-hUnOzRk", n = {}, s = {})
/* renamed from: X.7TU  reason: invalid class name */
public final class AnonymousClass7TU extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TU(AvatarStickersRepository avatarStickersRepository, C30391dr r2) {
        super(r2);
        this.this$0 = avatarStickersRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(AvatarStickersRepository.A00(this.this$0, (Integer) null, (Integer) null, (List) null, (Set) null, this, false));
    }
}
