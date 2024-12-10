package X;

import android.os.HandlerThread;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

/* renamed from: X.8Co  reason: invalid class name and case insensitive filesystem */
public class C161288Co extends HandlerThread {
    public final /* synthetic */ VoipCameraManager A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161288Co(VoipCameraManager voipCameraManager) {
        super("VoipCameraThread");
        this.A00 = voipCameraManager;
    }

    public void run() {
        Log.i("voip/video/VoipCamera/CameraThread Start");
        super.run();
        Log.i("voip/video/VoipCamera/CameraThread Exit");
    }
}
