package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.90B  reason: invalid class name */
public final class AnonymousClass90B extends C195919u9 implements C22579BDz {
    public BBM A00;
    public final AnonymousClass118 A01;

    public void BLG(Map map) {
        BBM bbm = this.A00;
        if (bbm != null) {
            bbm.C7V(map);
        } else {
            Log.e("native_upi_reset_pin/finish: callback is null");
        }
        this.A00 = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90B(AnonymousClass118 r1, C176198zw r2) {
        super(r2);
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
    }
}
