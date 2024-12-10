package androidx.window.layout.adapter.sidecar;

import X.C17890vO;
import X.C18070vi;
import X.C192929pG;
import X.C24511C7f;
import X.C26118Csg;
import X.D7T;
import X.D7U;
import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Iterator;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ D7U A00;

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface A01;
        C18070vi.A0d(sidecarDeviceState, 0);
        D7U d7u = this.A00;
        Iterator A0l = C17890vO.A0l(d7u.A04);
        while (A0l.hasNext()) {
            Activity activity = (Activity) A0l.next();
            IBinder A002 = C24511C7f.A00(activity);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (!(A002 == null || (A01 = d7u.A01()) == null)) {
                sidecarWindowLayoutInfo = A01.getWindowLayoutInfo(A002);
            }
            D7T d7t = d7u.A00;
            if (d7t != null) {
                d7t.CAc(activity, d7u.A01.A01(sidecarDeviceState, sidecarWindowLayoutInfo));
            }
        }
    }

    public SidecarCompat$TranslatingCallback(D7U d7u) {
        this.A00 = d7u;
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        C18070vi.A0h(iBinder, sidecarWindowLayoutInfo);
        D7U d7u = this.A00;
        Activity activity = (Activity) d7u.A04.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        C26118Csg csg = d7u.A01;
        SidecarInterface A01 = d7u.A01();
        if (A01 == null || (sidecarDeviceState = A01.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        C192929pG A012 = csg.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
        D7T d7t = d7u.A00;
        if (d7t != null) {
            d7t.CAc(activity, A012);
        }
    }
}
