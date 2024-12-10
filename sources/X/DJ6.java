package X;

import android.os.RemoteException;

public final class DJ6 implements C28567E7x {
    public final /* synthetic */ C26110CsV A00;

    public DJ6(C26110CsV csV) {
        this.A00 = csV;
    }

    public final int CSZ() {
        return 5;
    }

    public final void CSg() {
        try {
            C26399Cyz.A03((C26399Cyz) ((DJ4) this.A00.A01).A02, 3);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }
}
