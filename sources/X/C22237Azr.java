package X;

import com.whatsapp.payments.ui.BusinessHubActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

/* renamed from: X.Azr  reason: case insensitive filesystem */
public final class C22237Azr extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BusinessHubActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22237Azr(BusinessHubActivity businessHubActivity) {
        super(1);
        this.this$0 = businessHubActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C198179xu r5 = (C198179xu) obj;
        int BQc = ((PaymentMerchantAccountViewModel) this.this$0.A0E.getValue()).A01.A06().BQc();
        if (r5 != null) {
            int i = r5.A00;
            if (i == 0) {
                this.this$0.CEx();
                this.this$0.finish();
            } else if (i == 1) {
                this.this$0.CEx();
                BusinessHubActivity businessHubActivity = this.this$0;
                Throwable th = r5.A02;
                if (th == null || (str = th.getMessage()) == null) {
                    str = C18070vi.A0F(this.this$0, 2131893867);
                }
                AnonymousClass1R2.A0D(businessHubActivity, str, BQc);
            } else if (i == 2) {
                this.this$0.CNA(2131895077);
            }
        }
        return C27621Wu.A00;
    }
}
