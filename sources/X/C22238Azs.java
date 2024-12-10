package X;

import android.widget.Toast;
import com.whatsapp.payments.ui.IndiaUpiSavingsOfferActivity;
import java.util.List;

/* renamed from: X.Azs  reason: case insensitive filesystem */
public final class C22238Azs extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ IndiaUpiSavingsOfferActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22238Azs(IndiaUpiSavingsOfferActivity indiaUpiSavingsOfferActivity) {
        super(1);
        this.this$0 = indiaUpiSavingsOfferActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C27621Wu r0;
        C186189dn r8 = (C186189dn) obj;
        IndiaUpiSavingsOfferActivity indiaUpiSavingsOfferActivity = this.this$0;
        C18070vi.A0b(r8);
        C186959f2 r02 = r8.A00;
        if (r02 != null) {
            String A00 = C196819vh.A00(indiaUpiSavingsOfferActivity, r02);
            if (r02.A00 == AnonymousClass00R.A01) {
                indiaUpiSavingsOfferActivity.BhS("", A00);
            } else {
                Toast.makeText(indiaUpiSavingsOfferActivity, A00, 1).show();
            }
            C161708Hk r1 = indiaUpiSavingsOfferActivity.A05;
            if (r1 == null) {
                C18070vi.A11("indiaUpiSavingsOfferAdapter");
                throw null;
            }
            r1.A02 = false;
            r1.A01 = true;
            r1.A04.clear();
            r1.notifyDataSetChanged();
            r0 = C27621Wu.A00;
        } else {
            r0 = null;
        }
        if (r0 == null) {
            C161708Hk r2 = indiaUpiSavingsOfferActivity.A05;
            if (r2 == null) {
                C18070vi.A11("indiaUpiSavingsOfferAdapter");
                throw null;
            }
            List list = r8.A01;
            r2.A02 = false;
            r2.A01 = false;
            List list2 = r2.A04;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            r2.notifyDataSetChanged();
        }
        AZ6 az6 = indiaUpiSavingsOfferActivity.A03;
        if (az6 != null) {
            az6.BiL((Integer) null, "order_coupon_selection", indiaUpiSavingsOfferActivity.A0A, 0);
            return C27621Wu.A00;
        }
        C18070vi.A11("indiaUpiFieldStatsLogger");
        throw null;
    }
}
