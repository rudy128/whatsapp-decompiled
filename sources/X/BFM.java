package X;

import android.hardware.camera2.CameraDevice;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class BFM extends CameraDevice.StateCallback {
    public final /* synthetic */ C24156BwM A00;

    public BFM(C24156BwM bwM) {
        this.A00 = bwM;
    }

    public void onClosed(CameraDevice cameraDevice) {
        C24156BwM bwM = this.A00;
        bwM.A00 = 0;
        Log.i("voip/video/VoipCamera/ cameraDevice closed");
        if (bwM.A05) {
            bwM.A05 = false;
            if (bwM.startOnCameraThread() != 0) {
                bwM.cameraEventsDispatcher.A02();
            }
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        C24156BwM bwM = this.A00;
        if (cameraDevice == bwM.A01) {
            Log.i("voip/video/VoipCamera/ cameraDevice disconnected");
            bwM.stopPeriodicCameraCallbackCheck();
            Iterator it = bwM.cameraEventsDispatcher.A00.iterator();
            while (it.hasNext()) {
                ((C28608E9z) it.next()).BtT();
            }
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        Log.i("voip/video/VoipCamera/ camera opened");
        C24156BwM bwM = this.A00;
        bwM.A00 = 2;
        bwM.A01 = cameraDevice;
        if (bwM.videoPort != null) {
            int A002 = C24156BwM.A00(bwM);
            C25180CaW caW = bwM.cameraEventsDispatcher;
            if (A002 != 0) {
                caW.A02();
            } else {
                caW.A01();
            }
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        C17900vP.A0j("voip/video/VoipCamera/ cameraDevice error ", AnonymousClass000.A10(), i);
        this.A00.cameraEventsDispatcher.A02();
    }
}
