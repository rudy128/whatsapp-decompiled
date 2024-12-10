package X;

import android.content.Context;
import android.os.Handler;

public class BUJ extends C22891BUc implements ED8 {
    public final DDv A00;

    public C22892BUd BTg() {
        return ED8.A01;
    }

    public BUJ(C28592E9h e9h) {
        super(e9h);
        C25313CdJ cdJ = EB3.A01;
        C28592E9h e9h2 = this.A00;
        DDv dDv = (DDv) e9h2.BPA(cdJ);
        if (dDv == null) {
            Handler A002 = C8P.A00(e9h);
            Context context = e9h2.getContext();
            EDI edi = (EDI) e9h2.BP8(EDI.A00);
            EDJ edj = (EDJ) e9h2.BP8(EDJ.A00);
            AnonymousClass8BX.A1J(context, edi, edj, 1);
            C25313CdJ cdJ2 = ED8.A00;
            Object A0h = AnonymousClass000.A0h();
            Object BPA = e9h2.BPA(cdJ2);
            boolean A1Y = AnonymousClass000.A1Y(BPA != null ? BPA : A0h);
            C25639CjS cjS = new C25639CjS();
            Handler BSH = edi.BSH("Lite-CPU-Frames-Thread");
            C18070vi.A0X(BSH);
            this.A00 = new DDv(context, A002, BSH, C26712DAm.A00, cjS, edj, true, true, false, A1Y);
        } else {
            EDJ edj2 = (EDJ) e9h2.BP8(EDJ.A00);
            if (edj2 != null) {
                dDv.A05 = edj2;
            }
            this.A00 = dDv;
        }
        C25313CdJ cdJ3 = EB3.A02;
        Object valueOf = Float.valueOf(1.0f);
        Object BPA2 = e9h2.BPA(cdJ3);
        float A04 = AnonymousClass000.A04(BPA2 != null ? BPA2 : valueOf);
        if (A04 != 0.0f) {
            DDv dDv2 = this.A00;
            if (A04 == 0.0f) {
                dDv2.A0M.A00(C0H.A0R);
            }
            dDv2.A00 = A04;
            C26784DDr dDr = dDv2.A0L;
            if (A04 == 0.0f) {
                dDr.A05.A00(C0H.A0S);
            }
            dDr.A00 = A04;
            return;
        }
        throw AnonymousClass000.A0n("scaleFactor cannot be 0");
    }
}
