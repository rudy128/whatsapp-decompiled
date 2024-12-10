package X;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AYx  reason: case insensitive filesystem */
public final class C20794AYx implements BBK {
    public final /* synthetic */ P2mLiteConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ AnonymousClass21L A04;
    public final /* synthetic */ String A05;

    public void Bss(A7B a7b) {
        String str;
        C18070vi.A0d(a7b, 0);
        P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment = this.A00;
        LinearLayout linearLayout = p2mLiteConfirmLegalNameBottomSheetFragment.A01;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            ProgressBar progressBar = p2mLiteConfirmLegalNameBottomSheetFragment.A02;
            if (progressBar != null) {
                progressBar.setVisibility(4);
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
                int i = a7b.A00;
                P2mLiteOrderDetailsActivity.A03(p2mLiteConfirmLegalNameBottomSheetFragment, p2mLiteOrderDetailsActivity, this.A03, this.A02, this.A04, this.A05, "enter_name", i);
                return;
            }
            str = "progressBar";
        } else {
            str = "inputContainer";
        }
        C18070vi.A11(str);
        throw null;
    }

    public C20794AYx(P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, AnonymousClass21L r5, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A00 = p2mLiteConfirmLegalNameBottomSheetFragment;
        this.A03 = paymentBottomSheet;
        this.A02 = paymentBottomSheet2;
        this.A04 = r5;
    }

    public void Byv() {
        this.A01.A4d(this.A05, "COMPLETED", "enter_name");
    }
}
