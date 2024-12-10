package X;

import java.util.HashMap;
import java.util.Map;

public class AYW implements BBE {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ AnonymousClass91q A01;

    public AYW(C194839sN r1, AnonymousClass91q r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BwU(A7B a7b) {
        AnonymousClass91q.A0q(this.A00, (Map) null, a7b.A00);
    }

    public void BwV(C64532uv r5) {
        String str = r5.A02;
        if ("COMPLETED".equals(str)) {
            AnonymousClass91q r2 = this.A01;
            r2.A07.A0B("kyc");
            r2.A09.A0N("pending");
        }
        HashMap A11 = C17880vN.A11();
        A11.put("kyc_status", str);
        this.A00.A01("on_success", A11);
    }
}
