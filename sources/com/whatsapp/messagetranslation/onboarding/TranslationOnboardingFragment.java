package com.whatsapp.messagetranslation.onboarding;

import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OA;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aU;
import X.C18070vi;
import X.C18600wl;
import X.C22931Dv;
import X.C23761Hn;
import X.C25351CeA;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C70583Br;
import X.C72463Mc;
import X.C74483bk;
import X.C90054dS;
import X.C90874em;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Locale;

public final class TranslationOnboardingFragment extends Hilt_TranslationOnboardingFragment {
    public AnonymousClass1KB A00;
    public TranslationViewModel A01;
    public AnonymousClass1Nb A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public C18600wl A06;
    public C18600wl A07;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TranslationViewModel translationViewModel = (TranslationViewModel) AnonymousClass3Ma.A0I(this).A00(TranslationViewModel.class);
        this.A01 = translationViewModel;
        if (translationViewModel != null) {
            View A0L = C72463Mc.A0L(view);
            C18070vi.A0d(A0L, 0);
            BottomSheetBehavior.A02(A0L).A0Z(new C74483bk(translationViewModel, 5));
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                C22931Dv r0 = AnonymousClass1BI.A00;
                AnonymousClass1BI A012 = C22931Dv.A01(bundle2.getString("chat_jid"));
                ArrayList A042 = AnonymousClass4aU.A04(bundle2);
                boolean z = bundle2.getBoolean("is_translated");
                TranslationViewModel translationViewModel2 = this.A01;
                if (translationViewModel2 != null) {
                    translationViewModel2.A00 = A012;
                    translationViewModel2.A02 = A042;
                    A00(this);
                    SwitchCompat switchCompat = (SwitchCompat) C18070vi.A05(view, 2131436430);
                    C90874em.A00(switchCompat, this, 17);
                    Integer A0w = AnonymousClass3MW.A0w(C23761Hn.A02, new TranslationOnboardingFragment$initializeTranslateAutomaticallySwitch$2(switchCompat, A012, this, (C30391dr) null), AnonymousClass1OA.A00);
                    WDSButton A0q = AnonymousClass3MW.A0q(A17(), 2131436429);
                    C37581pm A0H = AnonymousClass3MZ.A0H(this);
                    C18600wl r02 = this.A06;
                    if (r02 != null) {
                        C30451dy.A02(A0w, r02, new TranslationOnboardingFragment$initializeTranslateButton$1$1(this, A0q, A042, (C30391dr) null, z), A0H);
                        C90054dS.A00(AnonymousClass1HF.A06(A17(), 2131429132), this, 1);
                        TextView A0J = AnonymousClass3MW.A0J(A17(), 2131436433);
                        String A013 = C25351CeA.A01(Locale.forLanguageTag(AnonymousClass3MZ.A16()));
                        C18070vi.A0X(A013);
                        A0J.setText(A013);
                        return;
                    }
                    AnonymousClass3MW.A1K();
                    throw null;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public static final void A00(TranslationOnboardingFragment translationOnboardingFragment) {
        AnonymousClass1KB r2 = translationOnboardingFragment.A00;
        if (r2 != null) {
            r2.A0J(new C70583Br(translationOnboardingFragment, 32));
        } else {
            AnonymousClass3MW.A1C();
            throw null;
        }
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        A27.setCanceledOnTouchOutside(false);
        return A27;
    }

    public int A2F() {
        return 2131627236;
    }
}
