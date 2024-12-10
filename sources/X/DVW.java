package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

public class DVW implements Callable {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public DVW(VoipPhysicalCamera voipPhysicalCamera, int i, boolean z) {
        this.A00 = i;
        this.A01 = voipPhysicalCamera;
        this.A02 = z;
    }

    public final Object call() {
        int i = this.A00;
        VoipPhysicalCamera voipPhysicalCamera = (VoipPhysicalCamera) this.A01;
        boolean z = this.A02;
        if (i != 0) {
            return Integer.valueOf(voipPhysicalCamera.toggleCameraProcessorOnCameraThread(z));
        }
        return voipPhysicalCamera.m73lambda$close$5$comwhatsappvoipcallingcameraVoipPhysicalCamera(z);
    }
}
