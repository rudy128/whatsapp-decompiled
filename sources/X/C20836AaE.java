package X;

import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.Calendar;

/* renamed from: X.AaE  reason: case insensitive filesystem */
public final class C20836AaE implements B97 {
    public final /* synthetic */ P2mLiteConfirmDateOfBirthBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ AnonymousClass21L A03;
    public final /* synthetic */ String A04;

    public void BqA(Calendar calendar) {
        C18070vi.A0d(calendar, 0);
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        Integer A0l = C17880vN.A0l();
        AnonymousClass21L r4 = this.A03;
        P2mLiteOrderDetailsActivity.A0Q(C196449v5.A00(), p2mLiteOrderDetailsActivity, r4, A0l, "enter_dob", "confirm_legal_name_in_progress_prompt", 1);
        p2mLiteOrderDetailsActivity.A05.CGF(new C21463AkU(calendar, this.A00, r4, p2mLiteOrderDetailsActivity, this.A02, this.A04, 6));
    }

    public C20836AaE(P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, AnonymousClass21L r4, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A03 = r4;
        this.A04 = str;
        this.A00 = p2mLiteConfirmDateOfBirthBottomSheetFragment;
        this.A02 = paymentBottomSheet;
    }
}
