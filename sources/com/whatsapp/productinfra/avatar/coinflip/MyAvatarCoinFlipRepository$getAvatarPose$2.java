package com.whatsapp.productinfra.avatar.coinflip;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository$getAvatarPose$2", f = "MyAvatarCoinFlipRepository.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
public final class MyAvatarCoinFlipRepository$getAvatarPose$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $invalidateCache;
    public int label;
    public final /* synthetic */ MyAvatarCoinFlipRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyAvatarCoinFlipRepository$getAvatarPose$2(MyAvatarCoinFlipRepository myAvatarCoinFlipRepository, C30391dr r3, boolean z) {
        super(2, r3);
        this.$invalidateCache = z;
        this.this$0 = myAvatarCoinFlipRepository;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MyAvatarCoinFlipRepository$getAvatarPose$2(this.this$0, r5, this.$invalidateCache);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean z = this.$invalidateCache;
            MyAvatarCoinFlipRepository myAvatarCoinFlipRepository = this.this$0;
            if (z) {
                this.label = 1;
            } else {
                obj = myAvatarCoinFlipRepository.A01();
                if (obj == null) {
                    myAvatarCoinFlipRepository = this.this$0;
                    this.label = 2;
                }
            }
            obj = myAvatarCoinFlipRepository.A02(this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MyAvatarCoinFlipRepository$getAvatarPose$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
