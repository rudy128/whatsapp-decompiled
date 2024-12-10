package X;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

public final class DJ7 implements C28567E7x {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C26110CsV A01;

    public DJ7(Bundle bundle, C26110CsV csV) {
        this.A01 = csV;
        this.A00 = bundle;
    }

    public final int CSZ() {
        return 1;
    }

    public final void CSg() {
        C28451E1r e1r = this.A01.A01;
        Bundle bundle = this.A00;
        DJ4 dj4 = (DJ4) e1r;
        try {
            Bundle A0D = C17880vN.A0D();
            C26061Cra.A01(bundle, A0D);
            C26399Cyz cyz = (C26399Cyz) dj4.A02;
            cyz.A06(2, C26399Cyz.A01(A0D, cyz));
            C26061Cra.A01(A0D, bundle);
            dj4.A00 = (View) C23228Bde.A00(C23331BfJ.A02(cyz.A04(), cyz, 8));
            ViewGroup viewGroup = dj4.A01;
            viewGroup.removeAllViews();
            viewGroup.addView(dj4.A00);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }
}
