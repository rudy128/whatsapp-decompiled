package X;

import android.graphics.Point;
import android.os.HandlerThread;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;

/* renamed from: X.BwK  reason: case insensitive filesystem */
public class C24154BwK extends VoipPhysicalCamera {
    public boolean A00 = false;
    public final VoipPhysicalCamera.CameraInfo A01;

    public C24154BwK(C18030ve r15, AnonymousClass1DC r16, int i, int i2, int i3, int i4, int i5) {
        super(r15, r16, (AnonymousClass00H) null, (AnonymousClass00H) null, (HandlerThread) null);
        this.A01 = new VoipPhysicalCamera.CameraInfo(i2, i3, i4, i5, true, 0, i);
    }

    public boolean canBindToCameraProcessor() {
        return false;
    }

    public void closeOnCameraThread() {
        this.A00 = false;
        this.cameraEventsDispatcher.A00();
    }

    public Point getAdjustedPreviewSize() {
        return new Point(0, 0);
    }

    public int getCameraStartMode() {
        return 0;
    }

    public C187819gQ getLastCachedFrame() {
        return null;
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return 0;
    }

    public boolean hasLastCachedFrame() {
        return false;
    }

    public void onFrameAvailableOnCameraThread() {
    }

    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        return 0;
    }

    public int startOnCameraThread() {
        this.A00 = true;
        this.cameraEventsDispatcher.A01();
        return 0;
    }

    public int stopOnCameraThread() {
        this.A00 = false;
        return 0;
    }

    public int toggleCameraProcessorOnCameraThread(boolean z) {
        return -15;
    }

    public void updatePreviewOrientation() {
    }

    public VoipPhysicalCamera.CameraInfo getCameraInfo() {
        return this.A01;
    }

    public boolean isCameraOpen() {
        return this.A00;
    }
}
