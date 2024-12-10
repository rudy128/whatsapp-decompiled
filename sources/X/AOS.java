package X;

import com.whatsapp.util.Log;

public class AOS implements B7V {
    public final int A00;
    public final Object A01;

    public AOS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C7N(C29621ca r4) {
        if (this.A00 != 0) {
            ((C195849u0) this.A01).A02((String) null);
            return;
        }
        Log.i("success getting chat block status");
        C37551pj r2 = (C37551pj) this.A01;
        C21451AkI.A01(r2.A0G, r2, r4, 12);
    }
}
