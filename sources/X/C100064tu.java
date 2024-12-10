package X;

import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel", f = "CoinFlipProfilePicViewModel.kt", i = {}, l = {155}, m = "getAvatarPicBitmap", n = {}, s = {})
/* renamed from: X.4tu  reason: invalid class name and case insensitive filesystem */
public final class C100064tu extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoinFlipProfilePicViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100064tu(CoinFlipProfilePicViewModel coinFlipProfilePicViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = coinFlipProfilePicViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CoinFlipProfilePicViewModel.A00(this.this$0, this);
    }
}
