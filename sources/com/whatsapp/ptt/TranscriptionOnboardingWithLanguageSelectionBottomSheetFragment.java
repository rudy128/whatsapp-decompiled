package com.whatsapp.ptt;

import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass7RB;
import X.C139436yq;
import X.C18070vi;
import X.C36401np;
import X.C72453Mb;
import X.C72473Md;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment extends Hilt_TranscriptionOnboardingWithLanguageSelectionBottomSheetFragment {
    public View.OnClickListener A00;
    public AnonymousClass1L9 A01;
    public WaTextView A02;
    public AnonymousClass1LU A03;
    public C36401np A04;
    public WaImageButton A05;
    public WDSButton A06;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaTextView A0T = AnonymousClass3MW.A0T(view, 2131436406);
        this.A02 = A0T;
        if (A0T != null) {
            C36401np r2 = this.A04;
            if (r2 != null) {
                SpannableStringBuilder A062 = r2.A06(A0T.getContext(), new AnonymousClass7RB((Object) this, 3), A1H(2131897097), "transcripts-learn-more", 2131102731);
                C72473Md.A1D(A0T);
                A0T.setText(A062);
            } else {
                AnonymousClass3MW.A1E();
                throw null;
            }
        }
        this.A05 = (WaImageButton) AnonymousClass1HF.A06(view, 2131436409);
        this.A06 = AnonymousClass3MW.A0q(view, 2131436408);
        WaImageButton waImageButton = this.A05;
        if (waImageButton != null) {
            AnonymousClass3Ma.A1A(waImageButton, this, 6);
        }
        WDSButton wDSButton = this.A06;
        if (wDSButton != null) {
            AnonymousClass3Ma.A1A(wDSButton, this, 7);
        }
    }

    public void A1s() {
        WaImageButton waImageButton = this.A05;
        if (waImageButton != null) {
            waImageButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A05 = null;
        WDSButton wDSButton = this.A06;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A06 = null;
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            waTextView.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        super.A1s();
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A2F() {
        return 2131627230;
    }
}
