package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.Aaq  reason: case insensitive filesystem */
public class C20874Aaq implements BCF {
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A00;

    public C20874Aaq(IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A00 = indiaUpiCheckOrderDetailsActivity;
    }

    public void BlB(String str, Map map) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A00;
        AnonymousClass8BU.A1E(indiaUpiCheckOrderDetailsActivity.A05, indiaUpiCheckOrderDetailsActivity, map, str, 1);
    }

    public void BlC(int i) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A00;
        AES aes = indiaUpiCheckOrderDetailsActivity.A01;
        if (aes != null) {
            indiaUpiCheckOrderDetailsActivity.A05.CGF(new C70863Cu(indiaUpiCheckOrderDetailsActivity, i, 28, aes));
        }
    }

    public void Bsl() {
        this.A00.runOnUiThread(C21447AkE.A00(this, 24));
    }
}
