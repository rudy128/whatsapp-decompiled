package com.whatsapp.ephemeral;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1L9;
import X.AnonymousClass4QD;
import X.AnonymousClass86E;
import X.C107415Zp;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C19830z4;
import X.C24261Jm;
import X.C25161Nd;
import X.C32491hH;
import X.C34441kU;
import X.C87474Vs;
import X.C89934dG;
import X.C89984dL;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class EphemeralDmKicBottomSheetDialog extends Hilt_EphemeralDmKicBottomSheetDialog implements AnonymousClass86E {
    public static C107415Zp A0N;
    public static final C87474Vs A0O = new Object();
    public int A00;
    public FrameLayout A01;
    public AnonymousClass1L9 A02;
    public WaImageView A03;
    public WaImageView A04;
    public WaImageView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public C25161Nd A0C;
    public AnonymousClass11P A0D;
    public C19830z4 A0E;
    public C32491hH A0F;
    public AnonymousClass4QD A0G;
    public AnonymousClass1BI A0H;
    public C34441kU A0I;
    public WDSButton A0J;
    public WDSButton A0K;
    public AnonymousClass00H A0L;
    public boolean A0M;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r9, android.view.LayoutInflater r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            r4 = 0
            X.C18070vi.A0d(r10, r4)
            r0 = 2131625230(0x7f0e050e, float:1.8877662E38)
            android.view.View r3 = r10.inflate(r0, r11, r4)
            android.os.Bundle r1 = r8.A15()
            java.lang.String r0 = "chat_jid"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            r8.A0H = r0
            android.os.Bundle r1 = r8.A15()
            java.lang.String r0 = "entry_point"
            int r1 = r1.getInt(r0)
            r8.A00 = r1
            r2 = 1
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            r8.A0M = r0
            X.C18070vi.A0b(r3)
            r0 = 2131430509(0x7f0b0c6d, float:1.848272E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r3, r0)
            r8.A0K = r0
            r0 = 2131430507(0x7f0b0c6b, float:1.8482717E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r3, r0)
            r8.A0J = r0
            r0 = 2131430513(0x7f0b0c71, float:1.848273E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r3, r0)
            r8.A0A = r0
            r0 = 2131430512(0x7f0b0c70, float:1.8482727E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r3, r0)
            r8.A08 = r0
            r0 = 2131430511(0x7f0b0c6f, float:1.8482725E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r3, r0)
            r8.A06 = r0
            r0 = 2131430510(0x7f0b0c6e, float:1.8482723E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r3, r0)
            r8.A09 = r0
            r0 = 2131430514(0x7f0b0c72, float:1.8482731E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r3, r0)
            r8.A0B = r0
            r0 = 2131430504(0x7f0b0c68, float:1.848271E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r3, r0)
            r8.A04 = r0
            r0 = 2131430502(0x7f0b0c66, float:1.8482707E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r3, r0)
            r8.A03 = r0
            r0 = 2131430508(0x7f0b0c6c, float:1.8482719E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r3, r0)
            r8.A07 = r0
            r0 = 2131430505(0x7f0b0c69, float:1.8482713E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r3, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r8.A01 = r0
            r0 = 2131430506(0x7f0b0c6a, float:1.8482715E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r3, r0)
            r8.A05 = r0
            X.1kU r0 = r8.A0I
            if (r0 == 0) goto L_0x01c9
            java.lang.String r5 = "ephemeral"
            r1 = 0
            X.1aA r0 = r0.A00
            boolean r0 = r0.A01(r1, r5)
            r7 = r0 ^ 1
            if (r7 == 0) goto L_0x0146
            boolean r0 = r8.A0M
            if (r0 != 0) goto L_0x0146
            r8.A02(r4)
            com.whatsapp.WaTextView r0 = r8.A09
            if (r0 == 0) goto L_0x00bd
            r0.setVisibility(r4)
        L_0x00bd:
            com.whatsapp.WaTextView r0 = r8.A07
            r5 = 8
            if (r0 == 0) goto L_0x00c6
            r0.setVisibility(r5)
        L_0x00c6:
            int r6 = r8.A00
            r0 = 2
            com.whatsapp.WaTextView r1 = r8.A0B
            if (r6 != r0) goto L_0x0140
            if (r1 == 0) goto L_0x00d5
            r0 = 2131893118(0x7f121b7e, float:1.9421003E38)
        L_0x00d2:
            r1.setText(r0)
        L_0x00d5:
            com.whatsapp.WaTextView r1 = r8.A0A
            if (r1 == 0) goto L_0x00df
            r0 = 2131893116(0x7f121b7c, float:1.9421E38)
            r1.setText(r0)
        L_0x00df:
            com.whatsapp.WaTextView r1 = r8.A0A
            r0 = 2131231711(0x7f0803df, float:1.807951E38)
            r8.A00(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A08
            if (r1 == 0) goto L_0x00f1
            r0 = 2131893114(0x7f121b7a, float:1.9420995E38)
            r1.setText(r0)
        L_0x00f1:
            com.whatsapp.WaTextView r1 = r8.A08
            r0 = 2131231723(0x7f0803eb, float:1.8079535E38)
            r8.A00(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A06
            if (r1 == 0) goto L_0x0103
            r0 = 2131893113(0x7f121b79, float:1.9420993E38)
            r1.setText(r0)
        L_0x0103:
            com.whatsapp.WaTextView r1 = r8.A06
            r0 = 2131231701(0x7f0803d5, float:1.807949E38)
            r8.A00(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A09
            if (r1 == 0) goto L_0x0115
            r0 = 2131893115(0x7f121b7b, float:1.9420997E38)
            r1.setText(r0)
        L_0x0115:
            com.whatsapp.WaImageView r1 = r8.A04
            if (r1 == 0) goto L_0x011f
            r0 = 2131231888(0x7f080490, float:1.807987E38)
            r1.setImageResource(r0)
        L_0x011f:
            android.widget.FrameLayout r0 = r8.A01
            if (r0 == 0) goto L_0x0126
            r0.setVisibility(r5)
        L_0x0126:
            com.whatsapp.WaImageView r0 = r8.A05
            if (r0 == 0) goto L_0x012d
            r0.setVisibility(r4)
        L_0x012d:
            X.1hH r5 = r8.A0F
            if (r5 == 0) goto L_0x01cc
            X.1BI r4 = r8.A0H
            X.1Nd r1 = r8.A0C
            if (r1 == 0) goto L_0x01c6
            if (r7 != 0) goto L_0x013a
            r2 = 2
        L_0x013a:
            int r0 = r8.A00
            r5.A00(r1, r4, r2, r0)
            return r3
        L_0x0140:
            if (r1 == 0) goto L_0x00d5
            r0 = 2131893117(0x7f121b7d, float:1.9421001E38)
            goto L_0x00d2
        L_0x0146:
            r8.A02(r2)
            com.whatsapp.WaTextView r0 = r8.A09
            X.C72453Mb.A1B(r0)
            com.whatsapp.WaTextView r0 = r8.A07
            if (r0 == 0) goto L_0x0155
            r0.setVisibility(r4)
        L_0x0155:
            int r0 = r8.A00
            com.whatsapp.WaTextView r1 = r8.A06
            if (r0 != r2) goto L_0x01a4
            if (r1 == 0) goto L_0x0163
            r0 = 2131893122(0x7f121b82, float:1.9421012E38)
            r1.setText(r0)
        L_0x0163:
            com.whatsapp.WaTextView r1 = r8.A0B
            if (r1 == 0) goto L_0x016d
            r0 = 2131893123(0x7f121b83, float:1.9421014E38)
            r1.setText(r0)
        L_0x016d:
            com.whatsapp.WaTextView r1 = r8.A08
            if (r1 == 0) goto L_0x0177
            r0 = 2131893121(0x7f121b81, float:1.942101E38)
            r1.setText(r0)
        L_0x0177:
            com.whatsapp.WaTextView r1 = r8.A06
            r0 = 2131231642(0x7f08039a, float:1.807937E38)
        L_0x017c:
            r8.A00(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A0A
            if (r1 == 0) goto L_0x0189
            r0 = 2131893125(0x7f121b85, float:1.9421018E38)
            r1.setText(r0)
        L_0x0189:
            com.whatsapp.WaTextView r1 = r8.A0A
            r0 = 2131231954(0x7f0804d2, float:1.8080004E38)
            r8.A00(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A08
            r0 = 2131231956(0x7f0804d4, float:1.8080008E38)
            r8.A00(r1, r0)
            com.whatsapp.WaImageView r1 = r8.A04
            if (r1 == 0) goto L_0x012d
            r0 = 2131231723(0x7f0803eb, float:1.8079535E38)
            r1.setImageResource(r0)
            goto L_0x012d
        L_0x01a4:
            if (r1 == 0) goto L_0x01ac
            r0 = 2131893119(0x7f121b7f, float:1.9421006E38)
            r1.setText(r0)
        L_0x01ac:
            com.whatsapp.WaTextView r1 = r8.A0B
            if (r1 == 0) goto L_0x01b6
            r0 = 2131893126(0x7f121b86, float:1.942102E38)
            r1.setText(r0)
        L_0x01b6:
            com.whatsapp.WaTextView r1 = r8.A08
            if (r1 == 0) goto L_0x01c0
            r0 = 2131893124(0x7f121b84, float:1.9421016E38)
            r1.setText(r0)
        L_0x01c0:
            com.whatsapp.WaTextView r1 = r8.A06
            r0 = 2131231741(0x7f0803fd, float:1.8079572E38)
            goto L_0x017c
        L_0x01c6:
            java.lang.String r0 = "conversationsManager"
            goto L_0x01ce
        L_0x01c9:
            java.lang.String r0 = "nuxManagerBridge"
            goto L_0x01ce
        L_0x01cc:
            java.lang.String r0 = "keepInChatLogger"
        L_0x01ce:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        A01(this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C107415Zp r2;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof C107415Zp) && (r2 = (C107415Zp) A1B) != null) {
            r2.BzN();
        }
        C107415Zp r0 = A0N;
        if (r0 != null) {
            r0.BzN();
            A0N = null;
        }
    }

    public static final void A01(EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog) {
        C19830z4 r0 = ephemeralDmKicBottomSheetDialog.A0E;
        if (r0 != null) {
            C17880vN.A1F(C19830z4.A00(r0), "ephemeral_kic_nux", true);
            ephemeralDmKicBottomSheetDialog.A29();
            return;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    private final void A02(boolean z) {
        WDSButton wDSButton = this.A0K;
        if (wDSButton != null) {
            C89934dG.A00(wDSButton, this, 23);
        }
        WDSButton wDSButton2 = this.A0J;
        if (wDSButton2 != null) {
            C89984dL.A00(wDSButton2, this, 5, z);
        }
        WaImageView waImageView = this.A03;
        if (waImageView != null) {
            C89934dG.A00(waImageView, this, 24);
        }
    }

    private final void A00(WaTextView waTextView, int i) {
        Drawable A002 = C24261Jm.A00(A14(), i);
        if (waTextView != null) {
            waTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(A002, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void A1u() {
        super.A1u();
        C19830z4 r0 = this.A0E;
        if (r0 == null) {
            C18070vi.A11("waSharedPreferences");
            throw null;
        } else if (C17880vN.A1W(C17890vO.A0B(r0), "ephemeral_kic_nux") && !this.A0M) {
            A29();
        }
    }
}
