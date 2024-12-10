package X;

import com.whatsapp.util.Log;

/* renamed from: X.7Gi  reason: invalid class name and case insensitive filesystem */
public abstract class C144187Gi implements C72383Ls {
    public final C1606689l A00;

    public final void BrC(Exception exc) {
        Log.e("FBUserEntityManagement : Network failed  while sending the payload");
        this.A00.BrA();
    }

    public final void Bsw(Exception exc) {
        Log.e("FBUserEntityManagement : On error response while sending the payload");
        this.A00.Bsw(exc);
    }

    public C144187Gi(C1606689l r1) {
        this.A00 = r1;
    }
}
