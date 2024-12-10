package X;

import android.content.Context;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AZq  reason: case insensitive filesystem */
public final /* synthetic */ class C20813AZq implements C22467B8z {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass91R A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public final void BqC(String str) {
        AnonymousClass91R r2 = this.A01;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        Context context = this.A00;
        paymentBottomSheet.A28();
        r2.A5O(context, str, true);
    }

    public /* synthetic */ C20813AZq(Context context, AnonymousClass91R r2, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = r2;
        this.A02 = paymentBottomSheet;
        this.A00 = context;
    }
}
