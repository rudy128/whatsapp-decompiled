package X;

import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository", f = "AvatarReactionRepository.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {189, 211, 229}, m = "fetchAvatarReactionStickersInParallel", n = {"this", "scope", "listener", "avatarReactionsStableIdList", "isAnimatedAvatarsEnabled", "this", "listener", "isAnimatedAvatarsEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "Z$0"})
/* renamed from: X.7V9  reason: invalid class name */
public final class AnonymousClass7V9 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V9(AvatarReactionRepository avatarReactionRepository, C30391dr r2) {
        super(r2);
        this.this$0 = avatarReactionRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((WeakReference) null, this, (AnonymousClass1OX) null, false);
    }
}
