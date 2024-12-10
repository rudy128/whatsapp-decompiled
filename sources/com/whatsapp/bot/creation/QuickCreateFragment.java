package com.whatsapp.bot.creation;

import X.AnonymousClass00H;
import X.AnonymousClass1KB;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass5M6;
import X.AnonymousClass5M7;
import X.C101035Bb;
import X.C101045Bc;
import X.C101055Bd;
import X.C101065Be;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C77543qX;
import X.C89474cW;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import com.whatsapp.WaTextView;
import com.whatsapp.bot.creation.service.AiCreationPhotoLoader;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.wds.components.button.WDSButton;

public final class QuickCreateFragment extends Hilt_QuickCreateFragment {
    public ProgressBar A00;
    public AnonymousClass1KB A01;
    public WaTextView A02;
    public WaTextView A03;
    public WaTextView A04;
    public C89474cW A05;
    public AiCreationPhotoLoader A06;
    public ThumbnailButton A07;
    public WDSButton A08;
    public AnonymousClass00H A09;
    public WDSButton A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        A1D().setTitle(A1H(2131886611));
        this.A03 = AnonymousClass3MW.A0U(view, 2131427717);
        this.A04 = AnonymousClass3MW.A0U(view, 2131427720);
        this.A02 = AnonymousClass3MW.A0U(view, 2131427711);
        this.A00 = (ProgressBar) view.findViewById(2131427719);
        this.A07 = (ThumbnailButton) view.findViewById(2131427718);
        WDSButton A0r = AnonymousClass3MW.A0r(view, 2131428431);
        this.A08 = A0r;
        if (A0r != null) {
            A0r.setEnabled(false);
        }
        this.A0A = AnonymousClass3MW.A0r(view, 2131428432);
        AnonymousClass3MX.A1Q(new QuickCreateFragment$onViewCreated$1(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.bot.creation.QuickCreateFragment r13, X.C30391dr r14) {
        /*
            boolean r0 = r14 instanceof X.C100204u8
            if (r0 == 0) goto L_0x00c4
            r3 = r14
            X.4u8 r3 = (X.C100204u8) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c4
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r5 = r3.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x007c
            if (r0 != r2) goto L_0x00d5
            java.lang.Object r13 = r3.L$0
            com.whatsapp.bot.creation.QuickCreateFragment r13 = (com.whatsapp.bot.creation.QuickCreateFragment) r13
            X.C30691eM.A01(r5)
        L_0x0024:
            java.lang.String r5 = (java.lang.String) r5
            android.widget.ProgressBar r0 = r13.A00
            X.C72453Mb.A1D(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A08
            if (r0 == 0) goto L_0x0032
            r0.setEnabled(r2)
        L_0x0032:
            com.whatsapp.components.button.ThumbnailButton r0 = r13.A07
            if (r0 == 0) goto L_0x0039
            r0.setEnabled(r2)
        L_0x0039:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "QuickCreateFragment/created AI: "
            X.C17900vP.A0f(r0, r5, r1)
            if (r5 != 0) goto L_0x0051
            X.1KB r1 = r13.A01
            if (r1 == 0) goto L_0x00cb
            r0 = 2131886602(0x7f12020a, float:1.9407787E38)
            r1.A08(r0, r2)
        L_0x004e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0051:
            X.2qw r0 = X.C42711yc.A01
            X.1yc r2 = r0.A02(r5)
            if (r2 != 0) goto L_0x005f
            java.lang.String r0 = "QuickCreateFragment/created AI but chatJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004e
        L_0x005f:
            X.00H r0 = r13.A09
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r1 = r0.get()
            X.1LU r1 = (X.AnonymousClass1LU) r1
            android.content.Context r0 = r13.A14()
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r0, r1, r2)
            r13.A1k(r0)
            X.1FL r0 = r13.A1D()
            r0.finish()
            goto L_0x004e
        L_0x007c:
            X.C30691eM.A01(r5)
            java.lang.String r0 = "QuickCreateFragment/completing AI..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.widget.ProgressBar r0 = r13.A00
            r1 = 0
            if (r0 == 0) goto L_0x008c
            r0.setVisibility(r1)
        L_0x008c:
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A08
            if (r0 == 0) goto L_0x0093
            r0.setEnabled(r1)
        L_0x0093:
            com.whatsapp.components.button.ThumbnailButton r0 = r13.A07
            if (r0 == 0) goto L_0x009a
            r0.setEnabled(r1)
        L_0x009a:
            X.0vl r0 = r13.A0B
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.bot.creation.viewmodel.AiCreationViewModel r1 = (com.whatsapp.bot.creation.viewmodel.AiCreationViewModel) r1
            X.4cW r0 = r13.A05
            if (r0 == 0) goto L_0x004e
            java.lang.String r6 = r0.A02
            java.lang.String r7 = r0.A05
            java.lang.String r8 = r0.A04
            java.lang.String r9 = r0.A01
            java.lang.String r10 = r0.A07
            java.lang.String r11 = r0.A06
            java.lang.String r12 = r0.A03
            X.4V7 r5 = new X.4V7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.L$0 = r13
            r3.label = r2
            java.lang.Object r5 = r1.A0T(r5, r3)
            if (r5 != r4) goto L_0x0024
            return r4
        L_0x00c4:
            X.4u8 r3 = new X.4u8
            r3.<init>(r13, r14)
            goto L_0x0012
        L_0x00cb:
            java.lang.String r0 = "globalUI"
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r0 = "waIntents"
        L_0x00d0:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.creation.QuickCreateFragment.A00(com.whatsapp.bot.creation.QuickCreateFragment, X.1dr):java.lang.Object");
    }

    public QuickCreateFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AiCreationViewModel.class);
        this.A0B = C99274sY.A00(new C101035Bb(this), new C101045Bc(this), new AnonymousClass5M6(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(C77543qX.class);
        this.A0C = C99274sY.A00(new C101055Bd(this), new C101065Be(this), new AnonymousClass5M7(this), A152);
    }

    public void A1s() {
        super.A1s();
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        ThumbnailButton thumbnailButton = this.A07;
        if (thumbnailButton != null) {
            thumbnailButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A07 = null;
        WDSButton wDSButton = this.A08;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A08 = null;
        WDSButton wDSButton2 = this.A0A;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener((View.OnClickListener) null);
        }
        this.A0A = null;
    }
}
