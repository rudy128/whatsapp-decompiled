package X;

import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ai  reason: invalid class name and case insensitive filesystem */
public class C177729Ai extends A34 {
    public final /* synthetic */ IndiaUpiChangePinActivity A00;

    public C177729Ai(IndiaUpiChangePinActivity indiaUpiChangePinActivity) {
        this.A00 = indiaUpiChangePinActivity;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C20284AEs aEs;
        List list = (List) obj;
        if (list != null && list.size() == 1) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = this.A00;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aEs = null;
                    break;
                }
                aEs = AnonymousClass8BR.A0P(it);
                if (aEs.A05() == 2) {
                    break;
                }
            }
            indiaUpiChangePinActivity.A02 = (AnonymousClass8pN) aEs;
        }
        IndiaUpiChangePinActivity indiaUpiChangePinActivity2 = this.A00;
        indiaUpiChangePinActivity2.A04.A00("pin-entry-ui");
        AnonymousClass8pN r0 = indiaUpiChangePinActivity2.A02;
        if (r0 != null) {
            indiaUpiChangePinActivity2.A5A(r0.A08);
            return;
        }
        indiaUpiChangePinActivity2.A05.A06("could not find bank account; showErrorAndFinish");
        indiaUpiChangePinActivity2.A56();
    }
}
