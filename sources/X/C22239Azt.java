package X;

import android.content.Intent;
import android.widget.Toast;
import com.whatsapp.payments.ui.IndiaUpiSavingsOfferActivity;

/* renamed from: X.Azt  reason: case insensitive filesystem */
public final class C22239Azt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ IndiaUpiSavingsOfferActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22239Azt(IndiaUpiSavingsOfferActivity indiaUpiSavingsOfferActivity) {
        super(1);
        this.this$0 = indiaUpiSavingsOfferActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C186199do r5 = (C186199do) obj;
        IndiaUpiSavingsOfferActivity indiaUpiSavingsOfferActivity = this.this$0;
        C18070vi.A0b(r5);
        indiaUpiSavingsOfferActivity.CEx();
        C186959f2 r0 = r5.A00;
        if (r0 != null) {
            String A00 = C196819vh.A00(indiaUpiSavingsOfferActivity, r0);
            if (r0.A00 == AnonymousClass00R.A01) {
                indiaUpiSavingsOfferActivity.BhS("", A00);
            } else {
                Toast.makeText(indiaUpiSavingsOfferActivity, A00, 1).show();
            }
        } else {
            C20279AEn aEn = r5.A01;
            if (aEn != null) {
                Intent A0A = C17880vN.A0A();
                A0A.putExtra("extra_checkout_info_content", aEn);
                indiaUpiSavingsOfferActivity.setResult(-1, A0A);
            }
            indiaUpiSavingsOfferActivity.finish();
        }
        return C27621Wu.A00;
    }
}
