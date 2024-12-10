package X;

import android.content.Intent;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.Azu  reason: case insensitive filesystem */
public final class C22240Azu extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ IndiaUpiInternationalActivationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22240Azu(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalActivationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9MU r6 = (AnonymousClass9MU) obj;
        if (r6 instanceof AnonymousClass93o) {
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity = this.this$0;
            Intent putExtra = C17880vN.A0A().putExtra("INTERNATIONAL_ACTIVATION_RESPONSE", "INTERNATIONAL_ACTIVATION_SUCCESS");
            C20270AEd aEd = ((AnonymousClass93o) r6).A00;
            indiaUpiInternationalActivationActivity.setResult(-1, putExtra.putExtra("INTERNATIONAL_ACTIVATION_RESULT_STATE", aEd).putExtra("INTERNATIONAL_QR_SOURCE", this.this$0.getIntent().getStringExtra("INTERNATIONAL_QR_SOURCE")).putExtra("INTERNATIONAL_QR_PAYLOAD", this.this$0.getIntent().getParcelableExtra("INTERNATIONAL_QR_PAYLOAD")));
            String str = aEd.A01;
            int length = str.length();
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity2 = this.this$0;
            if (length > 0) {
                C73203Rj A0E = AnonymousClass8BW.A0E(indiaUpiInternationalActivationActivity2);
                A0E.A0k(this.this$0.getString(2131891432));
                A0E.A0S(str);
                C20155A9r.A01(A0E, this.this$0, 26, 2131899286);
                AnonymousClass3MY.A1G(A0E);
            } else {
                indiaUpiInternationalActivationActivity2.finish();
            }
        }
        return C27621Wu.A00;
    }
}
