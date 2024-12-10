package com.whatsapp.profile.coinflip.profilepic;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass461;
import X.AnonymousClass462;
import X.AnonymousClass463;
import X.AnonymousClass6SM;
import X.C17890vO;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.graphics.Bitmap;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel$fetchAvatarProfilePic$1", f = "CoinFlipProfilePicViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipProfilePicViewModel$fetchAvatarProfilePic$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $invalidateCache;
    public int label;
    public final /* synthetic */ CoinFlipProfilePicViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipProfilePicViewModel$fetchAvatarProfilePic$1(CoinFlipProfilePicViewModel coinFlipProfilePicViewModel, C30391dr r3, boolean z) {
        super(2, r3);
        this.this$0 = coinFlipProfilePicViewModel;
        this.$invalidateCache = z;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CoinFlipProfilePicViewModel$fetchAvatarProfilePic$1(this.this$0, r5, this.$invalidateCache);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A01.A0E(AnonymousClass463.A00);
            try {
                MyAvatarCoinFlipRepository myAvatarCoinFlipRepository = this.this$0.A04;
                boolean z = this.$invalidateCache;
                this.label = 1;
                obj = myAvatarCoinFlipRepository.A03(this, z);
                if (obj == r3) {
                    return r3;
                }
            } catch (AnonymousClass6SM e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("CoinFlipProfilePicViewModel/fetchAvatarProfilePic {");
                C17890vO.A19(A10, e.getMessage());
                this.this$0.A01.A0E(new AnonymousClass461(e));
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A01.A0E(new AnonymousClass462((Bitmap) obj, this.$invalidateCache));
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipProfilePicViewModel$fetchAvatarProfilePic$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
