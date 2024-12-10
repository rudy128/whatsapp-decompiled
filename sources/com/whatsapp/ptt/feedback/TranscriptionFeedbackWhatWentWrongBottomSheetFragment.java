package com.whatsapp.ptt.feedback;

import X.AnonymousClass18K;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass5W3;
import X.C128826gk;
import X.C139436yq;
import X.C17880vN;
import X.C18070vi;
import X.C22821Di;
import X.C72453Mb;
import X.C91844gL;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.WaImageButton;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Map;

public final class TranscriptionFeedbackWhatWentWrongBottomSheetFragment extends Hilt_TranscriptionFeedbackWhatWentWrongBottomSheetFragment {
    public ChipGroup A00;
    public WaImageButton A01;
    public AnonymousClass18K A02;
    public C128826gk A03;
    public WDSButton A04;
    public final Map A05 = C17880vN.A13();

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaImageButton waImageButton = (WaImageButton) AnonymousClass1HF.A06(view, 2131436392);
        AnonymousClass3Ma.A1A(waImageButton, this, 11);
        this.A01 = waImageButton;
        WDSButton A0q = AnonymousClass3MW.A0q(view, 2131436397);
        A0q.setEnabled(false);
        AnonymousClass3Ma.A1A(A0q, this, 10);
        this.A04 = A0q;
        ChipGroup chipGroup = (ChipGroup) AnonymousClass1HF.A06(view, 2131436391);
        chipGroup.A01 = new C91844gL(this);
        A00(chipGroup, this, AnonymousClass5W3.A00);
        this.A00 = chipGroup;
    }

    public void A1s() {
        WDSButton wDSButton = this.A04;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A04 = null;
        WaImageButton waImageButton = this.A01;
        if (waImageButton != null) {
            waImageButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        ChipGroup chipGroup = this.A00;
        if (chipGroup != null) {
            chipGroup.A01 = null;
        }
        this.A00 = null;
        super.A1s();
    }

    public static final void A00(ChipGroup chipGroup, TranscriptionFeedbackWhatWentWrongBottomSheetFragment transcriptionFeedbackWhatWentWrongBottomSheetFragment, C22821Di r8) {
        int childCount = chipGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = chipGroup.getChildAt(i);
            C18070vi.A0z(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            transcriptionFeedbackWhatWentWrongBottomSheetFragment.A05.put(Integer.valueOf(childAt.getId()), r8.invoke(childAt));
        }
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A2F() {
        return 2131627226;
    }
}
