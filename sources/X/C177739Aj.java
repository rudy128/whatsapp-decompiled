package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.List;

/* renamed from: X.9Aj  reason: invalid class name and case insensitive filesystem */
public class C177739Aj extends A34 {
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A00;

    public C177739Aj(IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A00 = indiaUpiCheckOrderDetailsActivity;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A00;
        if (indiaUpiCheckOrderDetailsActivity.A0r.decrementAndGet() == 0) {
            indiaUpiCheckOrderDetailsActivity.CEx();
        }
        indiaUpiCheckOrderDetailsActivity.A0G = list;
    }
}
