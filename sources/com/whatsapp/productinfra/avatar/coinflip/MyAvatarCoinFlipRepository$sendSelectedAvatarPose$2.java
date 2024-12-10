package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.productinfra.avatar.data.graphql.profilephoto.set.AvatarCoinFlipSaveProfilePhotoPoseRequester;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository$sendSelectedAvatarPose$2", f = "MyAvatarCoinFlipRepository.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
public final class MyAvatarCoinFlipRepository$sendSelectedAvatarPose$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $activeAnimationId;
    public final /* synthetic */ String $backgroundId;
    public final /* synthetic */ String $passiveAnimationId;
    public final /* synthetic */ String $staticPoseId;
    public int label;
    public final /* synthetic */ MyAvatarCoinFlipRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyAvatarCoinFlipRepository$sendSelectedAvatarPose$2(MyAvatarCoinFlipRepository myAvatarCoinFlipRepository, String str, String str2, String str3, String str4, C30391dr r7) {
        super(2, r7);
        this.this$0 = myAvatarCoinFlipRepository;
        this.$staticPoseId = str;
        this.$backgroundId = str2;
        this.$passiveAnimationId = str3;
        this.$activeAnimationId = str4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new MyAvatarCoinFlipRepository$sendSelectedAvatarPose$2(this.this$0, this.$staticPoseId, this.$backgroundId, this.$passiveAnimationId, this.$activeAnimationId, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String str = this.$staticPoseId;
            String str2 = this.$backgroundId;
            String str3 = this.$passiveAnimationId;
            String str4 = this.$activeAnimationId;
            this.label = 1;
            if (((AvatarCoinFlipSaveProfilePhotoPoseRequester) this.this$0.A05.get()).A00(str, str2, str3, str4, this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MyAvatarCoinFlipRepository$sendSelectedAvatarPose$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
