package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.Aar  reason: case insensitive filesystem */
public class C20875Aar implements BCF {
    public final /* synthetic */ AES A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public C20875Aar(AES aes, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = aes;
    }

    public void BlB(String str, Map map) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        AnonymousClass8BU.A1E(indiaUpiCheckOrderDetailsActivity.A05, indiaUpiCheckOrderDetailsActivity, map, str, 1);
    }

    public void BlC(int i) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        indiaUpiCheckOrderDetailsActivity.A05.CGF(new C70863Cu(indiaUpiCheckOrderDetailsActivity, i, 28, this.A00));
    }

    public void Bsl() {
        this.A01.runOnUiThread(C21447AkE.A00(this, 23));
    }
}
