package X;

import com.whatsapp.quickcontact.QuickContactActivity;
import java.util.Collection;

public class Af2 implements C34191k5 {
    public final int A00;
    public final Object A01;

    public Af2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BnE(C178119Bw r4) {
        if (this.A00 != 0) {
            QuickContactActivity quickContactActivity = (QuickContactActivity) this.A01;
            AnonymousClass1EC r1 = quickContactActivity.A0a;
            if (r1 != null && r1.equals(r4.A0C)) {
                quickContactActivity.A0k = r4;
                if (!C42171xk.A00(r4.A0E, quickContactActivity.A0m)) {
                    quickContactActivity.A0m = r4.A0E;
                    A5G.A01(quickContactActivity);
                    return;
                }
                return;
            }
            return;
        }
        C18070vi.A0d(r4, 0);
        C78453sp r2 = (C78453sp) this.A01;
        if (C18070vi.A18(r2.getFMessage().A0v.A01, C40811vJ.A09(r4.A04.A02))) {
            r2.getFMessage().A00.A02(r4);
            C78453sp.A03(r2);
        }
    }

    public /* synthetic */ void BnA() {
    }

    public /* synthetic */ void BnD() {
    }

    public /* synthetic */ void BnF(Collection collection) {
    }
}
