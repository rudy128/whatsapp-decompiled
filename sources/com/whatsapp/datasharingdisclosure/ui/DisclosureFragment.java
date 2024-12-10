package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00R;
import X.AnonymousClass1LC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4X2;
import X.C108045b2;
import X.C139436yq;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C19740yt;
import X.C24261Jm;
import X.C43531zx;
import X.C62762rw;
import X.C90684eT;
import X.C99154sM;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.WaTextView;

public abstract class DisclosureFragment extends Hilt_DisclosureFragment {
    public int A00 = 2131233458;
    public int A01 = 2131889480;
    public int A02 = 2131233259;
    public View A03;
    public LinearLayout A04;
    public NestedScrollView A05;
    public AnonymousClass1LC A06;
    public C18000vb A07;
    public C108045b2 A08;
    public Float A09;
    public Integer A0A = 2131101303;
    public Integer A0B = 2131101303;
    public Integer A0C;
    public C18090vk A0D;
    public boolean A0E = true;
    public final ViewTreeObserver.OnScrollChangedListener A0F = new C90684eT(this, 2);
    public final C18100vl A0G = C99154sM.A01(this, 6);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate;
        int i;
        Object A14;
        int i2;
        int i3;
        int i4;
        C18070vi.A0d(layoutInflater, 0);
        if (A2K() == AnonymousClass00R.A0C) {
            inflate = layoutInflater.inflate(2131625374, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(2131625364, viewGroup, false);
            this.A03 = inflate;
            ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131431496);
            Float f = this.A09;
            if (f != null) {
                float floatValue = f.floatValue();
                ViewGroup.LayoutParams layoutParams = A0H.getLayoutParams();
                layoutParams.width = C62762rw.A01(A14(), floatValue);
                layoutParams.height = C62762rw.A01(A14(), floatValue);
                A0H.setLayoutParams(layoutParams);
            }
            A0H.setImageResource(this.A02);
            TextView A0E2 = C17880vN.A0E(inflate, 2131436208);
            boolean z = this instanceof ConsumerMarketingDisclosureFragment;
            if (z) {
                i = ((AnonymousClass4X2) ((ConsumerMarketingDisclosureFragment) this).A07.getValue()).A07;
            } else {
                i = 2131889485;
            }
            A0E2.setText(i);
            TextView A0E3 = C17880vN.A0E(inflate, 2131429927);
            if (z) {
                A14 = ((ConsumerMarketingDisclosureFragment) this).A06.getValue();
            } else {
                A14 = AnonymousClass3MX.A14(this.A0G);
            }
            A0E3.setText((CharSequence) A14);
            WaTextView A0U = AnonymousClass3MW.A0U(inflate, 2131429786);
            WaTextView A0U2 = AnonymousClass3MW.A0U(inflate, 2131429787);
            WaTextView A0U3 = AnonymousClass3MW.A0U(inflate, 2131429788);
            C18070vi.A0b(A0U);
            A01(A0U, 2131233483);
            C18070vi.A0b(A0U2);
            A01(A0U2, this.A00);
            C18070vi.A0b(A0U3);
            if (z) {
                i2 = ((AnonymousClass4X2) ((ConsumerMarketingDisclosureFragment) this).A07.getValue()).A01;
            } else {
                i2 = 2131233429;
            }
            A01(A0U3, i2);
            if (z) {
                i3 = ((AnonymousClass4X2) ((ConsumerMarketingDisclosureFragment) this).A07.getValue()).A00;
            } else {
                i3 = 2131889479;
            }
            A0U.setText(i3);
            A0U2.setText(this.A01);
            if (z) {
                i4 = ((AnonymousClass4X2) ((ConsumerMarketingDisclosureFragment) this).A07.getValue()).A02;
            } else {
                i4 = 2131889481;
            }
            A0U3.setText(i4);
            Integer num = this.A0B;
            if (num != null) {
                A0H.setColorFilter(C19740yt.A00(A14(), num.intValue()));
            }
            Integer num2 = this.A0A;
            if (num2 != null) {
                int A002 = C19740yt.A00(A14(), num2.intValue());
                Drawable drawable = A0U.getCompoundDrawables()[0];
                if (drawable != null) {
                    drawable.setTint(A002);
                }
                Drawable drawable2 = A0U2.getCompoundDrawables()[0];
                if (drawable2 != null) {
                    drawable2.setTint(A002);
                }
                Drawable drawable3 = A0U3.getCompoundDrawables()[0];
                if (drawable3 != null) {
                    drawable3.setTint(A002);
                }
            }
        }
        this.A05 = (NestedScrollView) inflate.findViewById(2131434837);
        this.A04 = (LinearLayout) inflate.findViewById(2131428627);
        return inflate;
    }

    public void A1z(Bundle bundle) {
        Integer[] A002 = AnonymousClass00R.A00(5);
        Bundle bundle2 = this.A06;
        int i = 0;
        if (bundle2 != null) {
            i = bundle2.getInt("blocking_key", 0);
        }
        Integer num = A002[i];
        C18070vi.A0d(num, 0);
        this.A0C = num;
        super.A1z(bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r7, android.view.View r8) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            super.A21(r7, r8)
            boolean r0 = r6.A0E
            r2 = 0
            if (r0 == 0) goto L_0x004d
            r0 = 2131429927(0x7f0b0a27, float:1.848154E38)
            android.view.View r5 = r8.findViewById(r0)
            com.whatsapp.FAQTextView r5 = (com.whatsapp.FAQTextView) r5
            r0 = r6
            boolean r3 = r6 instanceof com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment
            if (r3 == 0) goto L_0x01c1
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r0
            X.0vl r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
        L_0x0022:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            X.1LC r1 = r6.A06
            if (r1 == 0) goto L_0x01d6
            r0 = r6
            if (r3 == 0) goto L_0x01bd
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r0
            X.0vl r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.4X2 r0 = (X.AnonymousClass4X2) r0
            java.lang.String r0 = r0.A0C
        L_0x003c:
            android.net.Uri r0 = r1.A00(r0)
            java.lang.String r3 = r0.toString()
            r1 = 5
            X.4gm r0 = new X.4gm
            r0.<init>(r6, r1)
            r5.setEducationText(r4, r3, r2, r0)
        L_0x004d:
            r0 = 2131427466(0x7f0b008a, float:1.847655E38)
            com.whatsapp.wds.components.button.WDSButton r5 = X.AnonymousClass3MW.A0r(r8, r0)
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            com.whatsapp.wds.components.button.WDSButton r4 = X.AnonymousClass3MW.A0r(r8, r0)
            java.lang.Integer r1 = r6.A2K()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x006a
            r0 = 2131430058(0x7f0b0aaa, float:1.8481806E38)
            android.view.View r2 = r8.findViewById(r0)
        L_0x006a:
            java.lang.Integer r0 = r6.A2K()
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0161
            r0 = 2
            if (r1 == r0) goto L_0x013f
            r0 = 3
            if (r1 == r0) goto L_0x0161
            X.C18070vi.A0b(r4)
            X.C18070vi.A0b(r5)
            r3 = r6
            boolean r0 = r6 instanceof com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment
            if (r0 == 0) goto L_0x00bf
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r3 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r3
            X.C18070vi.A0h(r4, r5)
            r1 = 0
            r4.setVisibility(r1)
            r0 = 34
            X.C89924dF.A00(r4, r3, r0)
            r5.setVisibility(r1)
            r0 = 35
            X.C89924dF.A00(r5, r3, r0)
        L_0x009c:
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            r5.setText(r0)
        L_0x00a2:
            androidx.core.widget.NestedScrollView r0 = r6.A05
            if (r0 == 0) goto L_0x00b1
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x00b1
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r6.A0F
            r1.addOnScrollChangedListener(r0)
        L_0x00b1:
            android.view.View r2 = r6.A0B
            if (r2 == 0) goto L_0x00be
            r1 = 7
            X.4sM r0 = new X.4sM
            r0.<init>(r6, r1)
            X.C43531zx.A06(r0, r2)
        L_0x00be:
            return
        L_0x00bf:
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r3 = (com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment) r3
            X.C18070vi.A0h(r4, r5)
            java.lang.Integer r1 = r3.A2K()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00f0
            X.0vl r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel r0 = (com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel) r0
            X.1BI r2 = r3.A05
            java.lang.Boolean r1 = r3.A06
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.9ox r0 = (X.C192769ox) r0
            r0.A00(r2, r1)
            X.00H r0 = r3.A03
            if (r0 == 0) goto L_0x01cc
            X.4aI r1 = X.AnonymousClass3MW.A0b(r0)
            com.whatsapp.jid.UserJid r0 = r3.A00
            r1.A04(r0)
        L_0x00f0:
            r0 = 8
            r4.setVisibility(r0)
            r0 = 32
            X.C89924dF.A00(r5, r3, r0)
            java.lang.Integer r2 = r3.A2K()
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            r0 = 2131889477(0x7f120d45, float:1.9413619E38)
            if (r2 != r1) goto L_0x0108
            r0 = 2131889478(0x7f120d46, float:1.941362E38)
        L_0x0108:
            r5.setText(r0)
            X.00H r0 = r3.A02
            if (r0 == 0) goto L_0x01cf
            java.lang.Object r0 = r0.get()
            X.4Zz r0 = (X.C88504Zz) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00a2
            X.00H r0 = r3.A01
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r0 = r0.get()
            X.6pP r0 = (X.C133736pP) r0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.4Mp r0 = (X.C85234Mp) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C18070vi.A03(r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = "pref_chat_info_new_icon_shown"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
            goto L_0x00a2
        L_0x013f:
            X.C18070vi.A0b(r4)
            X.C18070vi.A0b(r5)
            X.C18070vi.A0h(r4, r5)
            r0 = 8
            r4.setVisibility(r0)
            r0 = 38
            X.C89924dF.A00(r5, r6, r0)
            r0 = 2131889477(0x7f120d45, float:1.9413619E38)
            r5.setText(r0)
            if (r2 == 0) goto L_0x00a2
            r0 = 39
            X.C89924dF.A00(r2, r6, r0)
            goto L_0x00a2
        L_0x0161:
            X.C18070vi.A0b(r4)
            X.C18070vi.A0b(r5)
            r2 = r6
            boolean r0 = r6 instanceof com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment
            if (r0 == 0) goto L_0x0184
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r2 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r2
            X.C18070vi.A0h(r4, r5)
            r1 = 0
            r4.setVisibility(r1)
            r0 = 34
            X.C89924dF.A00(r4, r2, r0)
            r5.setVisibility(r1)
            r0 = 35
            X.C89924dF.A00(r5, r2, r0)
            goto L_0x009c
        L_0x0184:
            boolean r3 = X.C18070vi.A15(r4, r5)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131169064(0x7f070f28, float:1.7952448E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.view.View r1 = r6.A0B
            if (r1 == 0) goto L_0x01a8
            r0 = 2131431496(0x7f0b1048, float:1.8484723E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x01a8
            X.1sv r0 = new X.1sv
            r0.<init>(r3, r2, r3, r3)
            X.C43531zx.A03(r1, r0)
        L_0x01a8:
            r4.setVisibility(r3)
            r0 = 36
            X.C89924dF.A00(r5, r6, r0)
            r0 = 2131889477(0x7f120d45, float:1.9413619E38)
            r5.setText(r0)
            r0 = 37
            X.C89924dF.A00(r4, r6, r0)
            goto L_0x00a2
        L_0x01bd:
            java.lang.String r0 = "https://faq.whatsapp.com/785493319976156"
            goto L_0x003c
        L_0x01c1:
            X.0vl r0 = r6.A0G
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            goto L_0x0022
        L_0x01c9:
            java.lang.String r0 = "consumerDisclosureCooldownManager"
            goto L_0x01d1
        L_0x01cc:
            java.lang.String r0 = "ctwaCustomerLoggingController"
            goto L_0x01d1
        L_0x01cf:
            java.lang.String r0 = "consumerDisclosureManager"
        L_0x01d1:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01d6:
            java.lang.String r0 = "waLinkFactory"
            X.C18070vi.A11(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.datasharingdisclosure.ui.DisclosureFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A2I(C139436yq r3) {
        C18070vi.A0d(r3, 0);
        r3.A01(AnonymousClass3Ma.A1Z(A2K(), AnonymousClass00R.A01));
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        View view = this.A0B;
        if (view != null) {
            C43531zx.A06(new C99154sM(this, 7), view);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C18090vk r0 = this.A0D;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void A1s() {
        ViewTreeObserver viewTreeObserver;
        NestedScrollView nestedScrollView = this.A05;
        if (!(nestedScrollView == null || (viewTreeObserver = nestedScrollView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnScrollChangedListener(this.A0F);
        }
        this.A05 = null;
        this.A04 = null;
        super.A1s();
    }

    public final Integer A2K() {
        Integer num = this.A0C;
        if (num != null) {
            return num;
        }
        C18070vi.A11(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        throw null;
    }

    private final void A01(WaTextView waTextView, int i) {
        Drawable A002 = C24261Jm.A00(A14(), i);
        C18000vb r0 = this.A07;
        if (r0 != null) {
            boolean A1b = AnonymousClass3MY.A1b(r0);
            Drawable drawable = null;
            if (A1b) {
                drawable = A002;
                A002 = null;
            }
            waTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, A002, (Drawable) null);
            return;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void CIB(C108045b2 r1) {
        this.A08 = r1;
    }
}
