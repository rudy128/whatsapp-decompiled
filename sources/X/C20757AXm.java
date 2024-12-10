package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.AXm  reason: case insensitive filesystem */
public class C20757AXm implements BB6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AW0 A02;
    public final /* synthetic */ C175368yb A03;
    public final /* synthetic */ String A04;

    public C20757AXm(Context context, AW0 aw0, C175368yb r3, String str, int i) {
        this.A03 = r3;
        this.A01 = context;
        this.A02 = aw0;
        this.A00 = i;
        this.A04 = str;
    }

    public void Bti() {
        this.A03.A05.A03(this.A01, this.A02);
    }

    public void onSuccess() {
        Context context = this.A01;
        context.startActivity(IndiaUpiMandatePaymentActivity.A03(context, this.A02, this.A04, this.A00));
    }
}
