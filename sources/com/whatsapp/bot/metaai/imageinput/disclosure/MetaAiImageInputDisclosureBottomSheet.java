package com.whatsapp.bot.metaai.imageinput.disclosure;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C139436yq;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18090vk;
import X.C25771Po;
import X.C36401np;
import X.C38731rn;
import X.C39761tb;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.util.Log;

public final class MetaAiImageInputDisclosureBottomSheet extends Hilt_MetaAiImageInputDisclosureBottomSheet {
    public AnonymousClass11C A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public C18090vk A04;
    public boolean A05;
    public LottieAnimationView A06;
    public WaImageView A07;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View A1q = super.A1q(bundle, layoutInflater, viewGroup);
        if (A1q == null) {
            return null;
        }
        C72483Me.A0m(A1q, this);
        C72473Md.A13(A1q, this);
        return A1q;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (C39761tb.A03()) {
            WaImageView A0S = AnonymousClass3MW.A0S(view, 2131432737);
            this.A07 = A0S;
            if (A0S != null) {
                A0S.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView = this.A06;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
            }
        } else {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view.findViewById(2131432699);
            this.A06 = lottieAnimationView2;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setVisibility(0);
            }
            WaImageView waImageView = this.A07;
            if (waImageView != null) {
                waImageView.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView3 = this.A06;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.A04();
            }
        }
        View findViewById = view.findViewById(2131427858);
        AnonymousClass3MW.A0H(findViewById, 2131431496).setImageResource(2131232433);
        C17880vN.A0E(findViewById, 2131431358).setText(2131892123);
        C17880vN.A0E(findViewById, 2131432664).setText(2131892125);
        View findViewById2 = view.findViewById(2131432254);
        AnonymousClass3MW.A0H(findViewById2, 2131431496).setImageResource(2131233192);
        C17880vN.A0E(findViewById2, 2131431358).setText(2131892124);
        C17880vN.A0E(findViewById2, 2131432664).setText(2131892126);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(view, 2131430030);
        AnonymousClass3Ma.A1L(A0W.getAbProps(), A0W);
        C72473Md.A1C(A0W);
        C36401np r4 = this.A01;
        if (r4 != null) {
            A0W.setText(r4.A04(A14(), A1H(2131892122), (Runnable[]) null, new String[]{"ai-terms"}, new String[]{"https://www.facebook.com/policies/other-policies/ais-terms"}));
            AnonymousClass3MZ.A1I(view.findViewById(2131429337), this, 48);
            AnonymousClass3MZ.A1I(view.findViewById(2131429132), this, 49);
            AnonymousClass00H r0 = this.A03;
            if (r0 != null) {
                C17880vN.A1F(C17890vO.A0A(((C38731rn) r0.get()).A01), "meta_ai_image_input_disclosure_seen", true);
                AnonymousClass00H r02 = this.A02;
                if (r02 != null) {
                    AnonymousClass3MY.A1P((AnonymousClass1BI) null, (C25771Po) r02.get(), 11, true);
                } else {
                    C18070vi.A11("mediaInputActionsLogger");
                    throw null;
                }
            } else {
                C18070vi.A11("metaAiSharedPreferences");
                throw null;
            }
        } else {
            AnonymousClass3MW.A1E();
            throw null;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass1FL A1B;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        if (!this.A05 && (A1B = A1B()) != null && !A1B.isChangingConfigurations()) {
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                AnonymousClass3MY.A1P((AnonymousClass1BI) null, (C25771Po) r0.get(), 14, true);
            } else {
                C18070vi.A11("mediaInputActionsLogger");
                throw null;
            }
        }
        try {
            AnonymousClass1FL A1B2 = A1B();
            if (A1B2 != null) {
                A1B2.setRequestedOrientation(-1);
            }
        } catch (Exception e) {
            Log.e("MetaAiImageInputDisclosureBottomSheet/Failed to set orientation", e);
        }
        this.A06 = null;
        this.A07 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                A1B.setRequestedOrientation(1);
            }
        } catch (Exception e) {
            Log.e("MetaAiImageInputDisclosureBottomSheet/Failed to set orientation", e);
        }
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A25() {
        return 2132084859;
    }

    public int A2F() {
        return 2131624331;
    }
}
