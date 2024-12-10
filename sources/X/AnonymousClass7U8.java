package X;

import com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.graphql.profilephoto.get.AvatarCoinFlipGetProfilePhotoPosesDataRequester", f = "AvatarCoinFlipGetProfilePhotoPosesDataRequester.kt", i = {0}, l = {52}, m = "fetchPosesFromGraphQL", n = {"this"}, s = {"L$0"})
/* renamed from: X.7U8  reason: invalid class name */
public final class AnonymousClass7U8 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarCoinFlipGetProfilePhotoPosesDataRequester this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U8(AvatarCoinFlipGetProfilePhotoPosesDataRequester avatarCoinFlipGetProfilePhotoPosesDataRequester, C30391dr r2) {
        super(r2);
        this.this$0 = avatarCoinFlipGetProfilePhotoPosesDataRequester;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(this);
    }
}
