package X;

import android.content.Context;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.HashMap;

/* renamed from: X.AXt  reason: case insensitive filesystem */
public final /* synthetic */ class C20764AXt implements C22445B8d {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PaymentCheckoutOrderDetailsViewV2 A01;
    public final /* synthetic */ C191559mn A02;
    public final /* synthetic */ C191979nV A03;
    public final /* synthetic */ String A04;

    public final void Bko(boolean z, String str, String str2, String str3) {
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = this.A01;
        Context context = this.A00;
        C191979nV r0 = this.A03;
        C191559mn r5 = this.A02;
        String str4 = this.A04;
        if (z) {
            C17960vV.A07(str);
            C17960vV.A07(str3);
            ((C195019sf) paymentCheckoutOrderDetailsViewV2.A0b.get()).A01(context, (Runnable) null, str, str2, str3);
            return;
        }
        BD6 bd6 = r0.A0A;
        AnonymousClass21K r6 = r0.A0B;
        AnonymousClass1BI r3 = r0.A08;
        ARR arr = r0.A06;
        String str5 = r0.A0M;
        ADQ adq = r0.A09;
        String str6 = r0.A0D;
        HashMap hashMap = r0.A0N;
        if (str4 == null) {
            str4 = "order_details";
        }
        bd6.Bob(arr, r3, adq, r5, r6, str5, str6, str4, hashMap);
    }

    public /* synthetic */ C20764AXt(Context context, PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2, C191559mn r3, C191979nV r4, String str) {
        this.A01 = paymentCheckoutOrderDetailsViewV2;
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = str;
    }
}
