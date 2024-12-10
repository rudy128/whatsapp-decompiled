package com.whatsapp.avatar.profilephotocf;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass6EH;
import X.AnonymousClass70I;
import X.AnonymousClass7L4;
import X.C108945cZ;
import X.C115485u5;
import X.C115495u6;
import X.C133306oX;
import X.C134896rK;
import X.C135456sE;
import X.C136236tU;
import X.C140106zx;
import X.C148297hD;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C201811d;
import X.C30391dr;
import X.C41561wd;
import X.C41731wy;
import X.C72473Md;
import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.util.List;

public final class AvatarCoinFlipProfilePhotoViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00;
    public final AnonymousClass7L4 A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass118 A03;
    public final C41731wy A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09 = C201811d.A00(32837);
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C18100vl A0E;
    public final C18600wl A0F;
    public final AnonymousClass1OX A0G;

    public static final void A04(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel) {
        C115485u5[] r2 = new C115485u5[5];
        r2[0] = new C115485u5((C115495u6) null, true);
        r2[1] = new C115485u5((C115495u6) null, false);
        r2[2] = new C115485u5((C115495u6) null, false);
        r2[3] = new C115485u5((C115495u6) null, false);
        List A0O = C18070vi.A0O(new C115485u5((C115495u6) null, false), r2, 4);
        C18460wS r0 = C18460wS.A00;
        avatarCoinFlipProfilePhotoViewModel.A00.A0F(new C140106zx((Bitmap) null, (Bitmap) null, (C135456sE) null, (C136236tU) null, new C134896rK(r0, r0), A0O, A0O, false, true, false));
    }

    public static final void A05(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel, String str, int i, boolean z) {
        AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel2 = avatarCoinFlipProfilePhotoViewModel;
        AnonymousClass00H r2 = avatarCoinFlipProfilePhotoViewModel.A08;
        int A012 = C108945cZ.A0q(r2).A01();
        AnonymousClass70I.A00(C108945cZ.A0q(r2), r2, "fetch_poses", A012).A06(AnonymousClass6EH.A00, str, A012);
        AnonymousClass3MX.A1Q(new AvatarCoinFlipProfilePhotoViewModel$fetchPoses$1(avatarCoinFlipProfilePhotoViewModel2, (C30391dr) null, A012, i, z), C41561wd.A00(avatarCoinFlipProfilePhotoViewModel2));
    }

    public AvatarCoinFlipProfilePhotoViewModel(AnonymousClass11S r12, AnonymousClass118 r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, C18600wl r22, AnonymousClass1OX r23) {
        AnonymousClass00H r7 = r16;
        C18070vi.A0w(r12, r13, r14, r15, r7);
        AnonymousClass00H r6 = r17;
        AnonymousClass00H r5 = r18;
        AnonymousClass00H r4 = r19;
        AnonymousClass00H r3 = r20;
        C18600wl r1 = r22;
        C18070vi.A0x(r6, r5, r1, r4, r3);
        AnonymousClass00H r2 = r21;
        AnonymousClass1OX r0 = r23;
        C72473Md.A1L(r0, r2);
        this.A02 = r12;
        this.A03 = r13;
        this.A07 = r14;
        this.A0B = r15;
        this.A06 = r7;
        this.A05 = r6;
        this.A0C = r5;
        this.A0F = r1;
        this.A08 = r4;
        this.A0D = r3;
        this.A0G = r0;
        this.A0A = r2;
        C18460wS r62 = C18460wS.A00;
        this.A00 = AnonymousClass3MW.A0M(new C140106zx((Bitmap) null, (Bitmap) null, (C135456sE) null, (C136236tU) null, new C134896rK(r62, r62), r62, r62, false, false, false));
        this.A0E = AnonymousClass1DF.A01(new C148297hD(this));
        this.A04 = AnonymousClass3MW.A0o();
        this.A01 = new AnonymousClass7L4(this, 1);
    }

    public static final Bitmap A00(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel, C135456sE r1, C136236tU r2) {
        if (r2 == null || r1 == null) {
            Log.i("AvatarCoinFlipProfilePhotoViewModel/onAvatarPoseClicked(null value)");
            return null;
        }
        return ((C133306oX) avatarCoinFlipProfilePhotoViewModel.A09.get()).A00(r2.A00, r1.A00);
    }

    public static final C140106zx A03(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel) {
        C140106zx r0 = (C140106zx) avatarCoinFlipProfilePhotoViewModel.A00.A06();
        if (r0 != null) {
            return r0;
        }
        Log.e("AvatarCoinFlipProfilePhotoViewModel/viewStateLiveData is null");
        throw AnonymousClass000.A0n("viewStateLiveData value null");
    }

    public void A0S() {
        C17880vN.A0V(this.A06).unregisterObserver(this.A01);
        AnonymousClass3MW.A1X(this.A0F, new AvatarCoinFlipProfilePhotoViewModel$onCleared$1(this, (C30391dr) null), this.A0G);
    }
}
