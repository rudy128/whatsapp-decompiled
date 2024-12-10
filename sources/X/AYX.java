package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class AYX implements BBE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C194839sN A01;
    public final /* synthetic */ BrazilPayBloksActivity A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public AYX(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, String str, String str2, Map map, int i) {
        this.A02 = brazilPayBloksActivity;
        this.A04 = str;
        this.A01 = r1;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = map;
    }

    public void BwU(A7B a7b) {
        int i;
        int i2 = a7b.A00;
        if (i2 != 1448 || (i = this.A00) >= 1) {
            AnonymousClass91q.A0q(this.A01, (Map) null, i2);
            return;
        }
        BrazilPayBloksActivity.A0w(this.A01, this.A02, this.A05, i + 1);
    }

    public void BwV(C64532uv r8) {
        String str;
        boolean equals = "COMPLETED".equals(r8.A02);
        if (equals) {
            BrazilPayBloksActivity brazilPayBloksActivity = this.A02;
            brazilPayBloksActivity.A0D.A02("p2p_context").A0B("kyc");
            brazilPayBloksActivity.A0D.A02("p2m_context").A0B("kyc");
            brazilPayBloksActivity.A09.A0N("pending");
        }
        BrazilPayBloksActivity brazilPayBloksActivity2 = this.A02;
        if (C18020vd.A05(C18040vf.A02, brazilPayBloksActivity2.A0E, 2928) && "p2m_context".equals(this.A04)) {
            HashMap A11 = C17880vN.A11();
            A11.put("kyc_status", "COMPLETED");
            brazilPayBloksActivity2.A4e(this.A01);
            AbstractMap A0p = AnonymousClass8BW.A0p(brazilPayBloksActivity2);
            if (A0p != null) {
                str = C108945cZ.A1G("fds_resource_id", A0p);
            } else {
                str = null;
            }
            brazilPayBloksActivity2.A4f(str, this.A03, A11);
        } else if (equals) {
            this.A01.A00("on_success");
        }
    }
}
