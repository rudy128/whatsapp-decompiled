package com.whatsapp.avatar.profilephotocf;

import X.AnonymousClass000;
import X.AnonymousClass1E8;
import X.AnonymousClass1OS;
import X.C27191Vc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1", f = "AvatarCoinFlipProfilePhotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E8 $it;
    public int label;
    public final /* synthetic */ AvatarCoinFlipProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1(AnonymousClass1E8 r2, AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarCoinFlipProfilePhotoViewModel;
        this.$it = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1(this.$it, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Context context = this.this$0.A03.A00;
            return ((C27191Vc) this.this$0.A0C.get()).A04(context, this.$it, "CoinFlipPoses", -1.0f, context.getResources().getDimensionPixelSize(2131165923), true);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarCoinFlipProfilePhotoViewModel$getProfilePicBitmap$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
