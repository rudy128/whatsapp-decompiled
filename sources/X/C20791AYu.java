package X;

import android.widget.ProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AYu  reason: case insensitive filesystem */
public final class C20791AYu implements BBJ {
    public final /* synthetic */ P2mLiteConfirmDateOfBirthBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ AnonymousClass21L A03;
    public final /* synthetic */ String A04;

    public void Bss(A7B a7b) {
        String str;
        C18070vi.A0d(a7b, 0);
        P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = this.A00;
        WaEditText waEditText = p2mLiteConfirmDateOfBirthBottomSheetFragment.A02;
        if (waEditText != null) {
            waEditText.setVisibility(0);
            TextEmojiLabel textEmojiLabel = p2mLiteConfirmDateOfBirthBottomSheetFragment.A01;
            if (textEmojiLabel != null) {
                textEmojiLabel.setVisibility(0);
                ProgressBar progressBar = p2mLiteConfirmDateOfBirthBottomSheetFragment.A00;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                    P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
                    int i = a7b.A00;
                    P2mLiteOrderDetailsActivity.A03(p2mLiteConfirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, this.A02, (PaymentBottomSheet) null, this.A03, this.A04, "enter_dob", i);
                    return;
                }
                str = "progressBar";
            } else {
                str = "descText";
            }
        } else {
            str = "dobEditText";
        }
        C18070vi.A11(str);
        throw null;
    }

    public C20791AYu(P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, AnonymousClass21L r4, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A04 = str;
        this.A00 = p2mLiteConfirmDateOfBirthBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = r4;
    }

    public void Bs2() {
        this.A01.A4d(this.A04, "COMPLETED", "enter_dob");
    }
}
