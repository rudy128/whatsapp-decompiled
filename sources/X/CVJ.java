package X;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;

public final class CVJ {
    public final IUiSettingsDelegate A00;

    public CVJ(IUiSettingsDelegate iUiSettingsDelegate) {
        this.A00 = iUiSettingsDelegate;
    }

    public void A00() {
        try {
            C26399Cyz cyz = (C26399Cyz) this.A00;
            Parcel A04 = cyz.A04();
            A04.writeInt(0);
            cyz.A06(3, A04);
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }
}
