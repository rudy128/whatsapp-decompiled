package com.whatsapp.profile.coinflip.nux;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11S;
import X.AnonymousClass17O;
import X.AnonymousClass1DF;
import X.AnonymousClass1E8;
import X.AnonymousClass1HF;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5U0;
import X.AnonymousClass5YI;
import X.C103365Ka;
import X.C103375Kb;
import X.C103385Kc;
import X.C156807ux;
import X.C156817uy;
import X.C18070vi;
import X.C18100vl;
import X.C201811d;
import X.C30391dr;
import X.C30451dy;
import X.C41561wd;
import X.C91634g0;
import X.C99274sY;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel;
import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel$getProfilePicBitmap$1;

public final class CoinFlipNUXBottomSheet extends Hilt_CoinFlipNUXBottomSheet {
    public View A00;
    public ProgressBar A01;
    public AnonymousClass11S A02;
    public WaImageView A03;
    public WaTextView A04;
    public AnonymousClass5YI A05;
    public AnonymousClass00H A06;
    public final C18100vl A07;
    public final AnonymousClass00H A08 = C201811d.A00(32849);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624548, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        boolean z;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A01 = (ProgressBar) AnonymousClass1HF.A06(view, 2131429172);
        this.A00 = AnonymousClass1HF.A06(view, 2131427987);
        this.A03 = AnonymousClass3MW.A0R(view, 2131434166);
        WaTextView A0T = AnonymousClass3MW.A0T(view, 2131433247);
        C18100vl r4 = this.A07;
        AnonymousClass11S r0 = ((CoinFlipProfilePicViewModel) r4.getValue()).A02;
        r0.A0I();
        AnonymousClass1E8 r02 = r0.A0D;
        if (r02 != null) {
            z = r02.A0g;
        } else {
            z = false;
        }
        Resources A09 = AnonymousClass3MZ.A09(this);
        int i = 2131888348;
        if (z) {
            i = 2131888347;
        }
        A0T.setText(A09.getString(i));
        this.A04 = A0T;
        int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168292);
        CoinFlipProfilePicViewModel coinFlipProfilePicViewModel = (CoinFlipProfilePicViewModel) r4.getValue();
        Context A14 = A14();
        AnonymousClass1OX A002 = C41561wd.A00(coinFlipProfilePicViewModel);
        CoinFlipProfilePicViewModel$getProfilePicBitmap$1 coinFlipProfilePicViewModel$getProfilePicBitmap$1 = new CoinFlipProfilePicViewModel$getProfilePicBitmap$1(A14, coinFlipProfilePicViewModel, (C30391dr) null, dimensionPixelSize);
        AnonymousClass1OR r3 = AnonymousClass1OR.A00;
        C30451dy.A02(AnonymousClass3MW.A0w(r3, coinFlipProfilePicViewModel$getProfilePicBitmap$1, A002), r3, new CoinFlipNUXBottomSheet$setProfilePic$2(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        WaImageView waImageView = this.A03;
        if (waImageView != null) {
            AnonymousClass3Ma.A1A(waImageView, this, 2);
        }
        AnonymousClass3Ma.A1A(view.findViewById(2131429167), this, 3);
        AnonymousClass3Ma.A1A(AnonymousClass1HF.A06(view, 2131429170), this, 4);
        C91634g0.A00(A1G(), ((CoinFlipProfilePicViewModel) r4.getValue()).A05, new AnonymousClass5U0(this), 20);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass5YI r2 = this.A05;
        if (r2 != null) {
            CoinFlipNUXBottomSheetLauncher coinFlipNUXBottomSheetLauncher = (CoinFlipNUXBottomSheetLauncher) r2;
            CoinFlipNUXBottomSheet coinFlipNUXBottomSheet = coinFlipNUXBottomSheetLauncher.A00;
            if (coinFlipNUXBottomSheet != null) {
                coinFlipNUXBottomSheet.A05 = null;
                coinFlipNUXBottomSheetLauncher.finish();
                return;
            }
            C18070vi.A11("coinFlipNUXBottomSheet");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.graphics.Bitmap r11, android.graphics.Bitmap r12, com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet r13, X.C30391dr r14) {
        /*
            boolean r0 = r14 instanceof X.C100494ub
            if (r0 == 0) goto L_0x0058
            r4 = r14
            X.4ub r4 = (X.C100494ub) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x005e
            java.lang.Object r13 = r4.L$0
            com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet r13 = (com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet) r13
            X.C30691eM.A01(r3)
        L_0x0024:
            X.00H r0 = r13.A08
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.17O r0 = (X.AnonymousClass17O) r0
            r0.A01()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0032:
            X.C30691eM.A01(r3)
            android.view.View r8 = r13.A00
            com.whatsapp.WaImageView r9 = r13.A03
            if (r8 == 0) goto L_0x004b
            if (r9 == 0) goto L_0x004b
            X.00H r0 = r13.A08
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.17O r5 = (X.AnonymousClass17O) r5
            r10 = 0
            r6 = r11
            r7 = r12
            r5.A02(r6, r7, r8, r9, r10)
        L_0x004b:
            r4.L$0 = r13
            r4.label = r1
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C62882s9.A00(r4, r0)
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x0058:
            X.4ub r4 = new X.4ub
            r4.<init>(r13, r14)
            goto L_0x0012
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet.A00(android.graphics.Bitmap, android.graphics.Bitmap, com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet, X.1dr):java.lang.Object");
    }

    public CoinFlipNUXBottomSheet() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103375Kb(new C103365Ka(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(CoinFlipProfilePicViewModel.class);
        this.A07 = C99274sY.A00(new C103385Kc(A002), new C156817uy(this, A002), new C156807ux(A002), A15);
    }

    public void A1r() {
        super.A1r();
        ((AnonymousClass17O) this.A08.get()).A00();
    }
}
