package X;

import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.AXj  reason: case insensitive filesystem */
public class C20754AXj implements BB5 {
    public final /* synthetic */ PaymentIncentiveViewModel A00;
    public final /* synthetic */ boolean A01;

    public C20754AXj(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z) {
        this.A00 = paymentIncentiveViewModel;
        this.A01 = z;
    }

    public void Bsl() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        if (this.A01) {
            PaymentIncentiveViewModel paymentIncentiveViewModel = this.A00;
            C198179xu.A00(paymentIncentiveViewModel.A01, paymentIncentiveViewModel.A06.A01(), AnonymousClass8BR.A0w("Failed syncing incentive"), 1);
        }
    }

    public void C7L(C19962A0v a0v) {
        if (this.A01) {
            C198179xu.A00(this.A00.A01, a0v, (Throwable) null, 0);
        }
    }
}
