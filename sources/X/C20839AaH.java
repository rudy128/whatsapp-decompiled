package X;

import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AaH  reason: case insensitive filesystem */
public final class C20839AaH implements BBU {
    public final /* synthetic */ P2mLiteConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ AnonymousClass21L A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public void Bnj() {
    }

    public void Bq9(PaymentBottomSheet paymentBottomSheet, String str) {
        String str2 = str;
        C18070vi.A0d(str2, 1);
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        Integer A0l = C17880vN.A0l();
        String str3 = this.A05;
        AnonymousClass21L r6 = this.A03;
        P2mLiteOrderDetailsActivity.A0Q(C196449v5.A00(), p2mLiteOrderDetailsActivity, r6, A0l, "enter_name", str3, 1);
        AnonymousClass10I r0 = p2mLiteOrderDetailsActivity.A05;
        String str4 = this.A04;
        r0.CGF(new C21394AjN(p2mLiteOrderDetailsActivity, this.A02, this.A00, paymentBottomSheet, r6, str2, str4, 2));
    }

    public C20839AaH(P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, AnonymousClass21L r4, String str, String str2) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A03 = r4;
        this.A04 = str2;
        this.A00 = p2mLiteConfirmLegalNameBottomSheetFragment;
        this.A02 = paymentBottomSheet;
    }
}
