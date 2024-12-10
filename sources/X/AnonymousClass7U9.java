package X;

import com.whatsapp.productinfra.avatar.data.graphql.profilephoto.set.AvatarCoinFlipSaveProfilePhotoPoseRequester;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.graphql.profilephoto.set.AvatarCoinFlipSaveProfilePhotoPoseRequester", f = "AvatarCoinFlipSaveProfilePhotoPoseRequester.kt", i = {0}, l = {51}, m = "saveSelectedPoseToGraphQL", n = {"this"}, s = {"L$0"})
/* renamed from: X.7U9  reason: invalid class name */
public final class AnonymousClass7U9 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarCoinFlipSaveProfilePhotoPoseRequester this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U9(AvatarCoinFlipSaveProfilePhotoPoseRequester avatarCoinFlipSaveProfilePhotoPoseRequester, C30391dr r2) {
        super(r2);
        this.this$0 = avatarCoinFlipSaveProfilePhotoPoseRequester;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, (String) null, (String) null, (String) null, this);
    }
}
