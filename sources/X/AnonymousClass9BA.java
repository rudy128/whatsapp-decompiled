package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9BA  reason: invalid class name */
public class AnonymousClass9BA extends A34 {
    public final C189629jY A00;
    public final C193179pf A01;
    public final ArrayList A02;
    public final /* synthetic */ PaymentTransactionHistoryActivity A03;

    public AnonymousClass9BA(C189629jY r2, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, C193179pf r4, ArrayList arrayList) {
        ArrayList arrayList2;
        this.A03 = paymentTransactionHistoryActivity;
        if (arrayList != null) {
            arrayList2 = C17880vN.A10(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A02 = arrayList2;
        this.A00 = r2;
        this.A01 = r4;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r6 = (C19760yx) obj;
        C189629jY r4 = this.A00;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A03;
        String str = paymentTransactionHistoryActivity.A0L;
        if (str == null) {
            str = "";
        }
        C188079gq r2 = paymentTransactionHistoryActivity.A0X;
        Object obj2 = r6.A00;
        C17960vV.A07(obj2);
        Object obj3 = r6.A01;
        C17960vV.A07(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
