package com.whatsapp.metaai.voice.ui;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4XB;
import X.C139436yq;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C18090vk;
import X.C36401np;
import X.C38731rn;
import X.C39401t1;
import X.C39761tb;
import X.C47192Hl;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C90054dS;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

public final class AiVoiceDisclosureBottomSheet extends Hilt_AiVoiceDisclosureBottomSheet {
    public AnonymousClass11C A00;
    public C18030ve A01;
    public C36401np A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public Integer A05;
    public C18090vk A06;
    public LottieAnimationView A07;
    public WaImageView A08;

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
        if (!C39761tb.A03()) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(2131432699);
            this.A07 = lottieAnimationView;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
            }
            WaImageView waImageView = this.A08;
            if (waImageView != null) {
                waImageView.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView2 = this.A07;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.A04();
            }
        } else {
            WaImageView A0S = AnonymousClass3MW.A0S(view, 2131432737);
            this.A08 = A0S;
            if (A0S != null) {
                A0S.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView3 = this.A07;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setVisibility(8);
            }
        }
        C36401np r3 = this.A02;
        if (r3 != null) {
            SpannableString A042 = r3.A04(A14(), AnonymousClass3MZ.A09(this).getString(2131886626), (Runnable[]) null, new String[]{"ai-at-meta"}, new String[]{"https://www.facebook.com/privacy/genai/"});
            TextEmojiLabel A0c = C72453Mb.A0c(view, 2131430038);
            Rect rect = C39401t1.A0A;
            AnonymousClass11C r0 = this.A00;
            if (r0 != null) {
                AnonymousClass3Ma.A1K(A0c, r0);
                C18030ve r02 = this.A01;
                if (r02 != null) {
                    AnonymousClass3Ma.A1L(r02, A0c);
                    A0c.setText(A042);
                    C90054dS.A00(AnonymousClass1HF.A06(view, 2131430035), this, 5);
                    C90054dS.A00(AnonymousClass1HF.A06(view, 2131427732), this, 6);
                    return;
                }
                AnonymousClass3MW.A1A();
                throw null;
            }
            AnonymousClass3MW.A1N();
            throw null;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            Integer num = this.A05;
            C47192Hl r1 = new C47192Hl();
            AnonymousClass3MZ.A1T(r1, num);
            AnonymousClass4XB.A00(r1, (AnonymousClass4XB) r0.get(), 74);
            A28();
            return;
        }
        C18070vi.A11("metaAiVoiceJourneyLogger");
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setRequestedOrientation(-1);
        }
        this.A07 = null;
        this.A08 = null;
    }

    public void A1u() {
        String str;
        super.A1u();
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            C17880vN.A1F(C17890vO.A0A(((C38731rn) r0.get()).A01), "meta_ai_voice_disclosure_seen", true);
            AnonymousClass00H r02 = this.A04;
            if (r02 != null) {
                Integer num = this.A05;
                C47192Hl r1 = new C47192Hl();
                AnonymousClass3MZ.A1T(r1, num);
                AnonymousClass4XB.A00(r1, (AnonymousClass4XB) r02.get(), 72);
                return;
            }
            str = "metaAiVoiceJourneyLogger";
        } else {
            str = "metaAiSharedPreferences";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (Build.VERSION.SDK_INT == 26) {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                A1B.setRequestedOrientation(-1);
                return;
            }
            return;
        }
        AnonymousClass1FL A1B2 = A1B();
        if (A1B2 != null) {
            A1B2.setRequestedOrientation(1);
        }
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A25() {
        return 2132084859;
    }

    public int A2F() {
        return 2131624178;
    }
}
