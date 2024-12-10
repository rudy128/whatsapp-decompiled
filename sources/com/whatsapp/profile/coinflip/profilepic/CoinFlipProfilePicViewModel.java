package com.whatsapp.profile.coinflip.profilepic;

import X.AnonymousClass11S;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C18600wl;
import X.C24771Lp;
import X.C27021Uk;
import X.C27191Vc;
import X.C34071js;
import X.C41731wy;
import X.C823145h;
import android.graphics.Bitmap;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;

public final class CoinFlipProfilePicViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass11S A02;
    public final C27191Vc A03;
    public final MyAvatarCoinFlipRepository A04;
    public final C41731wy A05 = AnonymousClass3MW.A0o();
    public final C18600wl A06;
    public final AnonymousClass1G4 A07;
    public final AnonymousClass1G1 A08;
    public final C27021Uk A09;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r5, X.C30391dr r6) {
        /*
            boolean r0 = r6 instanceof X.C100064tu
            if (r0 == 0) goto L_0x001e
            r4 = r6
            X.4tu r4 = (X.C100064tu) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r2) goto L_0x0028
            goto L_0x0024
        L_0x001e:
            X.4tu r4 = new X.4tu
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0024:
            X.C30691eM.A01(r1)     // Catch:{ 6SM -> 0x0044 }
            return r1
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r1)
            X.1Uk r0 = r5.A09
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0055
            com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository r1 = r5.A04     // Catch:{ 6SM -> 0x0044 }
            r4.label = r2     // Catch:{ 6SM -> 0x0044 }
            r0 = 0
            java.lang.Object r1 = r1.A03(r4, r0)     // Catch:{ 6SM -> 0x0044 }
            if (r1 != r3) goto L_0x0056
            return r3
        L_0x0044:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CoinFlipProfilePicViewModel/getProfilePicBitmap {"
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            X.C17890vO.A19(r1, r0)
        L_0x0055:
            r1 = 0
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel.A00(com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel, X.1dr):java.lang.Object");
    }

    public final void A0T(Bitmap bitmap) {
        ((C24771Lp) this.A04.A04.get()).A00().A0F("avatar_pose_preview", bitmap);
    }

    public CoinFlipProfilePicViewModel(AnonymousClass11S r2, C27191Vc r3, MyAvatarCoinFlipRepository myAvatarCoinFlipRepository, C27021Uk r5, C18600wl r6) {
        C18070vi.A0w(r2, r5, myAvatarCoinFlipRepository, r3, r6);
        this.A02 = r2;
        this.A09 = r5;
        this.A04 = myAvatarCoinFlipRepository;
        this.A03 = r3;
        this.A06 = r6;
        AnonymousClass1G7 A002 = C34071js.A00(C823145h.A00);
        this.A07 = A002;
        this.A08 = A002;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A01 = A0L;
        this.A00 = A0L;
    }
}
