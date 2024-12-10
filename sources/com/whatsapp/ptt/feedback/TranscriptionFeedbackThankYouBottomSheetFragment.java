package com.whatsapp.ptt.feedback;

import X.AnonymousClass1HF;
import X.AnonymousClass3Ma;
import X.C18070vi;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wds.components.button.WDSButton;

public final class TranscriptionFeedbackThankYouBottomSheetFragment extends Hilt_TranscriptionFeedbackThankYouBottomSheetFragment {
    public WDSButton A00;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WDSButton wDSButton = (WDSButton) AnonymousClass1HF.A06(view, 2131436393);
        AnonymousClass3Ma.A1A(wDSButton, this, 9);
        this.A00 = wDSButton;
    }

    public void A1s() {
        WDSButton wDSButton = this.A00;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        super.A1s();
    }

    public int A2F() {
        return 2131627225;
    }
}
