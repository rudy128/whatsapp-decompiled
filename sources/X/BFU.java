package X;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1;
import com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1;

public final class BFU extends MediaProjection.Callback {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C24155BwL A01;

    public BFU(Context context, C24155BwL bwL) {
        this.A01 = bwL;
        this.A00 = context;
    }

    public void onCapturedContentResize(int i, int i2) {
        C24155BwL bwL = this.A01;
        C25791Cm3 cm3 = bwL.A04;
        if (i != cm3.A02 || i2 != cm3.A01) {
            Context context = this.A00;
            if (i % 2 != 0) {
                i--;
            }
            if (i2 % 2 != 0) {
                i2--;
            }
            AnonymousClass3MX.A1Q(new ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(bwL, new C25791Cm3(i, i2, C108965cb.A08(context).densityDpi), (C30391dr) null), AnonymousClass1OW.A02(bwL.A0D));
        }
    }

    public void onStop() {
        C24155BwL bwL = this.A01;
        bwL.A06 = true;
        bwL.A0C.clearMediaProjectionHandle();
        bwL.A0B.A02(AnonymousClass6RY.OTHER);
        VirtualDisplay virtualDisplay = bwL.A01;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        bwL.A01 = null;
        bwL.stopPeriodicCameraCallbackCheck();
        AnonymousClass3MX.A1Q(new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(bwL, (C30391dr) null), AnonymousClass1OW.A02(bwL.A0D));
    }
}
