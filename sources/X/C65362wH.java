package X;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2wH  reason: invalid class name and case insensitive filesystem */
public class C65362wH implements EDW, EDX {
    public final /* synthetic */ AnonymousClass1RB A00;

    public void onConnectionFailed(C23203Bcx bcx) {
    }

    public void onConnectionSuspended(int i) {
    }

    public C65362wH(AnonymousClass1RB r1) {
        this.A00 = r1;
    }

    public void onConnected(Bundle bundle) {
        AnonymousClass1RB r6 = this.A00;
        if (r6.A03.A06()) {
            Map map = r6.A01;
            C17960vV.A07(map);
            Iterator A0l = C17890vO.A0l(map);
            while (A0l.hasNext()) {
                C65382wJ r4 = (C65382wJ) A0l.next();
                LocationRequest A002 = AnonymousClass1RB.A00(r4);
                try {
                    C25260Cbz cbz = r6.A00;
                    C18210vx.A02(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    cbz.A03(new C23382Bg9(cbz, r4, A002));
                } catch (SecurityException e) {
                    Log.w("FusedLocationManager/GmsConnectionCallbacks/onConnected/unable to request location updates", e);
                }
            }
            if (r6.A01.isEmpty()) {
                C25260Cbz cbz2 = r6.A00;
                C17960vV.A07(cbz2);
                cbz2.A04();
            }
        }
    }
}
