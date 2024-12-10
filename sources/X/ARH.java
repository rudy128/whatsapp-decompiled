package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.List;

public class ARH implements C22442B7y {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public ARH(AnonymousClass8pK r1, C184839bb r2, String str, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r1;
        this.A03 = str;
    }

    public final void BlH(List list) {
        boolean z;
        int i = this.A00;
        C184839bb r0 = (C184839bb) this.A01;
        AnonymousClass8pK r2 = (AnonymousClass8pK) this.A02;
        String str = this.A03;
        if (i != 0) {
            z = false;
        } else {
            z = true;
        }
        BrazilPayBloksActivity.A0t(r0.A00, r2, r0.A01, str, (List) null, z);
    }
}
