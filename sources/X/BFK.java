package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Arrays;

public class BFK extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ Surface A01;
    public final /* synthetic */ C24156BwM A02;
    public final /* synthetic */ Runnable A03;

    public BFK(CaptureRequest.Builder builder, Surface surface, C24156BwM bwM, Runnable runnable) {
        this.A02 = bwM;
        this.A01 = surface;
        this.A00 = builder;
        this.A03 = runnable;
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.A03.run();
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C24156BwM bwM = this.A02;
        bwM.A06 = false;
        Surface surface = this.A01;
        if (!(surface == null || surface == bwM.A02)) {
            surface.release();
        }
        if (bwM.A01 == null) {
            Log.i("voip/video/VoipCamera/ cameraDevice configured, but device is null");
            bwM.cameraEventsDispatcher.A02();
            return;
        }
        Log.i("voip/video/VoipCamera/ cameraDevice configured");
        CaptureRequest.Builder builder = this.A00;
        BE7.A14(builder, CaptureRequest.CONTROL_MODE, 1);
        BE7.A14(builder, CaptureRequest.CONTROL_AF_MODE, 3);
        BE7.A14(builder, CaptureRequest.FLASH_MODE, 0);
        Range[] rangeArr = (Range[]) bwM.A0B.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            int i = Integer.MIN_VALUE;
            Range range = null;
            for (Range range2 : rangeArr) {
                int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(AnonymousClass000.A0M(range2.getLower()) * 1000, AnonymousClass000.A0M(range2.getUpper()) * 1000, bwM.A0C.fps1000);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("voip/video/VoipCamera/startOnCameraThread check fps [");
                A10.append(range2.getLower());
                A10.append(", ");
                A10.append(range2.getUpper());
                C17900vP.A0j("], score: ", A10, fpsRangeScore);
                if (fpsRangeScore > i) {
                    range = range2;
                    i = fpsRangeScore;
                }
            }
            if (range != null) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("voip/video/VoipCamera/startOnCameraThread with fps range [");
                A102.append(range.getLower());
                A102.append(", ");
                A102.append(range.getUpper());
                A102.append("], score: ");
                A102.append(i);
                A102.append(", supported ranges : ");
                C17890vO.A1A(A102, Arrays.toString(rangeArr));
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            }
        }
        try {
            cameraCaptureSession.setRepeatingRequest(builder.build(), (CameraCaptureSession.CaptureCallback) null, bwM.cameraThreadHandler);
            bwM.startPeriodicCameraCallbackCheck();
        } catch (CameraAccessException unused) {
            Log.i("voip/video/VoipCamera/ failed to start preview");
            bwM.cameraEventsDispatcher.A02();
        }
    }
}
