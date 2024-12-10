package X;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.8Cq  reason: invalid class name and case insensitive filesystem */
public class C161308Cq extends ResultReceiver {
    public CLResultReceiver A00;

    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        if (i == 2) {
            try {
                this.A00.CPt(bundle);
            } catch (RemoteException e) {
                e.getLocalizedMessage();
            }
        } else if (i == 3) {
            this.A00.BLY(bundle);
        } else if (i == 4) {
            this.A00.CPs(bundle);
        } else {
            this.A00.CHP(bundle);
        }
    }
}
