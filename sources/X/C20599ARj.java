package X;

import android.content.res.Resources;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ARj  reason: case insensitive filesystem */
public class C20599ARj implements C22500BAh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BrazilOrderDetailsActivity A01;
    public final /* synthetic */ AnonymousClass9I2 A02;
    public final /* synthetic */ C191979nV A03;

    public void C6l() {
    }

    public C20599ARj(BrazilOrderDetailsActivity brazilOrderDetailsActivity, AnonymousClass9I2 r2, C191979nV r3, int i) {
        this.A01 = brazilOrderDetailsActivity;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }

    public void C6i() {
        Resources resources;
        int i;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A01;
        C003401n supportActionBar = brazilOrderDetailsActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = this.A03.A00;
            if (i2 == 1 || i2 == 7) {
                resources = brazilOrderDetailsActivity.getResources();
                int A032 = AnonymousClass8BX.A03(brazilOrderDetailsActivity.A0E);
                i = 2131895335;
                if (A032 != 2) {
                    i = 2131895336;
                    if (A032 != 3) {
                        i = 2131895334;
                    }
                }
            } else {
                resources = brazilOrderDetailsActivity.getResources();
                int A033 = AnonymousClass8BX.A03(brazilOrderDetailsActivity.A0E);
                i = 2131895952;
                if (A033 != 2) {
                    i = 2131895953;
                    if (A033 != 3) {
                        i = 2131895951;
                    }
                }
            }
            supportActionBar.A0S(resources.getString(i));
        }
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = brazilOrderDetailsActivity.A0B;
        AnonymousClass9I2 r10 = this.A02;
        C191979nV r11 = this.A03;
        C191559mn A002 = paymentCheckoutOrderDetailsViewV2.A00(r10, r11, "WhatsappPay", (List) null, 3);
        brazilOrderDetailsActivity.A0E = A002;
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV22 = brazilOrderDetailsActivity.A0B;
        int i3 = r11.A00;
        boolean A034 = paymentCheckoutOrderDetailsViewV22.A03(A002, r11, i3);
        if (this.A00 == 0) {
            A6X a6x = brazilOrderDetailsActivity.A0M;
            AnonymousClass21K r1 = brazilOrderDetailsActivity.A0K;
            ArrayList A003 = brazilOrderDetailsActivity.A0E.A00();
            AnonymousClass21K r17 = r1;
            A6X a6x2 = a6x;
            a6x2.A06(r17, BrazilOrderDetailsActivity.A03(brazilOrderDetailsActivity), AnonymousClass1R2.A06(brazilOrderDetailsActivity.A0E.A01), A003, 4, true, A034, true);
        }
        brazilOrderDetailsActivity.A0B.A02(brazilOrderDetailsActivity, brazilOrderDetailsActivity.A02, (AES) null, r10, r11, "WhatsappPay", (List) null, 3, i3);
    }
}
