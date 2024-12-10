package X;

import com.whatsapp.util.Log;

/* renamed from: X.7IH  reason: invalid class name */
public class AnonymousClass7IH implements C1607089p {
    public final /* synthetic */ C136916uc A00;

    public AnonymousClass7IH(C136916uc r1) {
        this.A00 = r1;
    }

    public void BoT() {
        C136916uc r1 = this.A00;
        if (r1.A00 != null) {
            Log.e("ContactUsActivity/createTicketIq/onDeliveryFailure, falling back to email support.");
            r1.A00.CEx();
            r1.A00();
        }
    }

    public void BoU(int i, String str) {
        C136916uc r2 = this.A00;
        if (r2.A00 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ContactUsActivity/createTicketIq/onError/errorCode=");
            A10.append(i);
            C17890vO.A19(A10, " falling back to email support.");
            r2.A00.CEx();
            r2.A00();
        }
    }

    public void BoV(AnonymousClass1BI r7) {
        C136916uc r5 = this.A00;
        if (r5.A00 != null) {
            Log.i("ContactUsActivity/createTicketIq/onSuccess, removing spinner and finishing activity");
            C18030ve r2 = r5.A09;
            C18040vf r1 = C18040vf.A02;
            boolean z = false;
            int max = Math.max(0, C18020vd.A00(r1, r2, 974));
            r5.A01 = r7;
            r5.A02 = false;
            if (r7 != null && r5.A05.A0P(r7) && !C18020vd.A05(r1, r2, 10126)) {
                r5.A0D.CGF(new C146447Pd(this, 12));
            }
            AnonymousClass1NN r22 = r5.A07;
            C25231Nk r12 = r5.A06;
            r22.registerObserver(r12);
            if (max <= 0) {
                z = true;
            }
            if (!r5.A04(z)) {
                r5.A04.A0K(new C146447Pd(this, 13), (long) max);
            } else {
                r22.unregisterObserver(r12);
            }
        }
    }
}
