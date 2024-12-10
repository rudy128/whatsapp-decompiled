package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.AXi  reason: case insensitive filesystem */
public class C20753AXi implements BB5 {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public C20753AXi(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }

    public void Bsl() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        C198179xu.A00(paymentIncentiveViewModel.A00, paymentIncentiveViewModel.A06.A01(), AnonymousClass8BR.A0w("Failed syncing incentive"), 1);
    }

    public void C7L(C19962A0v a0v) {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        UserJid userJid = this.A00;
        AnonymousClass1DT r4 = paymentIncentiveViewModel.A00;
        int A002 = PaymentIncentiveViewModel.A00(userJid, paymentIncentiveViewModel);
        C33351ig r0 = paymentIncentiveViewModel.A06;
        C198179xu.A00(r4, new C19962A0v(r0.A02(), r0.A03(), A002), (Throwable) null, 0);
    }
}
