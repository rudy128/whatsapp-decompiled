package X;

import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.AYt  reason: case insensitive filesystem */
public class C20790AYt implements BBJ {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ AnonymousClass91q A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C20790AYt(C194839sN r1, AnonymousClass91q r2, String str, String str2) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = str2;
    }

    public void Bs2() {
        String A1G;
        AnonymousClass91q r3 = this.A01;
        if (!C18020vd.A05(C18040vf.A02, r3.A0E, 2928) || !"p2m_context".equals(this.A03)) {
            this.A00.A00("on_success");
            return;
        }
        HashMap A11 = C17880vN.A11();
        A11.put("account_compliance_status", "COMPLETED");
        AbstractMap A0p = AnonymousClass8BW.A0p(r3);
        if (A0p == null || (A1G = C108945cZ.A1G("fds_resource_id", A0p)) == null) {
            Log.e("PayBloksActivity/onDobCheckComplete resource id is null");
            return;
        }
        r3.A4e(this.A00);
        r3.A4f(A1G, this.A02, A11);
    }

    public void Bss(A7B a7b) {
        AnonymousClass91q r3 = this.A01;
        if (r3.A0G.A00(r3, a7b)) {
            this.A00.A00("on_failure");
            return;
        }
        int i = a7b.A00;
        if (i == 10755) {
            this.A00.A00("on_failure");
            r3.CMl(PaymentsUnavailableDialogFragment.A00());
            return;
        }
        HashMap A11 = C17880vN.A11();
        AnonymousClass8BU.A1N(A11, i);
        this.A00.A01("on_exception", A11);
    }
}
