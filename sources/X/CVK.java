package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Map;

public final class CVK {
    public final Map A00 = C17880vN.A11();

    public final void A00(IBinder iBinder) {
        Map map = this.A00;
        synchronized (map) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new C23498Bi2();
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A16.getValue();
                try {
                    new C23180Bca();
                    throw null;
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(A16.getKey());
                    String valueOf2 = String.valueOf((Object) null);
                    StringBuilder A0s = BEA.A0s(valueOf2, BE8.A0C(valueOf) + 32);
                    A0s.append("onPostInitHandler: Didn't add: ");
                    A0s.append(valueOf);
                    BEA.A1N("/", valueOf2, "WearableClient", A0s);
                }
            }
        }
    }
}
