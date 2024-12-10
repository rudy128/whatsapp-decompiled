package androidx.window.layout.adapter.sidecar;

import X.C17880vN;
import X.C26118Csg;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState A00;
    public final C26118Csg A01;
    public final SidecarInterface.SidecarCallback A02;
    public final Object A03 = C17880vN.A0p();
    public final Map A04 = new WeakHashMap();

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.A03) {
                if (!C26118Csg.A00(this.A00, sidecarDeviceState)) {
                    this.A00 = sidecarDeviceState;
                    this.A02.onDeviceStateChanged(sidecarDeviceState);
                }
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.A03) {
            Map map = this.A04;
            if (!this.A01.A02((SidecarWindowLayoutInfo) map.get(iBinder), sidecarWindowLayoutInfo)) {
                map.put(iBinder, sidecarWindowLayoutInfo);
                this.A02.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    public DistinctElementSidecarCallback(C26118Csg csg, SidecarInterface.SidecarCallback sidecarCallback) {
        this.A01 = csg;
        this.A02 = sidecarCallback;
    }
}
