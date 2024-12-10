package X;

import android.content.Context;
import android.view.Surface;

public class CVl {
    public EAZ A00;
    public boolean A01;

    public EAR A00(Context context, Surface surface, C25092CXd cXd, C25752ClM clM, C26052CrM crM, E7s e7s, CTK ctk, CZT czt) {
        boolean z;
        E7s e7s2 = e7s;
        CZT czt2 = czt;
        if (!e7s2.Bch() || !(czt2 instanceof BWA)) {
            z = false;
        } else {
            z = true;
        }
        this.A01 = z;
        Context context2 = context;
        Surface surface2 = surface;
        C25092CXd cXd2 = cXd;
        C25752ClM clM2 = clM;
        C26052CrM crM2 = crM;
        CTK ctk2 = ctk;
        if (z) {
            return new DHH(context2, surface2, cXd2, clM2, crM2, e7s2, this, ctk2, czt2);
        }
        return new DHI(context2, surface2, cXd2, clM2, crM2, e7s2, this, ctk2, czt2);
    }
}
