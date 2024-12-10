package X;

import com.whatsapp.avatar.prefetch.AvatarPrefetchController;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.prefetch.AvatarPrefetchController", f = "AvatarPrefetchController.kt", i = {0, 0, 0}, l = {90, 91}, m = "prefetchAvatarAndAssets", n = {"this", "$this$prefetchAvatarAndAssets", "params"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.Dde  reason: case insensitive filesystem */
public final class C27423Dde extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarPrefetchController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27423Dde(AvatarPrefetchController avatarPrefetchController, C30391dr r2) {
        super(r2);
        this.this$0 = avatarPrefetchController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AvatarPrefetchController.A00((C26651D8a) null, this.this$0, (C25236CbX) null, this);
    }
}
