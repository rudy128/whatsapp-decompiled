package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;

/* renamed from: X.Aal  reason: case insensitive filesystem */
public class C20869Aal implements B9C {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20869Aal(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A00 = i;
        this.A01 = brazilPayBloksActivity;
        this.A02 = r1;
    }

    public final void Bum(int i) {
        int i2 = this.A00;
        C194839sN r1 = (C194839sN) this.A02;
        if (i2 == 0 || i != 0) {
            AnonymousClass91q.A0q(r1, (Map) null, i);
        } else {
            r1.A00("on_success");
        }
    }
}
