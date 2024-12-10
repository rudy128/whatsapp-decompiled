package X;

import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

public final class AA7 implements DisplayManager.DisplayListener {
    public final /* synthetic */ C188239h6 A00;

    public void onDisplayAdded(int i) {
    }

    public void onDisplayRemoved(int i) {
    }

    public AA7(C188239h6 r1) {
        this.A00 = r1;
    }

    public void onDisplayChanged(int i) {
        C188239h6 r4 = this.A00;
        DisplayManager displayManager = r4.A02;
        if (displayManager != null) {
            Display display = displayManager.getDisplay(0);
            Point point = new Point();
            display.getRealSize(point);
            boolean A1S = AnonymousClass000.A1S(r4.A00, display.getRotation());
            boolean A1T = AnonymousClass8BR.A1T(r4.A01, point);
            if (A1S || A1T) {
                r4.A00 = display.getRotation();
                if (A1S || r4.A01 != null) {
                    AnonymousClass9Z3 r0 = r4.A03;
                    if (r0 != null) {
                        r0.A00.m48lambda$registerDisplayListener$0$comwhatsappvoipcallingcameraVoipCameraManager();
                    }
                    if (A1S) {
                        if (C18020vd.A05(C18040vf.A02, r4.A07, 4773)) {
                            AnonymousClass1HQ r02 = r4.A06;
                            int i2 = r4.A00;
                            if (AnonymousClass1HR.A00((AnonymousClass1HR) r02)) {
                                Log.i("VoipNative/videoDeviceAndDisplayOrientationChanged skipping as call ended or ending");
                            } else {
                                Voip.videoDeviceAndDisplayOrientationChanged(i2, i2, false);
                            }
                        }
                    }
                }
                r4.A01 = point;
            }
        }
    }
}
