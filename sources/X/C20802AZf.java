package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.AZf  reason: case insensitive filesystem */
public class C20802AZf implements BDE {
    public final /* synthetic */ AnonymousClass1KJ A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public /* synthetic */ void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
    }

    public boolean CN3() {
        return false;
    }

    public C20802AZf(AnonymousClass1KJ r1, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = indiaUpiSendPaymentActivity;
        this.A02 = paymentBottomSheet;
        this.A00 = r1;
    }

    public void BCl(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        TextView A0J = AnonymousClass3MW.A0J(indiaUpiSendPaymentActivity.getLayoutInflater().inflate(2131624626, viewGroup, true), 2131427786);
        AnonymousClass1KJ r3 = this.A00;
        A0J.setText(r3.BLc(indiaUpiSendPaymentActivity.A00, indiaUpiSendPaymentActivity.A09));
        AnonymousClass3MW.A0J(indiaUpiSendPaymentActivity.getLayoutInflater().inflate(2131624626, viewGroup, true), 2131427786).setText(r3.BLc(indiaUpiSendPaymentActivity.A00, indiaUpiSendPaymentActivity.A09));
    }

    public boolean Bfm() {
        AnonymousClass8pI r0 = this.A01.A0B;
        if (r0 == null || !r0.A0F()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Blj(android.view.ViewGroup r6) {
        /*
            r5 = this;
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r4 = r5.A01
            boolean r3 = r4.A4y()
            java.lang.String r0 = r4.A0Y
            r2 = 0
            boolean r1 = X.AnonymousClass000.A1W(r0)
            if (r3 == 0) goto L_0x0012
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0012:
            r0 = 0
            r2 = 8
        L_0x0015:
            r6.setVisibility(r2)
            if (r0 == 0) goto L_0x0028
            r0 = 2131433527(0x7f0b1837, float:1.8488842E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.payments.ui.widget.PaymentDescriptionRow r1 = (com.whatsapp.payments.ui.widget.PaymentDescriptionRow) r1
            java.lang.String r0 = r4.A0T
            r1.A01(r0)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20802AZf.Blj(android.view.ViewGroup):void");
    }

    public void Blk(ViewGroup viewGroup) {
        View A0A = AnonymousClass3MX.A0A(this.A01.getLayoutInflater(), viewGroup, 2131627282);
        AnonymousClass3MW.A0J(A0A, 2131436044).setText(2131895280);
        ImageView A0G = AnonymousClass3MW.A0G(A0A, 2131431496);
        A0G.setImageResource(2131231814);
        AFQ.A00(A0G, this.A02, 2);
    }

    public void Blm(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        View inflate = indiaUpiSendPaymentActivity.getLayoutInflater().inflate(2131625613, viewGroup, true);
        ImageView A0G = AnonymousClass3MW.A0G(inflate, 2131433642);
        TextView A0J = AnonymousClass3MW.A0J(inflate, 2131433639);
        TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131433641);
        TextView A0J3 = AnonymousClass3MW.A0J(inflate, 2131433643);
        C72463Mc.A13(inflate, 2131430710);
        A0J.setText(2131894027);
        indiaUpiSendPaymentActivity.A01.A09(A0G, 2131231047);
        AnonymousClass8BR.A1E(A0J2, AnonymousClass8BT.A0q(indiaUpiSendPaymentActivity.A0H));
        Object obj = indiaUpiSendPaymentActivity.A0J.A00;
        C17960vV.A07(obj);
        AnonymousClass3MY.A0y(indiaUpiSendPaymentActivity, A0J3, new Object[]{obj}, 2131891338);
    }

    public void Bus(ViewGroup viewGroup, C20284AEs aEs) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C20080A6g.A00(indiaUpiSendPaymentActivity.getLayoutInflater(), AnonymousClass3MX.A0F(indiaUpiSendPaymentActivity, 2131430951), aEs, A43.A00(AXS.A02(indiaUpiSendPaymentActivity), (String) null).A00, true);
    }

    public /* synthetic */ int BPB(C20284AEs aEs) {
        return 0;
    }

    public String BPC(C20284AEs aEs, int i) {
        boolean A012 = C20063A5m.A01(aEs);
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        int i2 = 2131895280;
        if (A012) {
            i2 = 2131897410;
        }
        return indiaUpiSendPaymentActivity.getString(i2);
    }

    public /* synthetic */ int BQA() {
        return 0;
    }

    public /* synthetic */ String BQB(C20284AEs aEs) {
        return null;
    }

    public /* synthetic */ String BUs() {
        return null;
    }

    public /* synthetic */ String Bae() {
        return null;
    }

    public /* synthetic */ boolean CLs(C20284AEs aEs, String str, int i) {
        return false;
    }

    public /* synthetic */ boolean CMG(C20284AEs aEs) {
        return false;
    }

    public /* synthetic */ boolean CMH() {
        return false;
    }

    public /* synthetic */ int BR6(C20284AEs aEs, int i) {
        return 0;
    }
}
