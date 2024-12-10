package X;

import java.util.ArrayList;

public abstract class CWE {
    public Object A00;
    public boolean A01 = false;
    public final /* synthetic */ C26157CtR A02;

    public CWE(C26157CtR ctR, Object obj) {
        this.A02 = ctR;
        this.A00 = obj;
    }

    public final void A00() {
        synchronized (this) {
            this.A00 = null;
        }
        ArrayList arrayList = this.A02.A0M;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
