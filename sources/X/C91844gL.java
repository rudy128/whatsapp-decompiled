package X;

import com.google.android.material.chip.ChipGroup;
import com.whatsapp.ptt.feedback.TranscriptionFeedbackWhatWentWrongBottomSheetFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4gL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91844gL implements C28520E5k {
    public final /* synthetic */ TranscriptionFeedbackWhatWentWrongBottomSheetFragment A00;

    public final void Boa(ChipGroup chipGroup) {
        TranscriptionFeedbackWhatWentWrongBottomSheetFragment transcriptionFeedbackWhatWentWrongBottomSheetFragment = this.A00;
        TranscriptionFeedbackWhatWentWrongBottomSheetFragment.A00(chipGroup, transcriptionFeedbackWhatWentWrongBottomSheetFragment, AnonymousClass5W2.A00);
        WDSButton wDSButton = transcriptionFeedbackWhatWentWrongBottomSheetFragment.A04;
        if (wDSButton != null) {
            wDSButton.setEnabled(AnonymousClass000.A1a(chipGroup.getCheckedChipIds()));
        }
    }

    public /* synthetic */ C91844gL(TranscriptionFeedbackWhatWentWrongBottomSheetFragment transcriptionFeedbackWhatWentWrongBottomSheetFragment) {
        this.A00 = transcriptionFeedbackWhatWentWrongBottomSheetFragment;
    }
}
