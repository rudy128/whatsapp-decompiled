package com.whatsapp.profile.coinflip.profilepic;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel$getProfilePicBitmap$1", f = "CoinFlipProfilePicViewModel.kt", i = {1}, l = {75, 76}, m = "invokeSuspend", n = {"profilePic"}, s = {"L$2"})
public final class CoinFlipProfilePicViewModel$getProfilePicBitmap$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $imageSize;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ CoinFlipProfilePicViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipProfilePicViewModel$getProfilePicBitmap$1(Context context, CoinFlipProfilePicViewModel coinFlipProfilePicViewModel, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = coinFlipProfilePicViewModel;
        this.$context = context;
        this.$imageSize = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CoinFlipProfilePicViewModel$getProfilePicBitmap$1(this.$context, this.this$0, r6, this.$imageSize);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r11 == r3) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 == r1) goto L_0x0063
            if (r0 != r2) goto L_0x007f
            java.lang.Object r2 = r10.L$2
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r7 = r10.L$1
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r7 = (com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel) r7
            X.C30691eM.A01(r11)
        L_0x0017:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r2 == 0) goto L_0x0030
            X.1G4 r1 = r7.A07
            if (r11 == 0) goto L_0x002a
            X.45g r0 = new X.45g
            r0.<init>(r2, r11)
        L_0x0024:
            r1.setValue(r0)
        L_0x0027:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002a:
            X.45f r0 = new X.45f
            r0.<init>(r2)
            goto L_0x0024
        L_0x0030:
            if (r11 == 0) goto L_0x0027
            X.1G4 r1 = r7.A07
            X.45e r0 = new X.45e
            r0.<init>(r11)
            goto L_0x0024
        L_0x003a:
            X.C30691eM.A01(r11)
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r0 = r10.this$0
            X.11S r0 = r0.A02
            r0.A0I()
            X.1E8 r6 = r0.A0D
            if (r6 == 0) goto L_0x0027
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r7 = r10.this$0
            android.content.Context r5 = r10.$context
            int r9 = r10.$imageSize
            r10.L$0 = r6
            r10.L$1 = r7
            r10.label = r1
            X.0wl r0 = r7.A06
            r8 = 0
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel$getProfilePicBitmap$3 r4 = new com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel$getProfilePicBitmap$3
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = X.C30451dy.A00(r10, r0, r4)
            if (r11 != r3) goto L_0x006c
        L_0x0062:
            return r3
        L_0x0063:
            java.lang.Object r7 = r10.L$1
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r7 = (com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel) r7
            java.lang.Object r6 = r10.L$0
            X.C30691eM.A01(r11)
        L_0x006c:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            r10.L$0 = r6
            r10.L$1 = r7
            r10.L$2 = r11
            r10.label = r2
            java.lang.Object r0 = com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel.A00(r7, r10)
            if (r0 == r3) goto L_0x0062
            r2 = r11
            r11 = r0
            goto L_0x0017
        L_0x007f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel$getProfilePicBitmap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipProfilePicViewModel$getProfilePicBitmap$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
